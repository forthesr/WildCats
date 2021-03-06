import java.util.Scanner;

public class Map extends Setting {

    private String image;
    private String text;
  
  //Constructor
  public Map(){
     private String[][] image = new String[][]
	    {{"____________________","______________________________","____________________"}, //0
	     {"       _____        ","                              ","        __________  "}, //1
	     {"      / _ _ \_      ","   \\\    ///        ))       ","        ||||||||||  "},
	     {"     / |_|_| \|     ","   ((O)  (O))   /)  (o0)-.    ","        ||-||||-||  "}, //3
	     {"    /_________\     ","    | \  / |  (o)(O) | (_))   ","        ||||||||||  "},
	     {"     |       |      ","    ||\\//||   //\\  | .-'    ","        ||| |.||||  "}, //5
	     {"     |   _   |      ","    || \/ ||  |(__)| |(       ","  __   __    _  _   "},
	     {"     |__|_|__|      ","    ||    ||  /,-. |  \)      "," / _| /_|| |/ \/ \| "}, //7
	     {"                    ","   (_/    \_)-'   ''  (       "," \_ \||_ |-| .| .|| "},
	     {"       _  _  _  _   ","      .....                   "," |__/ \_|| |\_/\_/| "}, //9
	     {"   |_|/.\| \/ |/_\_ ","    ::::::::                  ","                    "},
	     {"   | |\_/|_||_|\__/ ","    :::::::: .:.              ","                    "}, //11
	     {"                    ","  .` ::::::  / :`       +     ","       +            "},
	     {"                    "," .:\. \||//--      +  ________","__+_______          "}, //13
	     {"                    ","  ` \__||/   \:.    +| _  _  _","_         |         "},
	     {"       __  _  __    ","       ||    ::`     || \/ |/ ","_\ |  |   |  +      "}, //15
	     {"      | _|/ || _||/ ","       ||          + ||_||_|_|"," | |_ |_  |         "},
	     {"      || / -|| \ |\ ","       ||            |    _ _ ","          | +       "}, //17
	     {"      ||/_/_||_`\| \","      /MM\           |___|_|_|","__________|         "},
	     {"                    ","                              ","                    "}  //19
	    };;

  text = "Where would you like to go?
          You can go to the following places:\n" +
      "1-School\2-Mall\3-Park\4-Home\n" + 
      "Enter the name of the place you wish to go:";
  }
  
  //methods
  public String getImage(){
    return image;
  }
  
  public String getText(){
    return text;}
    
    public void transport(){
        System.out.println(getText() );
        Setting choice = Keyboard.readString();
        setView(choice.getImage() ); }



	DatingSim.view = choice.getImage();
	System.out.println (choice);
      
        System.out.println(DatingSim.view);
        System.out.println("You are now at " + location);
    }
}
