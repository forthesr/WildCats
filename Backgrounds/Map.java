import java.util.Scanner;

public class Map extends Setting {

    private String image;
    private String text;
  
  //Constructor
  public Map(){
  image = "";
  text = "Where would you like to go?
          You can go to the following places:\n" +
      "1-School\t2-Mall\3-Hospital/Doctor's Office\n" + 
      "Enter the number of the place you wish to go:";
  }
  
  //methods
  public String getImage(){
    return image;
  }
  
  public String getText(){
    return text;}
    
    public void transport(){
	String location;
        System.out.println(text);
        int choice = Keyboard.readInt();
	if (choice = 1) {
	    DatingSim.view = School.getImage();
	    location = "The School";
	}
	if (choice = 2) {
	    DatingSim.view = Mall.getImage();
	    location = "The Mall";
	}
	if (choice = 3) {
	    DatingSim.view = Hospital.getImage();
	    location = "The Hospital";
	}
      
        System.out.println(DatingSim.view);
        System.out.println("You are now at " + location);
    }
}
