package behavior.strategy;

public class ConcreteStrategyC implements Strategy {

	@Override
	public String algorithm(Context context) {
		System.out.println("ConcreteStrategyC.algorithm, context="+context);
		return "C";
	}

}
