package behavior.observer;

/**
 * - Memorizza un riferimento a un oggetto ConcreteSubject<br/>
 * - Contiene informazioni (observerState) che devono essere sincronizzate 
 * 		con lo stato del Subject<br/>
 * - Implementa Observer, metodo update, per mantenere le informazioni 
 * 		consistenti con lo stato del Subject<br/>
 * Pu&ograve cambiare lo stato del Subject
 */
public class ConcreteObserver2 implements Observer{
	/**Stato dell'Observer, si sincronizza con il Subject*/
	private String observerState;
	private Subject subject;
	
	@Override
	public void update(){
		observerState = subject.getState();
		System.out.println("ConcreteObserver2.update : notified state="+observerState);
	}
	
	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void changeSubjectState(){
		System.out.println("ConcreteObserver2: sto per cambiare stato Subject");
		subject.setState("OBSERVER2 CAMBIA LO STATO");
	}
	

}
