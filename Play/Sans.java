import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Sans extends DatableSO{

    //constructor
    public Sans(){
      name = "Sans"; 
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
       		"       MMMM MMMMMM MMMM      ",
       		"     MM                MM    ",
       		"  MM                     MM  ",
       		" M   MMMM          MMMM   M  ",
       		" M  MM   M        M   MM  M  ",
       		" M   MMMMM    M    MMMM   M  ",
       		"  M          MMM         M   ",
       		"  M                      M   ",
       		" M      .MMMMMMMMMM.      M  ",
		"  M       M.N.N..M       M   ",
		"   MMMM               MMM    ",
		"       MMMMMMMMMMMMMMM       " };
	}

	else if (emotion == 2){
	    appearance = new String[]{
		"       MMMM MMMMMM MMMM      ",
		"     MM                MM    ",
		"  MM                     MM  ",
		" M                 MMMM   M  ",
		" M  MM   M        M   MM  M  ",
		" M   NMMMN    M    MMMM   M  ",
		"  M          MMM         M   ",
		"  M                      M   ",
		" M      .MMMMMMMMMM.      M  ",
		"  M       M.N.N..M       M   ",
		"   MMMM               MMM    ",
		"       MMMMMMMMMMMMMMM       " };
	}

	else if (emotion == 3){
	    appearance = new String[]{
		"       MMMM MMMMMM MMMM      ",
		"     MM                MM    ",
		"  MM                     MM  ",
		" M   NN..          ..**   M  ",
		" M  NN   N        .. * *  M  ",
		" M   NNNN     M     ***   M  ",
		"  M          MMM         M   ",
		"  M                      M   ",
		" M      N         N     M    ",
		"  M       NMMMMMMN       M   ",
		"   MMMM               MMM    ",
		"       MMMMMMMMMMMMMMM       " };
	}
	else if (emotion == 4){
	    appearance = new String[]{
		"       MMMM MMMMMM MMMM    ",
		"    MM               MM    ",
		"  MM                   MM  ",
		" M   NMMN                M ",
		" M  M * M         .   N  M ",
		" M   MMM      M   NMMN   M ",
		"  M          MMM        M  ",
		"  M                     M  ",
		" M      .M       M.     M  ",
		"  M       M.....M        M ",
		"   MMMM               MMM  ",
		"       MMMMMMMMMMMMMMM     " };
	}
    }
    
    public static void main (String[] args){
        Sans sans = new Sans();
        sans.setAppearance();
        System.out.println(sans.stringAppearance() );
        sans.chat();
    }
    
}
