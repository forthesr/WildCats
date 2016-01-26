import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Naomi extends DatableSO{

    //constructor
    public Naomi(){
      name = "Naomi";
      emotion = 1;
      affection = 0;
      firstMeeting = true;
    }
    //methods
    //set methods
    
    public void setAppearance() {
	if (emotion == 1 ){
	    appearance = new String[] {
       		"          |\\,/|              ",
       		"     /||||||||||\\            ",
       		"    ||||||||||||||           ",
       		"    |||| ___ |||||           ",
       		"    ||   {o}   |||           ",
       		"    ||    c    |||           ",
       		"    ||\\  __    |||           ",
       		"    |||\\_  ___/||            ",
       		"     |  |   |  |             ",
		"       |     |               " };
	}
	else if (emotion == 2){
	    appearance = new String[]{
		"          |\\,/|              ",
		"   ` /||||||||||\\            ",
		" ` `||||||||||||||           ",
		"    |||| ___ |||||           ",
		"    ||   {-}   |||           ",
		"    ||    c    |||           ",
		"    ||\\   _    |||           ",
		"    |||\\_  ___/||            ",
		"     |  |   |  |             ",
		"       |     |               " };
	}

	else if (emotion == 3){
	    appearance = new String[]{
		"          |\\,/|              ",
		"     /||||||||||\\            ",
		"    ||||||||||||||           ",
		"    |||| ___ |||||           ",
		"    ||   {0}   |||           ",
		"    ||    c    |||           ",
		"    ||\\   o    |||           ",
		"    |||\\_  ___/||            ",
		"     |  |   |  |             ",
		"       |     |               " };
	}

	else if (emotion == 4){
	    appearance = new String[]{
		"          |\\,/|              ",
		"  *  /||||||||||\\   *        ",
		"    ||||||||||||||           ",
		" *  |||| ___ |||||           ",
		"    ||   {^}   ||| *         ",
		"  * ||    c    |||           ",
		"    ||\\   u    |||   *       ",
		"    |||\\_  ___/||            ",
		"     |  |   |  |             ",
		"       |     |               " };
	}    }
    
    public static void main (String[] args){
        Naomi naomi = new Naomi();
        naomi.setAppearance();
        System.out.println(naomi.stringAppearance() );
        naomi.chat();
    }
    
}
