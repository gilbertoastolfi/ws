package cliente;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cliente.clube.Clube;
import cliente.clube.Jogador;
import cliente.clube.SEIClube;

public class ClubeCliente {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:8087/clubes?wsdl");
		 
        QName qname = new QName("http://servico/", "SIBClubeImplService");
 
        Service service = Service.create(url, qname);
 
        SEIClube sei = service.getPort(SEIClube.class);
 
        List<Clube> clubes = sei.getClubes();
        
        for(Clube c: clubes){
        	System.out.println("\nClube -> " + c.getId() + " | " + c.getNome());

        	for(Jogador j : c.getJogadores()){
        		System.out.println("\t jogador -> " + j.getId() + " | " + j.getNome() + " | " + j.getPosicao());
        	}
        }
        
        System.out.println("\n--------------------- ");
        System.out.println("Buscando um clube...");
        
        Clube clube = sei.getClube("São Paulo Futebol Clube");

        System.out.println("Clube -> " + clube.getId() + " | " + clube.getNome());
        for(Jogador j : clube.getJogadores()){
    		System.out.println("\t jogador -> " + j.getId() + " | " + j.getNome() + " | " + j.getPosicao());
    	}
	}

}
