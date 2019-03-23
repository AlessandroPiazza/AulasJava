package br.com.microlins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.microlins.interfaces.IFilaString;

public class FilaStringImplementacao implements IFilaString {

	private List<String> lista = new ArrayList<>();
	private Iterator iteratorLista = lista.iterator();
	private String primeiro;

	@Override
	public String pegarPrimeiro() {
		primeiro = lista.get(0).toString();
		lista.remove(0);

		return primeiro;
	}

	@Override
	public String consultarPrimeiro() {

		return lista.get(0).toString();
	}

	@Override
	public void adicionar(String parametro) {
		lista.add(parametro);
	}

	@Override
	public void remover(String parametro) {
		lista.remove(parametro);
	}

	@Override
	public int quantidadeItens() {
		return lista.size();
	}

	@Override
	public String elementoNaPosicao(int posicao) {
		return lista.get(posicao);
	}

}
