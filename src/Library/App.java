package Library;

public class App {

	public static void main(String[] args) {

		Books lionking = new Books("lion king", "disney", 10, true, true);
		Maps London = new Maps("london", "london council", 10, true, true);
		Biography Pac = new Biography("2pac", "makavelli", 10, false, true);

		Library myLibrary = new Library("Leeds Library");

		myLibrary.checkIn(lionking);
		myLibrary.checkIn(Pac);
		myLibrary.checkOut(lionking);

		myLibrary.addInv(new Books());
		myLibrary.addInv(new Books());
		myLibrary.addInv(new Books());

		System.out.println(myLibrary);

		System.out.println(Pac);

	}

}
