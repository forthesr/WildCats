import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class InvisibleMan extends DatableSO{

    //constructor
    public InvisibleMan(){
      name = "Invisible man"; 
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
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
		"                             " };
	}
	else if (emotion == 2){
	    appearance = new String[]{
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             " };
	}

	else if (emotion == 3){
	    appearance = new String[]{
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             " };
	}

	else if (emotion == 4){
	    appearance = new String[]{
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             ",
		"                             " };
	}    }
    
      
    public static void main (String[] args){
        InvisibleMan invisibleMan = new InvisibleMan();
        invisibleMan.setAppearance();
        System.out.println(invisibleMan.stringAppearance() );
    }
    
}
