package br.com.ws.crud.jersey.servico;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import br.com.ws.crud.jersey.dao.NoticiaDao;
import br.com.ws.crud.jersey.modelo.Noticia;

@Path("/noticia")
public class NoticiaService {
	
	@Context UriInfo uriInfo;
	
	@GET
	@Path("/noticias")
	@Produces(MediaType.TEXT_XML)
	public List<Noticia> listar() throws SQLException {
		NoticiaDao dao = new NoticiaDao();
		List<Noticia> noticias = dao.listar();
		return noticias;
	}
	
	@POST
    @Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
    public Response criar(JAXBElement<Noticia>  dado) { 

		Noticia noticia = dado.getValue();
		NoticiaDao dao = new NoticiaDao();
			
		try {
			int idNovoRecurso = dao.criar(noticia);			
			String novoRecurso = uriInfo.getPath() + "/" + idNovoRecurso;
			URI uri = new URI(novoRecurso) ;				
			return Response.created(uri).build();				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}		
		return Response.serverError().build();
    } 
	
	@PUT
    @Path("/{codigo}")
    @Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
    public Response alterar(@PathParam("codigo") int codigo, 
    		                     JAXBElement<Noticia>  dado) { 

		Noticia noticia = dado.getValue();
		noticia.setId(codigo);
		NoticiaDao dao = new NoticiaDao();			
		try {			
			Noticia novaNoticia = dao.alterar(noticia);		
			return Response.ok(novaNoticia).build();				
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return Response.serverError().build();
    } 
	
	@GET
    @Path("/{codigo}")
	@Produces(MediaType.TEXT_XML)
    public Response noticia(@PathParam("codigo") int codigo) { 

		NoticiaDao dao = new NoticiaDao();		
		try {			
			Noticia noticia = dao.ler(codigo);		
			return Response.ok(noticia).build();				
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return Response.serverError().build();
    } 
	
	@DELETE
    @Path("/{codigo}")
    public Response apagar(@PathParam("codigo") int codigo) { 

		NoticiaDao dao = new NoticiaDao();	
		try {			
			dao.deletar(codigo);
			return Response.noContent().build();				
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return Response.serverError().build();
    } 

}
