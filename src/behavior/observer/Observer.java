package behavior.observer;

/**
 * Fornisce un'interfaccia di notifica per gli oggetti che sono osservatori di Subject
 */
public interface Observer {
	
	/**
	 * Verr&agrave chiamata quando il subject aggiorna il suo stato,
	 * otterr&agrave il nuovo stato e si sincronizzer&agrave 
	 */
	void update();
	
	/**
	 * Setto un Subject per questo Observer
	 */
	void setSubject(Subject subject);
	
}
