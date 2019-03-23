package br.com.microlins;

import java.util.ArrayList;
import java.util.List;

import br.com.microlins.interfaces.IFila;

public class FilaImplementacaoGenerics<E> implements IFila<E> {
	
	private List<E> lista = new ArrayList<E>();
	private Object primeiro;
	@Override
	public E pegarPrimeiro() {
		primeiro = lista.get(0);
		lista.remove(0);
		return (E) primeiro;
	}

	@Override
	public E consultarPrimeiro() {
		primeiro = lista.get(0);
		return (E) primeiro;
	}

	@Override
	public void adicionar(Object parametro) {
		lista.add((E) parametro);
		
	}

	@Override
	public void remover(Object parametro) {
		lista.remove((E) parametro);
		
	}

	@Override
	public int quantidadeItens() {
		return lista.size();
	}

	@Override
	public E elementoNaPosicao(int posicao) {
		return lista.get(posicao);
	}

}
