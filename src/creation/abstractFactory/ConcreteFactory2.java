package creation.abstractFactory;

public class ConcreteFactory2 {
	public static AbstractProductA getProductA(){
		return new ProductA2();
	}
	
	public static AbstractProductB getProductB(){
		return new ProductB2();
	}
}
