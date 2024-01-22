package Library;

import Interface.Nonfiction;

public class Newspapers extends Reading implements Nonfiction {

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

	public Newspapers(String title, String author, int cost, boolean available, boolean todays) {
		super(title, author, cost, available);
		this.todays = todays;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Newspapers [Id =" + getId() + ", Title =" + getTitle() + ", Author =" + getAuthor() + ", Cost ="
				+ getCost() + ", Available to read =" + isAvailable() + ", todays=" + todays + "]";
	}

	@Override
	public int totalCost() {
		return 10;
	}

	@Override
	public int compareTo(Reading o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Nonfiction() {
		System.out.println("type NF");

		// TODO Auto-generated method stub

	}

}
