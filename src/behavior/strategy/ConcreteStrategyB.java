package behavior.strategy;

public class ConcreteStrategyB implements Strategy {

	@Override
	public String algorithm(Context context) {
		System.out.println("ConcreteStrategyB.algorithm, context="+context);
		return "B";
	}

}
