import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Daphne extends DatableSO{
    
    public Daphne(){
      name = "Daphne";
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
		"        .~I==========+..      ",
		"      .:=             =..     ",
		"   .?~  / .      . ~   =.     ",
		"   .?     //      //    =.    ",
		"   .?~         w         =.   ",
		"  .?=         .....       =.  ",
		"  I=        =.   .I       =.  ",
		"  $         =.   ..        =, ",
		"   .=++===~=:=====+========.  ",
	    };
	}
	else if (emotion == 2){
	    appearance = new String[]{
		"        .~I==========+..      ",
		"      .:=             =..     ",
		"     .?~    \\  /      =.     ",
		"    .?   `` @  @  ``  =.   ",
		"   .?~         #         =.   ",
		"  .?=         .....       =.  ",
		"  I=        =.   .I       =.  ",
		"  $         =.   ..        =, ",
		"   .=++===~=:=====+========.  ",
	    };
	}
	else if (emotion == 3){
	    appearance = new String[]{
		"       .~I==========+..       ",  
		"     .:=             =..      ",
		"    .?~     \\ /      =.      ",
		"   .?       ,o o,       =.    ",
		"  .?~        ___         =.   ",
		"  .?=         .....       =.  ",
		"  I=        =.   .I       =.  ",
		"  $         =.   ..        =, ",
		"  .=++===~=:=====+========.   ",
	    };
	}
	else if (emotion == 4){
	    appearance = new String[]{
		"        .~I==========+..      ",
		"      .:=             =..     ",
		"    .?~       ^  ^     =.     ",
		"    .?     ''     ''   =.    ",
		"   .?~         w         =.   ",
		"  .?=         .....       =.  ",
		"  I=        =.   .I       =.  ",
		"  $         =.   ..        =, ",
		"   .=++===~=:=====+========.  ",
	    };
	}
    }
    
    
    public static void main (String[] args){
        Daphne daphne = new Daphne();
        daphne.setAppearance();
        System.out.println(daphne.stringAppearance() );
    }
    
}
