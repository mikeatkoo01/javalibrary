package Library;

public class Reading {

	private int id;

	private String title;

	private String author;

	private int cost;

	private static int count;

	public Reading(String title, String author, int cost) {
		super();
		this.id = ++count;
		this.title = title;
		this.author = author;
		this.cost = cost;
	}

	public Reading() {
		super();
		this.id = ++count;

	}

	@Override
	public String toString() {
		return "Reading [id=" + id + ", title=" + title + ", author=" + author + ", cost=" + cost + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Reading.count = count;
	}

}
