package br.com.microlins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import br.com.microlins.interfaces.IAtividadePessoa;

public class AtividadePessoa implements IAtividadePessoa{
	private List<Pessoa> listaPessoa = new ArrayList<>();
	private List<Atividade> listaAtividade = new ArrayList<>();
	private Iterator<Atividade> iteratorLista = null;

	@Override
	public boolean gravarAtividade(Atividade atividade) {
		atividade = new Atividade();
		return listaAtividade.add(atividade);
	}
	
	
	@Override
	public List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa) {
		List<Atividade> listaAtividade1 = new ArrayList<>();
		iteratorLista = listaAtividade.iterator();
		int i = 0;
		while(iteratorLista.hasNext()) {
			i++;
			Pessoa pessoa2 = pessoa;
			if(listaAtividade.contains(pessoa2)) {
				System.out.println(listaAtividade.get(i));
			}
		}

		return listaAtividade1;
	}

	@Override
	public Atividade recuperarUltimaAtividadePessoa(Pessoa pessoa) {
		int ultimo = listaAtividade.lastIndexOf(pessoa);
		return listaAtividade.get(ultimo);
	}

	@Override
	public boolean removerAtividade(Atividade atividade) {
		return listaAtividade.remove(atividade);
	}

	@Override
	public int quantidadeAtividadesRealizadasPorPessoa(Pessoa pessoa) {
		int cont = 0;
	
		iteratorLista = listaAtividade.iterator();
		while(iteratorLista.hasNext()) {
			
			if(listaAtividade.contains(pessoa));
			cont ++;
		}
		return cont;
	}

	@Override
	public int totalAtividades() {
		return listaAtividade.size();
	}

	@Override
	public void limparLista() {
		listaAtividade.clear();
	}

	@Override
	public Atividade consultarUltimaAtividadeRealizada() {
		return listaAtividade.get(listaAtividade.size());
	}

}
