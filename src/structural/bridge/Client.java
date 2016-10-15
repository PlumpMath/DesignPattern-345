package structural.bridge;

public class Client {

	public static void main(){
//		Shape triangle = new Triangle(new Red());
//		triangle.applyColor();
//		triangle.setColor(new Green());
//		triangle.applyColor();
		Shape triangle = new Triangle();
		triangle.applyColor("red");
		triangle.applyColor("green");
	}
	
	
//	public static void main(String[] args) {
//		main();
//	}

}
