package creation.abstractFactory;

public class ConcreteFactory1 {
	
	public static AbstractProductA getProductA(){
		return new ProductA1();
	}
	
	public static AbstractProductB getProductB(){
		return new ProductB1();
	}
}
