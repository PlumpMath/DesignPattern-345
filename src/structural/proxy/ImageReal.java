package structural.proxy;

/**
 * Oggetto pesante, richiede molte risorse per essere costruito.<br/>
 * 
 */
public class ImageReal implements ImageInterface {

	private String name;

	public ImageReal() {
		System.out.println("ImageReal creazione in corso...");
		// operazioni per creare l'immagine (simulate con lo sleep)
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		name = "fileNameReal";
		System.out.println("ImageReal creata con successo");
	}

	public void draw() {
		System.out.println("ImageReal.draw: eseguito con successo");
	}

	public String getName() {
		return name;
	}

}
