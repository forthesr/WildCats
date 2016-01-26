import java.util.Scanner;

public class Home extends Setting {

  protected String[] image;
  protected String text;
  
  //constructors
  public Home(){
   private String[][] image = new String[][]
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
	     {"            \\  |    "," \               \\            ","      || \\||       "}, //17
	     {"             \\  \\   ","  \               \\           ","      || .\\ |       "},
	     {"              \\  \\  ","   \                          ","      \\ \\  ||       "}  //19
	    } ;
    text = "Welcome home! Time to go to sleep! \n
            Sleeping will regain full stamina and one day will pass.";
  }
  
  //methods
  //gets
  public String[] getImage(){
    return image;
  }
  
  public String getText(){
    return text;
  }
  
  //sleep
  public void sleep(){
    System.out.println("Good night!");
    stamina = 15;
    days --;
    System.out.println("You wake up feeling refreshed and ready to go!");
    System.out.println("Only" + days + "left to go before prom!");
    System.out.println(image);
    System.out.println(text);
    setView(map.getImage() );
  }
  

}
