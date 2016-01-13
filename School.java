public class School extends Setting {
    private String image;
    private String text;

    text = "Welcome to the School! Where in the School would you like to go?";

    public static void pickSchool {
	System.out.println ("1-Class\t2-Cafeteria\3-Auditorium");
	System.out.println ("Enter the number of the place you wish to go:");
	String choice = Keyboard.readInt();

	if (choice = 1) {
	    //Class
	}
	if (choice = 2) {
	    //Cafeteria
	}
	if (choice = 3) {
	    //Auditorium
	}
    }
}
