package creation.builder;

public class Director {
	
	public Director(Builder builder){
		this.builder = builder;
		
		builder.build();
	}

	private Builder builder;
	
}
