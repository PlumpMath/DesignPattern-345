package behavior.strategy;

public class Client {

	public static void main() {
		Context context = new Context();
		
		Item fakeItem1 = new Item();
		fakeItem1.setDataOne("uno");
		fakeItem1.setDataTwo(1);
		Item fakeItem2 = new Item();
		fakeItem2.setDataOne("due");
		fakeItem2.setDataTwo(2);
		
		context.addItem(fakeItem1);
		context.addItem(fakeItem2);
		
		//eseguo l'algoritmo con la strategia A
		context.algorithm(new ConcreteStrategyA());
		
		//eseguo l'algoritmo con la strategia B
		context.algorithm(new ConcreteStrategyB());
		
	}
	
//	public static void main(String[] args) {
//		main();
//	}
}
