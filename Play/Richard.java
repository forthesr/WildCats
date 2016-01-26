import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Richard extends DatableSO{

    //constructor
    public Richard(){
      name = "Richard";
      emotion = 1;
      setAppearance(); 
      affection = 0;
      firstMeeting = true;
    }
    //methods
    //set methods
    
    public void setAppearance() {
	if (emotion == 1 ){
	    appearance = new String[]{
       		" M                      M     ",
       		" MMMM                MMMM     ",
       		"  MMM  MMMM   MMM    MMM      ",
       		" MMMM                MMMM     ",
       		"  MM   MMM       MMM   MMM    ",
       		"  MM  M 0M      M 0 M  MM     ",
       		"  MMM  M   MMM     M  MMM     ",
       		"   MM       M         MM      ",
       		"      MM    w      MM         ",
		"       MM        MM           ",
		"         MMMMMMMM             " };
	}
	else if (emotion == 2){
	    appearance = new String[]{
		" M                      M     ",
    		" MMMM                MMMM     ",
    		"  MMM  MMMM   MMM    MMM      ",
    		"  MMMM               MMMM     ",
    		"  MM   MM`      `MM    MMM    ",
    		"  MM  M 0         0M   MM     ",
    		"   MMM     MMM        MMM     ",
    		"    MM      M         MM      ",
    		"      MM    ^      MM         ",
		"       MM        MM           ",
		"         MMMMMMMM             " };
	}
	else if (emotion == 3){
	    appearance = new String[]{
		" M                      M     ",
		" MMMM                MMMM     ",
		"  MMM  MMMM   MMM    MMM      ",
		"  MMMM               MMMM     ",
		"  MM   MM\\      /MM    MMM    ",
		"  MM  M 0         0M   MM     ",
		"   MMM     MMM        MMM     ",
		"    MM      M        MM       ",
		"      MM    -(     MM         ",
		"       MM        MM           ",
		"         MMMMMMMM             " };
	}
	else if (emotion == 4) {
	    appearance = new String[]{
		" M                      M     ",
		" MMMM                MMMM     ",
		"  MMM  MMMM   MMM    MMM      ",
		"  MMMM               MMMM     ",
		"  MM   MM`      `MM    MMM    ",
		"  MM  M 0         0M   MM     ",
		"   MMM  // MMM  //    MMM     ",
		"    MM      M        MM       ",
		"      MM    W      MM         ",
		"       MM        MM           ",
		"         MMMMMMMM             " };
	}
    }

    public static void main (String[] args){
        Richard richard = new Richard();
        richard.setAppearance();
        System.out.println(richard.stringAppearance() );
        richard.chat();
    }
    
}
