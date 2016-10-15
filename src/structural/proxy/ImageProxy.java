package structural.proxy;

/**
 * Controllo l'accesso a ImageReal, lo creo solo quando &egrave realmente
 * necessario
 */
public class ImageProxy implements ImageInterface {

	private ImageReal realImageObject = null;
	private String name;

	public ImageProxy() {
		// in qualche modo ottengo il nome
		name = "fileNameProxy";
	}

	@Override
	public void draw() {
		if (realImageObject == null) {
			realImageObject = new ImageReal();
		}
		realImageObject.draw();
	}

	public String getName() {
		if (realImageObject == null) {
			return name;
		} else {
			return realImageObject.getName();
		}
	}
}
