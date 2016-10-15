package structural.composite;

public class Client {

	
	/*
	 *           root
	 *   leaf1                  comp1
	 *                    leaf2            comp2
	 *                                       leaf3
	 */
	public static void main() {
		// radice della gerarchia
		Component root = new Composite("root");

		// nodi interni
		Component comp1 = new Composite("comp1");
		Component comp2 = new Composite("comp2");

		// foglie
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component leaf3 = new Leaf("leaf3");

		// composizione della struttura
		root.add(leaf1);
		root.add(comp1);

		comp1.add(leaf2);
		comp1.add(comp2);

		comp2.add(leaf3);

		// chiamano l'operation della root, a cascata vengono chiamate tutte
		root.operation();
	}

//	public static void main(String[] args) {
//		main();
//	}
}
