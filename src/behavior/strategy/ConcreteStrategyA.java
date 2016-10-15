package behavior.strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public String algorithm(Context context) {
		System.out.println("ConcreteStrategyA.algorithm, context="+context);
		return "A";
	}

}
