package structural.bridge;

public class Triangle extends Shape{
	
	public Triangle() {
		super();
	}

	@Override
	public void applyColor(String idColor) {
		System.out.print("Triangle ");
		this.getColor(idColor).applyColor();
	}

}
