package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.RequestDispatcher;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import modelo.Cidade;
import modelo.Cidades;


@WebServlet("/InpeWS")
public class InpeWS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InpeWS() {
        super();       
    }

	private void processarRequisicao(HttpServletRequest request,
			HttpServletResponse response) {

		String acao = request.getParameter("acao");

		if (acao == null) {
			listarCidades(request, response);
		} else if (acao.equals("previsao")) {
			previsaoCidade(request, response);
		} 
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processarRequisicao(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	private void previsaoCidade(HttpServletRequest request,
			HttpServletResponse response) {
		String codigoCidade = request.getParameter("codigo");

		try {

			URL url = new URL("http://servicos.cptec.inpe.br/XML/cidade/"+codigoCidade+"/previsao.xml");
		
			JAXBContext context = JAXBContext.newInstance(Cidade.class);
			Unmarshaller um = context.createUnmarshaller();
		
			Cidade cidade = (Cidade) um.unmarshal(url);
			
			RequestDispatcher rd = request.getRequestDispatcher("previsao.jsp");

			request.setAttribute("cidade", cidade);

			rd.forward(request, response);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} 
		
	}

	
	
	private void listarCidades(HttpServletRequest request,
			HttpServletResponse response) {
		
		try {
			URL url = new URL("http://servicos.cptec.inpe.br/XML/listaCidades");

			JAXBContext context = JAXBContext.newInstance(Cidades.class);
			Unmarshaller um = context.createUnmarshaller();
			Cidades cidades = (Cidades) um.unmarshal(url);			
			
			RequestDispatcher rd = request.getRequestDispatcher("lista_localidades.jsp");

			request.setAttribute("cidades_inpe", cidades);

			rd.forward(request, response);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
