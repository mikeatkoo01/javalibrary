package Library;

public abstract class Reading implements Comparable<Reading> {

	private int id;

	private String title;

	private String author;

	private int cost;

	private boolean available;

	private static int count;

	public Reading(String title, String author, int cost, boolean available) {
		super();
		this.id = ++count;
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.available = true;
	}

	public Reading() {
		super();
		this.id = ++count;

	}

	public abstract int totalCost();

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", author=" + author + ", cost=" + cost + ", available" + available
				+ "]";
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

	public void rent() {
		if (available) {
			available = false;
			System.out.println("can be rented" + title);
		} else {
			System.out.println("sorry item is not available");
		}

	}

	public void returnitem() {
		available = true;
		System.out.println("item returned");
	}

	@Override
	public int compareTo(Reading o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(title);
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
