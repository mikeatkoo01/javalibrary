package Library;

import java.util.ArrayList;

public class Library {

	private String name;

	public Library(String name) {
		super();
		this.name = name;
	}

	private ArrayList<Reading> reading = new ArrayList<>();

	public void addInv(Reading read) {
		reading.add(read);
	}

	public void deleteInv(Reading read) {
		reading.remove(read);
	}

	public void updateInv(Reading read) {
		reading.set(0, read);
	}

	@Override
	public String toString() {
		return "Library [name=" + name + "reading=" + reading + "]";
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

	/**
	 * @return the reading
	 */
	public ArrayList<Reading> getReading() {
		return reading;
	}

	/**
	 * @param reading the reading to set
	 */
	public void setReading(ArrayList<Reading> reading) {
		this.reading = reading;
	}

	public void checkIn(Reading read) {
		reading.add(read);
	}

	public void checkOut(Reading read) {
		reading.remove(read);
	}

}
