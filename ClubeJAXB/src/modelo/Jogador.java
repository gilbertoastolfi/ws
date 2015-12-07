package modelo;

public class Jogador {

	private int id;
	private String nome;
	private String posicao;
	
	public Jogador() {
		super();
	}
	
	public Jogador(int id, String nome, String posicao) {
		super();
		this.id = id;
		this.nome = nome;
		this.posicao = posicao;
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
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}	
}
