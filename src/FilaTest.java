import br.com.microlins.FilaImplementacaoGenerics;
import br.com.microlins.interfaces.IFila;

public class FilaTest {

	public static void main(String[] args) {
		
		IFila<String> fila = new FilaImplementacaoGenerics<String>(); // substituir o null pela sua implementação
		
		fila.adicionar("Rafael");
		fila.adicionar("Enrico");
		fila.adicionar("Daniel");
		fila.adicionar("Alessandro");
		fila.adicionar("Roberto");
		fila.adicionar("Renato");
		
		System.out.println(fila.quantidadeItens() == 6);
		
		System.out.println(fila.elementoNaPosicao(0).equals("Rafael"));
		
		System.out.println(fila.pegarPrimeiro().equals("Rafael"));
		
		System.out.println(fila.pegarPrimeiro().equals("Enrico"));

		fila.remover("Rafael");
		
		System.out.println(fila.consultarPrimeiro().equals("Daniel"));
		
		System.out.println(fila.quantidadeItens() == 4);
		
		IFila<Integer> filaNumeros =  new FilaImplementacaoGenerics<Integer>(); // substituir o null pela sua implementação
		
		filaNumeros.adicionar(100);
		filaNumeros.adicionar(200);
		filaNumeros.adicionar(300);
		filaNumeros.adicionar(400);
		filaNumeros.adicionar(500);
		filaNumeros.adicionar(600);
		
		System.out.println(filaNumeros.quantidadeItens() == 6);
		
		System.out.println(filaNumeros.elementoNaPosicao(0).equals(100));
		
		System.out.println(filaNumeros.pegarPrimeiro().equals(100));
		
		System.out.println(filaNumeros.pegarPrimeiro().equals(200));

		filaNumeros.remover(300);
		
		System.out.println(filaNumeros.consultarPrimeiro().equals(400));
		
		System.out.println(filaNumeros.quantidadeItens() == 3);		
		
	}
	
}
