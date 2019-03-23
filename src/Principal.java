import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		
		// ArrayList
		List<String> lista = new ArrayList<>();
		//ctrl + shit + o -> importa dependencias
		
		lista.add("Java");
		lista.add(1, "Python");
		lista.add("PHP");
		
		
		System.out.println(lista.contains("Java"));
		
		lista.equals(new ArrayList<String>());
		

		Iterator iteratorLista = lista.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		String livroPython = lista.get(1);
		
		lista.isEmpty(); // esta vazio
		lista.remove(2);
		
		lista.size(); // tamanho
		
		iteratorLista = lista.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		
		// LinkedList
		lista = new LinkedList<>();
		
		lista.add("Java");
		lista.add(1, "Python");
		lista.add("PHP");
		
		
		System.out.println(lista.contains("Java"));
		
		lista.equals(new ArrayList<String>());
		

		iteratorLista = lista.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		livroPython = lista.get(1);
		
		lista.isEmpty(); // esta vazio
		lista.remove(2);
		
		lista.size(); // tamanho
		
		iteratorLista = lista.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		// Vector
		System.out.println("Vector --");
		lista = new Vector<String>();
		
		
		//LinkedList - Queue
		Queue<String> fila = new LinkedList<String>();
		fila.add("Veja");
		fila.add("Abril");
		fila.add("Fechou");
		
		
		System.out.println(fila.peek()); // consulta o primeiro que vai sair
		System.out.println();
		
		
		
		iteratorLista = fila.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		System.out.println();
		System.out.println(fila.poll()); // consulta e remove o primeiro que vai sair
		System.out.println();
		
		iteratorLista = fila.iterator();
		while(iteratorLista.hasNext())
			System.out.println(iteratorLista.next());
		
		System.out.println();
		
		// PriorityQueue
		fila = new PriorityQueue<String>();
		// mesma coisa do LinkedList
		
		// Stack
		Stack<String> stackFila = new Stack<>();
		stackFila.push("Corsa"); //adiciona por ultimo
		stackFila.push("Fox");
		
		stackFila.peek();
		stackFila.pop(); // igual ao poll da LinkedList e PriorityQueue
		
		
	}
	
}
