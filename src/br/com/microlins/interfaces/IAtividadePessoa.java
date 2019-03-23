package br.com.microlins.interfaces;

import java.util.List;

import br.com.microlins.Atividade;
import br.com.microlins.Pessoa;

public interface IAtividadePessoa {

	/**
	 * Registra uma atividade
	 * @param atividade
	 * @return
	 * 	Gravado com sucesso ou não (true or false)
	 */
	boolean gravarAtividade(Atividade atividade);
	
	/**
	 * Recupera a lista de atividades da pessoa
	 * @param pessoa
	 * @return 
	 * 	Retorna uma lista com todas as atividades feitas por uma pessoa
	 */
	List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa);
	
	/**
	 * Recupera a atividade mais recente que a pessoa fez
	 * @param pessoa
	 * @return
	 * 	Retorna a atividade
	 */
	Atividade recuperarUltimaAtividadePessoa(Pessoa pessoa);
	
	/**
	 * Remove uma atividade feita
	 * @param atividade
	 * @return
	 */
	boolean removerAtividade(Atividade atividade);
	
	/**
	 * Retorna a quantidade de atividades que uma pessoa fez
	 * @param pessoa
	 * @return
	 */
	int quantidadeAtividadesRealizadasPorPessoa(Pessoa pessoa);
	
	/**
	 * Retorna a quantidade de todas as atividades feitas no sistema
	 * @return
	 */
	int totalAtividades();
	
	/**
	 * Limpa a lista
	 */
	void limparLista();
	
	/**
	 * Consulta a ultima atividade inserida
	 * @return
	 */
	Atividade consultarUltimaAtividadeRealizada();
	
}
