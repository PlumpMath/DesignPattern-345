package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Nodo interno della struttura gerarchica. Incapsula i suoi figli in una lista.
 * Implementa tutti i metodi di Component
 */
public class Composite implements Component {

	private List<Component> children;
	private String id;

	public Composite(String id) {
		children = new ArrayList<>();
		this.id = id;
	}

	@Override
	public void operation() {
		System.out.println(id + ".operation()");
		for (Component child : children) {
			child.operation();
		}
	}

	public void add(Component c) {
		System.out.println(id + ".add");
		children.add(c);
	}

	public void remove(Component c) {
		System.out.println(id + ".remove");
		children.remove(c);
	}

	public Component getChild(int i) {
		System.out.println(id + ".getChild");
		return children.get(i);
	}

	public void clear() {
		System.out.println(id + ".clear");
		children.clear();
	}
}
