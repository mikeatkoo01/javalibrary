package People;

import java.util.ArrayList;

public class Members {

	private ArrayList<Person> person = new ArrayList<>();

	public void register(Person per) {
		person.add(per);

	}

	public void remove(Person per) {
		person.remove(per);
	}

	public void update(Person per) {
		person.set(0, per);
	}
//	

//	public void update(Person per) {
//		person.set(per);

	/**
	 * @return the person
	 */
	public ArrayList<Person> getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Members [person=" + person + "]";
	}

}
