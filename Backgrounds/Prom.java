import java.util.Scanner;

public class Prom extends Setting {
    //20 X 3 array, 20, 30, 20 characters, temp design to test
    private String[][] image = new String[][]
	    {{"____________________","______________________________","____________________"}, //0
	     {"         |   |\_____","______________________________","_____/|      |      "}, //1
	     {"         |   |   ___","_      ____    U  ___ u  __  _","_     |      |      "},
	     {"         |   | U|  _",""\ uU |  _"\ u  \/"_ \/U|' \/ ","'|u   |      |      "}, //3
	     {" _______ |   | \| |_",") |/ \| |_) |/  | | | |\| |\/|"," |/   |      |  For "},
	     {"|  You  ||   |  |  _","_/    |  _ <.-,_| |_| | | |  |"," |    |      |  The "}, //5
	     {"|Flaming||   |  |_| ","      |_| \_\\_)-\___/  |_|  |","_|    |      |Tenth "},
	     {"|__Homo_||   |  ||>>","_     //   \\_   \\_   <<,-,,-",".     |      | Time:"}, //7
	     {"      V  |   | (__)_","_)   (__)  (__)  (__)   (./  \",".)    |      |  NO  "},
	     {"    \  0 |// \______","______________________________","______/      |SMOKIN"}, //9
	     {"     \ | //         ","                              ","  ** KISS My |   IN "},
	     {"      \|/|          ","                              ","   GURL AND U|SCHOOL"}, //11
	     {"       | |__________","______________________________","______D_I_E__|      "},
	     {"       | /          ","                  |BBY Come  |","             \      "}, //13
	     {"      / \\       0 -","'My heels         |____ BACK_|","              \     "},
	     {"     / / \\      |  ","  are nicer          __V__    ","               \    "}, //15
	     {"    / /   \\    /|\\","   than yours'      \\ 0 /    ","            /\  \   "},
	     {"   / /     \\  / | \","                     \\|/     ","           /  \  \  "}, //17
	     {"   `/       `  \ |  ","\\                     |      ","          (_X _)  \ "},
	     {"   /            \|  "," \\                    |      ","           /_\    \"}  //19
	    };
    private String text = "Welcome to Prom! " +
	    "Who is your date?\n" +
	    "Sans\tNico\tReporterWaifu\tInvisibleMan\tDaphne\tRichard\n" +
	    "Enter the name of the person you want to take to prom:";

	public getImage(){
		return image;
	}
	
	public getText(){
		return text;
	}

}
