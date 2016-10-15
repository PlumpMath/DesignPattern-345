package creation.builder;

public class Product {
	public Product(ProductBuilder builder) {
		this.one = builder.one;
		this.two = builder.two;
		this.three = builder.three;
		this.four = builder.four;
		
		//fregacazzi che sono opzionali
		this.five = builder.five;
		this.six= builder.six;
		this.seven = builder.seven;
		this.eight = builder.eight;
		this.nine = builder.nine;
		this.ten = builder.ten;
	}
	
	
	private String one;
	private String two;
	private String three;
	private String four;
	private String five;
	private String six;
	private String seven;
	private String eight;
	private String nine;
	private String ten;
	
	
	public String getOne() {
		return one;
	}
	public String getTwo() {
		return two;
	}
	public String getThree() {
		return three;
	}
	public String getFour() {
		return four;
	}
	public String getFive() {
		return five;
	}
	public String getSix() {
		return six;
	}
	public String getSeven() {
		return seven;
	}
	public String getEight() {
		return eight;
	}
	public String getNine() {
		return nine;
	}
	public String getTen() {
		return ten;
	}
	
	
	

}
