package br.com.ws.crud.jaxws.cliente.utils;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.ws.crud.jaxws.servico.SEINoticia;

public class Conexao {

	private static final SEINoticia sei = construirConexao();

	private static SEINoticia construirConexao() {
		try {			
			URL url = new URL("http://localhost:8089/noticias?wsdl");
			 
	        QName qname = new QName("http://servico.jaxws.crud.ws.com.br/", "SIBNoticiaService");
	 
	        Service service = Service.create(url, qname);
	        
	        return service.getPort(SEINoticia.class);

		} catch (Exception ex) {
			System.err.println("Problemas ao conectar no serviço: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public static SEINoticia getConnection() {
		return sei;
	}
}
