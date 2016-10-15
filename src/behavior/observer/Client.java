package behavior.observer;

public class Client {
	
	public static void main() {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver1 obs1 = new ConcreteObserver1();
		ConcreteObserver2 obs2 = new ConcreteObserver2();
		ConcreteObserver3 obs3 = new ConcreteObserver3();
		subject.attach(obs1);
		obs1.setSubject(subject);
		subject.attach(obs2);
		obs2.setSubject(subject);
		subject.attach(obs3);
		obs3.setSubject(subject);
		
		
		obs1.changeSubjectState();
		obs2.changeSubjectState();
	}
	
//	public static void main(String [] args) {
//		main();
//	}
}
