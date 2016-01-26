import java.util.Scanner;
import cs1.Keyboard;

public class Home extends Setting {
    
  //constructors
  public Home(){
      image = new String[][]
	  {{"____________________","______________________________","____________________"}, //0
	   {"                    ","                              ","                    "}, //1
	   {"       __________   ","                 ____________ ","             Y\\     "},
	   {"      |   _  _  |   ","                |            |","            Y |\\    "}, //3
	   {"      |  / \\/_\\_|___","_________       |            |","           Y  | \\   "},
	   {"      | |  |\\ ______","__________\\     |    _-_     |","          Y   |  \\  "}, //5
	   {"      |  \\ | |      ","          |     |   /XXX\\    |","         Y    |   \\ "},
	   {"      |   \\| |      ","          |     |   \\XXX/    |","        Y     |    Y"}, //7
	   {"      |____| |   .__","______.   |     |   XXXXX    |","       Y______|   Y "},
	   {"           | |   | \\","    / |   |     |   XXXXX  o |","      |\\       \\ Y  "}, //9
	   {"     ___   | |   |  ","\\  /  |   |     |            |","      | \\       Y   "},
	   {"    | = |  | |___|  ","/  \\  |___|     |            |","      |  \\     Y    "}, //11
	   {"    |_=_|  | |  _|_/","____\\_|___|     |            |","      ||\\ \\   Y     "},
	   {"           |  \\|    ","           \\    |            |","      || \\ \\ Y      "}, //13
	   {"___________|   | \\  ","            \\___|____________|","______|| .\\ |       "},
	   {"           |   |  \\ ","              \\               ","      | \\  ||       "}, //15
	   {"           |   |   \\","               \\              ","      ||\\ ||       "},
	   {"            \\  |    "," \\               \\            ","      || \\||       "}, //17
	   {"             \\  \\   ","  \\               \\           ","      || .\\ |       "},
	   {"              \\  \\  ","   \\                          ","      \\ \\  ||       "}  //19
	  } ;
      text = "Welcome home! Here is where you can rest! \n" +
	  "Sleeping will regain full stamina and one day will pass.";
  }
  
    //sleep
    public void sleep(){
	System.out.println("Do you want to go to sleep?(y/n):");
	String ans = Keyboard.readString();
	if (ans.equals("y")) {
	    return;
	}
	else  {
	    System.out.println("Good night!");
	    playa.stamina = 15;
	    play.days --;
	    System.out.println(game.view);
	    System.out.println("You wake up feeling refreshed and ready to go!");
	    System.out.println("Only" + days + "left to go before prom!");
	}
    }
  

}
