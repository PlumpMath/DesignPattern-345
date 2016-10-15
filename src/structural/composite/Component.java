package structural.composite;

public interface Component {
	void operation();

	void add(Component c);

	void remove(Component c);

	Component getChild(int i);
}
