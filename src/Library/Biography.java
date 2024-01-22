package Library;

public class Biography extends Reading {

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

	public Biography(String title, String author, int cost, boolean hardback) {
		super(title, author, cost);
		this.hardback = hardback;
	}

	@Override
	public String toString() {
		return "Biography [hardback=" + hardback + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", getCost()=" + getCost() + "]";
	}

	// TODO Auto-generated constructor stub
}
