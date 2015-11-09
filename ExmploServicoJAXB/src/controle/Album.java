package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.AlbumList;
import modelo.Compositor;
import modelo.Musica;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


@WebServlet("/Album")
public class Album extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Album() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<modelo.Album> albuns = new ArrayList<modelo.Album>();
		albuns = addAlbuns(2); // somente dois albuns serão gerados
		
		// cria a lista de albuns
		AlbumList albumList = new AlbumList();
		albumList.setAlbuns(albuns);
		
		JAXBContext context;

		try {
			context = JAXBContext.newInstance(AlbumList.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(albumList, baos);

			response.setContentType("text/xml;charset=UTF-8");

			try {
				PrintWriter out = response.getWriter();
				out.print(baos);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	
	/* Os métodos abaixo simulam um banco de dados */
	
	private List<modelo.Album> addAlbuns(int quantidade){
		
		modelo.Album album = null;
		List<modelo.Album> albuns = new ArrayList<modelo.Album>();
		List<Musica> musicas = null;
		
		for (int i = 0; i < quantidade; i++) {
			album = new modelo.Album();
			album.setId(i+1);
			album.setNome("Album " + (i + 1));
			
			musicas = new ArrayList<Musica>();
			for (int j = 0; j < 4; j++) {
				musicas.add(addMusica()); // três músicas por album
			}			
			album.setMusicas(musicas);
			albuns.add(album);
			
		}
		
		return albuns;
	}
	
	private Musica addMusica(){
		
		Musica musica = new Musica();
		int id = 0;
		musica.setId(++id);
		musica.setDuracao(id * 1.5);
		musica.setTitulo("Musica " + id);
		
		List<Compositor> compositores = new ArrayList<Compositor>();
		
		for (int i = 0; i < 2; i++) { // dois compositores por música
			compositores.add(addCompositor(i));
		}
		
		musica.setCompositores(compositores);
		
		return musica;
	}
	
	private Compositor addCompositor(int id){
		
		Compositor compositor = new Compositor();
		compositor.setId(id + 1);
		compositor.setNome("Compositor " + id);
		
		return compositor;
	}

}
