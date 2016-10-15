package creation.factory;

public class Client {
	public static void main(){
		Factory productFactory = new ProductFactory();
		ProductInterface product = productFactory.createFactory();
		System.out.println(product.getMySelf());
	}
	
//	public static void main(String [] args){
//		main();
//	}
}
