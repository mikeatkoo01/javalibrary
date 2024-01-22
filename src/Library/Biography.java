package Library;

import Interface.Nonfiction;

public class Biography extends Reading implements Nonfiction {

	private boolean hardback;

	public boolean isHardback() {
		return hardback;
	}

	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}

	public Biography() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Biography(String title, String author, int cost, boolean available, boolean hardback) {
		super(title, author, cost, available);
		this.hardback = hardback;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Biography [Id =" + getId() + ", Title =" + getTitle() + ", Author =" + getAuthor() + ", Cost ="
				+ getCost() + ", Available to rent =" + isAvailable() + ", hardback=" + hardback + "]";
	}

	@Override
	public int compareTo(Reading o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalCost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void Nonfiction() {
		System.out.println("type NF");
		// TODO Auto-generated method stub

	}

	// TODO Auto-generated constructor stub
}
