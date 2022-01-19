package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<String>();
		
		listaDuplamenteEncadeada.add("A1");
		listaDuplamenteEncadeada.add("A2");
		listaDuplamenteEncadeada.add("A3");
		listaDuplamenteEncadeada.add("A4");
		listaDuplamenteEncadeada.add("A5");
		listaDuplamenteEncadeada.add("A6");
		listaDuplamenteEncadeada.add("A7");
		
		System.out.println(listaDuplamenteEncadeada);
		
		listaDuplamenteEncadeada.remove(4);
		
		listaDuplamenteEncadeada.add(4, "88");
		
		System.out.println(listaDuplamenteEncadeada);
		
		System.out.println(listaDuplamenteEncadeada.get(3));
	}

}
