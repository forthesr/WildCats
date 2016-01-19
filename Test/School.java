import java.util.Scanner;

public class School extends Setting {
    private String[][] image;
    private String text = "";

    public School() {
	//20 X 3 array, 20, 30, 20 characters, temp design to test
	image = new String[][]
	    {{"____________________","___________________________________","____________________"}, //0
	     {"||||||||||||||||||||","||||||||||THE SCHOOL|||||||||||||||","||||||||||||||||||||"}, //1
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //3
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //5
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //7
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //9
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //11
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //13
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"}, //15
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||    o|||o    |||||||||||","||||||||||||||||||||"}, //17
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"}  //19
	    };
	
	text = "Welcome to the School! " +
	    "Where in the School would you like to go?\n" +
	    "1-Classroom\t2-Cafeteria\t3-Auditorium\n" +
	    "Enter the number of the place you wish to go:";
    }

    public String toString() {
	String s = "";
	for (String[] a : image) {
	    for (String b : a) {
		s += b;
	    }
	    s += "\n";
	}
	return s;
    }
    
    /* public void transport(){
	String location;
        System.out.println(text);
        int choice = Keyboard.readInt();
	if (choice = 1) {
	    DatingSim.view = Class.getImage();
	    location = "The Classroom";
	}
	if (choice = 2) {
	    DatingSim.view = Cafeteria.getImage();
	    location = "The Cafeteria";
	}
	if (choice = 3) {
	    DatingSim.view = Auditorium.getImage();
	    location = "The Auditorium";
	}
      
        System.out.println(DatingSim.view);
        System.out.println("You are now in " + location);
	}*/

    public static void main(String[] args) {
	Setting foo = new School();
	System.out.print(foo);
    }
}
