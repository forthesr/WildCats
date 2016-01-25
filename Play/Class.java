import java.util.Scanner;

public class Class extends Setting {
    //20 X 3 array, 20, 30, 20 characters, temp design to test
    private String[][] image = new String[][]
		{{"____________________","______________________________","____________________"}, //0
	     {"   _            |   ","                              ","       |            "}, //1
	     {"  / /|          |  _","______________________________","_      |           "},
	     {" / / |          | | "," CLASS.is. gross              "," |     |            "}, //3
	     {"/ /  |          | | ","                  java why    "," |     |           "},
	     {" //| |          | |b","leh   (>,0)                   "," |     |            "}, //5
	     {"//|| |          | | ","                    booooo    "," |     |           "},
	     {"/ // |          | |_","______________________________","_|     |            "}, //7
	     {"|//  |          |   ","                              ","       |            "},
	     {"|/   |___       |   ","                              ","       |            "}, //9
	     {"     /   /|     |___","______________________________","_______|            "},
	     {"    /   / |     /   ","                              ","       \\            "}, //11
	     {"   /   /| |    /    ","                              ","         \\          "},
	     {"  /   / | `   /     ","                              ","          \\         "}, //13
	     {" /   /| `    /      ","                              ","           \\        "},
	     {"/   / |     /       ","                              ","            \\       "}, //15
	     {"   /| `    /        ","   ________________________   ","             \\      "},
	     {"  / |     /         ","  /     _______            \\  ","              \\     "}, //17
	     {" /| `    /          "," /     | hoi   |             \\","               \\    "},
	     {"/ |     /           ","/      |       |              ","                \\   "}  //19
	    };
    private String text = "Welcome to the classroom! " +
	    "Who would you like to talk to?\n" +
	    "Sans?\n" +
	    "Enter the name of the person you want to talk to:";
	public getImage(){
		return image;
	}
	
	public getText(){
		return text;
	}
}
