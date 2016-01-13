import java.util.Scanner;

public class School extends Setting {
    private String[][] image;
    private String text;

    public School() {
	image = new String[10][35]; //
	text = "Welcome to the School! " +
	    "Where in the School would you like to go?\n" +
	    "1-Class\t2-Cafeteria\t3-Auditorium\n" +
	    "Enter the number of the place you wish to go:"
    }
    

    public void pickSchool {
	System.out.print (text);
	String choice = Keyboard.readInt();

	if (choice = 1) {
	    view = Class.getImage();
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
