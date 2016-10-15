package behavior.observer;

public class ConcreteObserver3 implements Observer{
	private String observerState;
	private Subject subject;
	
	@Override
	public void update(){
		observerState = subject.getState();
		System.out.println("ConcreteObserver3.update : notified state="+observerState);
	}
	
	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
