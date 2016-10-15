package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Contiene il proprio stato a cui gli Observer sono interessati.<br/>
 * Contiene la lista degli Observer interessati a questo Subject.<br/>
 * Potrebbe implementare il pattern Singleton.<br/>
 * Si usa il synchronized su un oggetto MUTEX quando si opera con la lista di
 * observer. Mutua esclusione: il synchronized assicura che un solo thread
 * entrar&agrave nel blocco. Questo perch&egrave potrebbe succedere che 2
 * observer in 2 thread diversi
 */
public class ConcreteSubject implements Subject {

	/**
	 * Stato del Subject, pu&ograve essere rappresentato da una struttura dati
	 * complessa
	 */
	private String subjectState = "VECCHIO STATO";

	/**
	 * Lista di tutti gli Observer che verranno notificati da questo
	 * ConcreteSubject
	 */
	private ArrayList<Observer> observers;
	private final Object MUTEX = new Object();
	private boolean changed = false;

	public ConcreteSubject() {
		observers = new ArrayList<>();
	}

	/**
	 * Associa un nuovo Observer a questo Subject
	 */
	public void attach(Observer o) {
		if (o == null) {
			throw new NullPointerException("Observer is null");
		}
		synchronized (MUTEX) {
			if (!observers.contains(o)) {
				observers.add(o);
			}
		}

	}

	/**
	 * Dissocia un observer gi&agrave associato a questo Subject
	 * 
	 * @return false se l'observer non era associato
	 */
	public boolean detach(Observer o) {
		synchronized (MUTEX) {
			return observers.remove(o);
		}
	}

	/**
	 * Notifica tutti gli observer associati di un cambio di stato, Gli
	 * Observers allora faranno richiesta alla ConcreteSubject per ottenere il
	 * nuovo stato.
	 */
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		/*
		 * Qui il synchronized per assicurarsi che la notifica e' inviata solo
		 * agli observers registrati prima che lo stato sia cambiato
		 */
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			observersLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer aObserver : observersLocal) {
			aObserver.update();
		}
	}

	/**
	 * Restituisce lo stato attuale
	 */
	public String getState() {
		return subjectState;
	}

	/**
	 * Aggiornamento dello stato, pu&ograve essere chiamato da un observer.
	 */
	public void setState(String newState) {
		this.subjectState = newState;
		this.changed = true;
		notifyObservers();
	}

}
