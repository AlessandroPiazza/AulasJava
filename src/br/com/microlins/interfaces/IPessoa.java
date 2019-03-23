package br.com.microlins.interfaces;

public interface IPessoa {

	/**
	 * Exibe os dados da pessoa
	 * @return
	 * 	Exibe todos os dados e também o IMC
	 */
	
	String exibirDados();
	
	/**
	 * Calcula o imc da pessoa
	 * @return
	 * 	Retorna o calculo do imc
	 * 	IMC = MASSA / (ALTURA * ALTURA)
	 */
	double calculaImc();
	
}
