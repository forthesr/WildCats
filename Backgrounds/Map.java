import java.util.Scanner;

public class Map extends Setting {

    private String image;
    private String text;
  
  //Constructor
  public Map(){
  image = "";
  text = "Where would you like to go?
          You can go to the following places(type them into the terminal):
            Mall  ";
  }
  
  //methods
  public String getImage(){
    return image;
  }
  
  public String getText(){
    return text;}
    
    public void transport(){
        System.out.println(text);
        String location = Keyboard.readString();
        image = location.getImage();
        System.out.println(image);
        System.out.println("You are now at" + location);
    }

     public void pickPlace {
	System.out.println ("1-School\t2-Mall\3-Hospital/Doctor's Office");
	System.out.println ("Enter the number of the place you wish to go:");
	String choice = Keyboard.readInt();

	if (choice = 1) {
	    //School
	}
	if (choice = 2) {
	    //Mall
	}
	if (choice = 3) {
	    //Hospital/Doctor's Office
	}

}
