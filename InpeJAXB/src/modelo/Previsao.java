package modelo;

import java.util.Date;


public class Previsao {
	
	private Date dia;
	private String tempo;
	private float maxima;
	private float minima;
	private float iuv;
	
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public float getMaxima() {
		return maxima;
	}
	public void setMaxima(float maxima) {
		this.maxima = maxima;
	}
	public float getMinima() {
		return minima;
	}
	public void setMinima(float minima) {
		this.minima = minima;
	}
	public float getIuv() {
		return iuv;
	}
	public void setIuv(float iuv) {
		this.iuv = iuv;
	}	
}
