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
        Sans sans = new Sans();
        sans.setAppearance();
        System.out.println(sans.stringAppearance() );
        sans.chat();
    }
    
}
