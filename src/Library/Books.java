package Library;

public class Books extends Reading {

	private boolean sequel;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sequel
	 */
	public boolean isSequel() {
		return sequel;
	}

	/**
	 * @param sequel the sequel to set
	 */
	public void setSequel(boolean sequel) {
		this.sequel = sequel;
	}

	@Override
	public String toString() {
		return "Books [sequel=" + sequel + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()="
				+ getAuthor() + ", getCost()=" + getCost() + "]";
	}

	public Books(String title, String author, int cost, boolean sequel) {
		super(title, author, cost);
		this.sequel = sequel;
	}

	// TODO Auto-generated constructor stub

}
