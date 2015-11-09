package modelo;

import java.util.List;

public class Musica {
	
	private int id;
	private String titulo;
	private double duracao;
	
	private List<Compositor> compositores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public List<Compositor> getCompositores() {
		return compositores;
	}

	public void setCompositores(List<Compositor> compositores) {
		this.compositores = compositores;
	}
}
