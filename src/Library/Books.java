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
		return "Books [Id =" + getId() + ", Title =" + getTitle() + ", Author  =" + getAuthor() + ", Cost =" + getCost()
				+ ", Available to rent=" + isAvailable() + ", sequel=" + sequel + "]";
	}

	public Books(String title, String author, int cost, boolean available, boolean sequel) {
		super(title, author, cost, available);
		this.sequel = sequel;
		// TODO Auto-generated constructor stub
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

	// TODO Auto-generated constructor stub

}
