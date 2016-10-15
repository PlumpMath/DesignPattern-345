package creation.builder;

public class Client {
	
	public static void main(){
		new ProductBuilder("un", "due", "tre", "quattro").
				setFive("cinque").build();
	}

//	public static void main(String[] args) {
//		main();
//	}

}
