package Library;

public class Newspapers extends Reading {

	private boolean todays;

	/**
	 * @return the todays
	 */
	public boolean isTodays() {
		return todays;
	}

	/**
	 * @param todays the todays to set
	 */
	public void setTodays(boolean todays) {
		this.todays = todays;
	}

	public Newspapers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspapers(String title, String author, int cost, boolean todays) {
		super(title, author, cost);
		this.todays = todays;
	}

	@Override
	public String toString() {
		return "Newspapers [todays=" + todays + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()="
				+ getAuthor() + ", getCost()=" + getCost() + "]";
	}

}
