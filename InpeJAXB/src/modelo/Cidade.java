package modelo;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cidade")
public class Cidade {

	private int id;
	private String nome;
	private String uf;
	private Date atualizacao;
	private ArrayList<Previsao> previsao;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Previsao> getPrevisao() {
		return previsao;
	}
	public void setPrevisao(ArrayList<Previsao> previsao) {
		this.previsao = previsao;
	}
	public Date getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(Date atualizacao) {
		this.atualizacao = atualizacao;
	}
	
	
}
