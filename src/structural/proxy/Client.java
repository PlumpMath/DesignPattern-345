package structural.proxy;

public class Client {

	public static void main(){
		ImageInterface image = new ImageProxy();
		System.out.println("Nome immagine= "+image.getName());
		image.draw();
		image.draw();
		System.out.println("Nome immagine= "+image.getName());
	}
	
	
	public static void main(String[] args) {
		main();
	}

}
