package Library;

import java.util.ArrayList;

public class Library {

	private String name;

	public Library(String name) {
		super();
		this.name = name;
	}

	private ArrayList<Reading> reading = new ArrayList<>();

	public void checkIn(Reading read) {
		reading.add(read);
	}

	public void checkOut(Reading read) {
		reading.remove(read);
	}

	public void update(Reading read) {
		reading.set(0, read);
	}

	@Override
	public String toString() {
		return "Library [reading=" + reading + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
