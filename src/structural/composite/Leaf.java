package structural.composite;

/**
 * Foglia della struttura gerarchica, ovvero un nodo del grafo che non ha figli.
 * Le operazioni impossibili da implementare (es. aggiungi figlio) lanceranno
 * eccezioni a run-time
 */
public class Leaf implements Component {
	public Leaf(String id) {
		this.id = id;
	}

	private String id;

	@Override
	public void operation() {
		System.out.println(id + ".operation()");
	}

	@Override
	public void add(Component c) {
		throw new UnsupportedOperationException(
				"This is a Leaf Component, add is not supported");
	}

	@Override
	public void remove(Component c) {
		throw new UnsupportedOperationException(
				"This is a Leaf Component, remove is not supported");
	}

	@Override
	public Component getChild(int i) {
		throw new UnsupportedOperationException(
				"This is a Leaf Component, getChild is not supported");
	}

}
