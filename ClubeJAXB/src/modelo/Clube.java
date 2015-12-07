package modelo;

import java.util.List;

public class Clube {

	private int id;
	private String nome;
	private List<Jogador> jogadores;
	
	
	public Clube() {
		super();
	}
	
	public Clube(int id, String nome, List<Jogador> jogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.jogadores = jogadores;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
}
