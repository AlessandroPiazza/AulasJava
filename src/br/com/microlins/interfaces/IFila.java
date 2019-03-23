package br.com.microlins.interfaces;

public interface IFila<E> {
	
	E pegarPrimeiro();
	E consultarPrimeiro();
	void adicionar(E parametro);
	void remover(E parametro);
	int quantidadeItens();
	E elementoNaPosicao(int posicao);
	
}
