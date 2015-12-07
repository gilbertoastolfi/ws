package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import modelo.Clube;
import modelo.Jogador;

@WebService(endpointInterface = "servico.SEIClube")
public class SIBClubeImpl implements SEIClube {

	private List<Clube> clubes;

	public SIBClubeImpl() {
		this.clubes = new ArrayList<Clube>();
		this.clubes = recuperarClubes();
	}

	@Override
	public Clube getClube(String nome) {

		for(Clube c: this.clubes){
			if(c.getNome().equalsIgnoreCase(nome));
				return c;
		}
		
		return null;
	}

	@Override
	public List<Clube> getClubes() {

		return this.clubes;
	}

	private List<Clube> recuperarClubes() {
		
		List<Clube> cls = new ArrayList<Clube>();

		// composição do time 1 com seus respectivos jogadores
		Jogador jsp1 = new Jogador(1, "Rogério Ceni", "Goleiro");
		Jogador jsp2 = new Jogador(2, "PH Ganso", "Meia");

		List<Jogador> jogadoresSaoPaulo = new ArrayList<Jogador>();
		jogadoresSaoPaulo.add(jsp1);
		jogadoresSaoPaulo.add(jsp2);
		Clube saoPaulo = new Clube(1, "São Paulo Futebol Clube", jogadoresSaoPaulo);

		// composição do time 2 com seus respectivos jogadores
		Jogador jsan1 = new Jogador(3, "Gabriel", "Atacante");
		Jogador jsan2 = new Jogador(4, "Lucas Lima", "Meia");

		List<Jogador> jogadoresSantos = new ArrayList<Jogador>();
		jogadoresSantos.add(jsan1);
		jogadoresSantos.add(jsan2);
		Clube santos = new Clube(2, "Santos Futebol Clube",	jogadoresSantos);

		cls.add(saoPaulo);
		cls.add(santos);

		return cls;
	}

}
