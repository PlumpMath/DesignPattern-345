package behavior.observer;

/**
 * Fornisce una interfaccia per associare, dissociare e notificare i suoi
 * Observer e restituire e settare lo stato del Subject
 */
public interface Subject {

	void attach(Observer o);

	boolean detach(Observer o);

	void notifyObservers();

	String getState();

	void setState(String newState);

}
