package br.edu.iff.jogoforca.dominio.jogador.embdr;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.repository.RepositoryException;

public class BDRJogadorRepository implements JogadorRepository {

	private static BDRJogadorRepository soleInstance;
	
	public static BDRJogadorRepository getSoleInstance() {
		if(soleInstance==null) {
			soleInstance = new BDRJogadorRepository();
		}
		return soleInstance;
	}
	
	private BDRJogadorRepository() {
		
	}

	@Override
	public long getProximoId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Jogador getPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogador[] getPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}
	
}
