package br.com.microlins.interfaces;

import java.util.List;

import br.com.microlins.Atividade;
import br.com.microlins.Pessoa;

public interface IAtividadePessoa {

	boolean gravarAtividade(Atividade atividade);

	List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa);

	Atividade recuperarUltimaAtividadePessoa(Pessoa pessoa);

	boolean removerAtividade(Atividade atividade);

	int quantidadeAtividadesRealizadasPorPessoa(Pessoa pessoa);

	int totalAtividades();

	void limparLista();

	Atividade consultarUltimaAtividadeRealizada();

}
