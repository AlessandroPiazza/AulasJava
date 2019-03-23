package br.com.microlins.interfaces;

public interface IPilhaString {

	String pegarPrimeiro();
	String consultarPrimeiro();
	void adicionar(String parametro);
	void remover(String parametro);
	int quantidadeItens();
	String elementoNaPosicao(int posicao);
	
}