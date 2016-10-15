package creation.prototype;

public class Client {

	public static void main(){
		//prima inizializzazione pesante
		Product product = new Product();
		System.out.println("product originale: "+product.getData());
		
		Product clone1 = (Product) product.clone();
		clone1.getData().add("AGGIUNTA!");
		System.out.println("product clone: "+clone1.getData());
		
		
	}
	
//	public static void main(String[] args) {
//		main();
//	}

}
