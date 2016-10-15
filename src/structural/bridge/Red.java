package structural.bridge;

public class Red implements Color{
	
	public Red(){
		System.out.println("Chiamato costruttore Red");
	}

	@Override
	public void applyColor() {
		System.out.println("RED");
	}

}
