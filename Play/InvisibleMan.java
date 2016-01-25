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
    
    public void setEmotion(int a){
        emotion = a;
    }
    
    public void setAffection(int a){
        affection = affection + a;
    }
    
    public void setFirstMeeting(){
        firstMeeting = false;
    }
    
    //non-set methods
    public void chat(){
        if (getFirstMeeting() == true){
            System.out.println("you are at McDonuds");
            setAppearance();
            System.out.println(stringAppearance() );
            System.out.println("Welcome to McDonuds");
            
        }
    }
    
   public String stringAppearance() {
      String newStr = "";
      for (int i = 0; i < appearance.length; i++){
        newStr += getAppearance(i) + "\n";
      }
      return newStr;
    }
      
    public static void main (String[] args){
        InvisibleMan invisibleMan = new InvisibleMan();
        invisibleMan.setAppearance();
        System.out.println(invisibleMan.stringAppearance() );
    }
    
}
