package creation.factory;

public class ProductFactory implements Factory {

	int who = 1;

	@Override
	public ProductInterface createFactory() {
		switch (who) {
		case 0:
			return new ProductA();
		case 1:
			return new ProductB();
		default:
			return new ProductA();
		}

	}

}
