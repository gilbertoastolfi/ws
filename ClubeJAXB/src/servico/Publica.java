package servico;

import javax.xml.ws.Endpoint;

public class Publica {

	public static void main(String[] args) {
		String porta = "8087";
		System.out.println("Publicando o serviço clubes na porta: " + porta);
		Endpoint.publish("http://localhost:"+porta+"/clubes", 
				new SIBClubeImpl());
		System.out.println("Serviço clubes publicado na porta: " + porta);
	}
}
