package People;

public class Person {

	private String name;

	private int age;

	private boolean member;

	public Person(String name, int age, boolean member) {
		super();
		this.name = name;
		this.age = age;
		this.member = member;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", member=" + member + "]";
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the member
	 */
	public boolean isMember() {
		return member;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(boolean member) {
		this.member = member;
	}

}
