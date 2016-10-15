package behavior.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Il contesto sul quale applicare l'algoritmo. &Egrave una classe di
 * configurazione dell'algoritmo, invece di passare i dati direttamente
 * all'algoritmo, si passano su questa.
 */
public class Context {

	public Context() {
		this.items = new ArrayList<>();
	}

	private List<Item> items;

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public String algorithm(Strategy strategy) {
		// puo' ottenere qualcosa dalla struttura dati items
		return strategy.algorithm(this);
	}
	
	public String toString(){
		return "Context : { "+items.toString()+" }";
	}

}
