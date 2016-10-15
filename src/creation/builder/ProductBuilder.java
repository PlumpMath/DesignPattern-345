package creation.builder;

public class ProductBuilder implements Builder{

	public ProductBuilder(String one, String two, String three, String four) {
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
	}
	
	//parametri obbligatori
	protected String one;
	protected String two;
	protected String three;
	protected String four;
	
	//parametri opzionali
	protected String five;
	protected String six;
	protected String seven;
	protected String eight;
	protected String nine;
	protected String ten;
	
	public ProductBuilder setFive(String five) {
		this.five = five;
		return this;
	}

	public ProductBuilder setSix(String six) {
		this.six = six;
		return this;
	}
	
	public ProductBuilder setSeven(String seven) {
		this.seven = seven;
		return this;
	}

	public ProductBuilder setEight(String eight) {
		this.eight = eight;
		return this;
	}
	
	public ProductBuilder setNine(String nine) {
		this.nine = nine;
		return this;
	}

	public ProductBuilder setTen(String ten) {
		this.ten = ten;
		return this;
	}
	
	@Override
	public Product build() {
		return new Product(this);
	}

}
