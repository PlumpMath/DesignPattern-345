package structural.bridge;

public class Pentagon extends Shape{
	
	public Pentagon() {
		super();
	}

	@Override
	public void applyColor(String idColor) {
		System.out.print("Pentagon ");
		this.getColor(idColor).applyColor();
	}

}
