package br.com.ws.crud.jaxws.cliente;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.ws.crud.jaxws.servico.Noticia;
import br.com.ws.crud.jaxws.servico.SEINoticia;
import br.com.ws.crud.jaxws.cliente.utils.Conexao;

public class Consumidora {

	private static Scanner in = new Scanner(System.in);
	private static SEINoticia seiNoticia = Conexao.getConnection();

	public static void main(String[] args) {

		int opcao = 0;

		do {
			System.out.println("<1> - criar\n" + 
							   "<2> - alterar\n" + 
					           "<3> - remover\n" + 
							   "<4> - buscar uma notícia\n" + 
					           "<5> - buscar todas as notícia\n" + 
							   "<0> - sair\n");
			System.out.println("Escolha a opção: ");
			opcao = in.nextInt();

			switch (opcao) {
			case 1: 
				criar();
				break;
			case 2: 
				alterar();
				break;				
			case 3: 
				remover();
				break;
			case 4: 
				ler();
				break;
			case 5: 
				listar();
				break;

			default:
				break;
			}

		} while (opcao != 0);
	}

	private static void criar() {
		Noticia noticia = new Noticia();
		System.out.println("Digite o título da notícia: ");
		String titulo = in.next();
		noticia.setTitulo(titulo);
		System.out.println("Digite o texto da notícia: ");
		String texto = in.next();
		noticia.setTexto(texto);
		noticia.setData(gerarData());		
		
		if(seiNoticia.criar(noticia)){
			System.out.println("Enviado ao serviço com sucesso");
		} else {
			System.out.println("Problemas ao enviar ao serviço");
		}
	}
	
	private static void alterar() {
		Noticia noticia = new Noticia();
		System.out.println("Digite o id da notícia: ");
		int id = in.nextInt();
		noticia.setId(id);
		System.out.println("Digite o título da notícia: ");
		String titulo = in.next();
		noticia.setTitulo(titulo);
		System.out.println("Digite o texto da notícia: ");
		String texto = in.next();
		noticia.setTexto(texto);
		noticia.setData(gerarData());		
		
		if(seiNoticia.alterar(noticia)){
			System.out.println("Enviado ao serviço com sucesso");
		} else {
			System.out.println("Problemas ao enviar ao serviço");
		}
	}
	
	private static void remover() {
		Noticia noticia = new Noticia();
		System.out.println("Digite o id da notícia: ");
		int id = in.nextInt();
		noticia.setId(id);
		
		if(seiNoticia.deletar(noticia)){
			System.out.println("Enviado ao serviço com sucesso");
		} else {
			System.out.println("Operação não executada");
		}
	}
	
	private static void ler() {
		System.out.println("Digite o id da notícia: ");
		int id = in.nextInt();
		
		Noticia noticia = seiNoticia.ler(id);
		
		if(noticia != null){
			System.out.println("Enviado ao serviço com sucesso");
			System.out.println("id -> " + noticia.getId());
			System.out.println("título -> " + noticia.getTitulo());
			System.out.println("texto -> " + noticia.getTexto());
			System.out.println("data -> " + noticia.getData());
		} else {
			System.out.println("Operação não executada");
		}
	}
	
	private static void listar() {
		List<Noticia> noticias = seiNoticia.listar();
		
		if(noticias != null){
			
			for(Noticia noticia: noticias){			
				System.out.println("Enviado ao serviço com sucesso");
				System.out.println("id -> " + noticia.getId());
				System.out.println("título -> " + noticia.getTitulo());
				System.out.println("texto -> " + noticia.getTexto());
				System.out.println("data -> " + noticia.getData() +"\n");
			}
		} else {
			System.out.println("Problemas ao enviar ao serviço");
		}
	}
	
	private static XMLGregorianCalendar gerarData(){
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		
		try {
			return DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}		
		return null;
	}

}
