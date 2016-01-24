import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Daphne extends DatableSO{
    
    public Daphne(String input){
      name = "Daphne";
      appearance = new String[9]; 
      emotion = 1;
      affection = 0;
      firstMeeting = true;
    }
    //methods
    //get methods
    public String getName () {
      return name;
    }
    
    public String[] getAppearance() {
      return appearance;
    }

    public String getAppearance(int a){
      return appearance[a];
    }
    
    public int getEmotion() {
      return emotion;
    }
    
    public int getAffection() {
      return affection;
    }
    
    public boolean getFirstMeeting(){
        return firstMeeting;
    }
    
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
		"    .?   灬灬 @  @  灬灬  =.   ",
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
		"    .?     灬      灬    =.    ",
		"   .?~         w         =.   ",
		"  .?=         .....       =.  ",
		"  I=        =.   .I       =.  ",
		"  $         =.   ..        =, ",
		"   .=++===~=:=====+========.  ",
	    };
	}
    }
    
    public void setEmotion(int a){
        emotion = a;
    }
    
    public void setAffection(int a){
        affection = affection + a;
    }
    
    public void setFirstMeeting(){
        firstMeeting = false;
    }
    
    
   public String stringAppearance() {
      String newStr = "";
      for (int i = 0; i < appearance.length; i++){
        newStr += getAppearance(i) + "\n";
      }
      return newStr;
    }

    /* methods
    chat - MUST HAVE INTRO DIALOGUE
      will have preset five dialogues that will be chosen by random
          it will appear as dialogue and then user can chose from 2-3 replies
          will read user input and respond, may add affection
          emotion + appearance may change to match dialogue
    date - will have preset location and dialogues to be chosen by random
          will have chat and kiss options
          user input may result in change in emotion, appearance, and affection
    endGame - the final cutscene of just chatting romance stuff
    */
    
    
    public static void main (String[] args){
        Daphne daphne = new Daphne("Daphne");
        daphne.setAppearance();
        System.out.println(daphne.stringAppearance() );
    }
    
}
