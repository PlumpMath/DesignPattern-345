package creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Un qualsiasi oggetto la quale inizializzazione &egrave molto pesante (es.
 * ottiene dati da un db) implementa l'interfaccia Prototype e mostrando il
 * metodo clone che restituisce un clone di Product
 */
public class Product implements Prototype {

	private List<String> data;

	public Product() {
		this.data = new ArrayList<>();
		this.loadData();
	}

	/**
	 * Passiamo i dati della lista, senza effettuare pesanti inizializzazioni
	 */
	public Product(List<String> data) {
		this.data = data;
	}

	/**
	 * Complesse operazioni, ad esempio lettura da database per ottenere i dati
	 * della lista
	 */
	private void loadData() {
		// ottengo info in modo complesso
		System.out.print("Product: Caricamento dati...");
		try {
			//simulo operazione complessa
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data.add("one");
		data.add("two");
		data.add("three");
		data.add("four");
		System.out.println("Fine");
	}

	public List<String> getData() {
		return data;
	}

	@Override
	public Prototype clone() {
		List<String> dataTmp = new ArrayList<>();
		for (String current : this.getData()) {
			dataTmp.add(current);
		}
		return new Product(dataTmp);
	}

}
