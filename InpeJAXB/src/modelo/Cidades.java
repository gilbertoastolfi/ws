package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cidades")
public class Cidades {

	private List<Cidade> cidade = new ArrayList<Cidade>();

	public List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
	
	
}
