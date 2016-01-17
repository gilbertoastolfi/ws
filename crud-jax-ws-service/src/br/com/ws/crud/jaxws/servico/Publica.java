package br.com.ws.crud.jaxws.servico;

import javax.xml.ws.Endpoint;

public class Publica {

	public static void main(String[] args) {
		
		String porta = "8089";
		System.out.println("Publicando o serviço na porta: " + porta);
		Endpoint.publish("http://localhost:"+porta+"/noticias", 
				new SIBNoticia());
		System.out.println("Serviço publicado na porta: " + porta);		
	}
}
