package br.com.microlins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import br.com.microlins.interfaces.IAtividadePessoa;

public class AtividadePessoaA implements IAtividadePessoa{
	private List<Pessoa> listaPessoa = new ArrayList<>();
	private List<Atividade> listaAtividade = new ArrayList<>();
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}


	public void setListaAtividade(List<Atividade> listaAtividade) {
		this.listaAtividade = listaAtividade;
	}

	private Iterator<Atividade> iteratorLista = null;

	@Override
	public boolean gravarAtividade(Atividade atividade) {
		atividade = new Atividade();
		return listaAtividade.add(atividade);
	}
	
	public boolean gravarPessoa(Pessoa pessoa) {
		pessoa = new Pessoa();
		return listaPessoa.add(pessoa);
	}
	
	public List<Pessoa> getListaPessoa() {
		return listaPessoa;
	}


	public void setListaPessoa(List<Pessoa> listaPessoa) {
		this.listaPessoa = listaPessoa;
	}


	@Override
	public List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa) {
		List<Atividade> listaAtividade1 = new ArrayList<>();
		iteratorLista = listaAtividade.iterator();
		while(iteratorLista.hasNext()) {
		
			if(listaAtividade.contains(pessoa)) {
				listaAtividade1.add(listaAtividade.get(1));
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
