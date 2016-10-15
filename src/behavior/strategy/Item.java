package behavior.strategy;

/**
 * Oggetto primitivo contenuto nel Context e parametro dell'algoritmo.
 */
public class Item {
	private String dataOne;
	private int dataTwo;

	public String getDataOne() {
		return dataOne;
	}

	public int getDataTwo() {
		return dataTwo;
	}

	public void setDataOne(String dataOne) {
		this.dataOne = dataOne;
	}

	public void setDataTwo(int dataTwo) {
		this.dataTwo = dataTwo;
	}

	public String toString() {
		return "Item: {" + getDataOne() + ", " + getDataTwo() + " }";
	}
}
