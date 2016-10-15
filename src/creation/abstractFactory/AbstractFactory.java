package creation.abstractFactory;

public abstract class AbstractFactory {
	
//	public static AbstractFactory getFactory(){
//		return new AbstractFactory();
//	}
	

	static final int USE_A = 1;

	public abstract AbstractProductA getProductA();
	
	static final int USE_B = 1;

	public abstract AbstractProductB getProductB();
	

}
