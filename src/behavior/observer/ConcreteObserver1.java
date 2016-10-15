package behavior.observer;


/**
 * - Memorizza un riferimento a un oggetto ConcreteSubject
 * - Contiene informazioni (observerState) che devono essere sincronizzate 
 * 		con lo stato del Subject
 * - Implementa Observer, metodo update, per mantenere le informazioni 
 * 		consistenti con lo stato del Subject
 */
public class ConcreteObserver1 implements Observer{
	
	private String observerState;
	private Subject subject;
	
	
	@Override
	public void update(){
		observerState = subject.getState();
		System.out.println("ConcreteObserver1.update : notified state="+observerState);
	}
	
	public void changeSubjectState(){
		System.out.println("ConcreteObserver1: sto per cambiare stato Subject");
		subject.setState("OBSERVER1 CAMBIA LO STATO");
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
