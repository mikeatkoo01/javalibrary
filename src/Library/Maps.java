package Library;

public class Maps extends Reading {

	private boolean uptodate;

	/**
	 * @return the uptodate
	 */
	public boolean isUptodate() {
		return uptodate;
	}

	public Maps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Maps(String title, String author, int cost, boolean uptodate) {
		super(title, author, cost);
		this.uptodate = uptodate;
	}

	/**
	 * @param uptodate the uptodate to set
	 */
	public void setUptodate(boolean uptodate) {
		this.uptodate = uptodate;
	}

	@Override
	public String toString() {
		return "Maps [uptodate=" + uptodate + ", ID =" + getId() + ", Title =" + getTitle() + ", Author =" + getAuthor()
				+ ", Cost =" + getCost() + "]";
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

}
