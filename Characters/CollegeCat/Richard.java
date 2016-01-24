import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Richard extends DatableSO{

    //constructor
    public Richard(String input){
      name = input;
      appearance = new String[12]; 
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
       appearance = {
       		" M                      M     ",
       		" MMMM                MMMM     ",
       		"  MMM  MMMM   MMM    MMM      ",
       		" MMMM                MMMM     ",
       		"  MM   MMM       MMM   MMM    ",
       		"  MM  M 0M      M 0 M  MM     ",
       		"  MMM  M   MMM     M  MMM     ",
       		"   MM       M         MM      ",
       		"      MM    ω      MM         ",
          "       MM        MM           ",
          "         MMMMMMMM             " }
       }
       else if (emotion == 2){
       appearance = {
       	" M                      M     ";
    		" MMMM                MMMM     ",
    		"  MMM  MMMM   MMM    MMM      ",
    		"  MMMM               MMMM     ",
    		"  MM   MM`      `MM    MMM    ",
    		"  MM  M 0         0M   MM     ",
    		"   MMM     MMM        MMM     ",
    		"    MM      M         MM      ",
    		"      MM    ^      MM         ",
        "       MM        MM           ",
        "         MMMMMMMM             " }
          }
       else if (emotion == 3){
       appearance = {
        " M                      M     ";
        " MMMM                MMMM     ",
        "  MMM  MMMM   MMM    MMM      ",
        "  MMMM               MMMM     ",
        "  MM   MM\      /MM    MMM    ",
        "  MM  M 0         0M   MM     ",
        "   MMM     MMM        MMM     ",
        "    MM      M        MM       ",
        "      MM    -(     MM         ",
        "       MM        MM           ",
        "         MMMMMMMM             " }
          }
       else if (emotion == 4){
       appearance = {
        " M                      M     ";
        " MMMM                MMMM     ",
        "  MMM  MMMM   MMM    MMM      ",
        "  MMMM               MMMM     ",
        "  MM   MM`      `MM    MMM    ",
        "  MM  M 0         0M   MM     ",
        "   MMM  // MMM  //    MMM     ",
        "    MM      M        MM       ",
        "      MM    ω      MM         ",
        "       MM        MM           ",
        "         MMMMMMMM             " }
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
        Richard richard = new Richard("Richard");
        richard.setAppearance();
        System.out.println(richard.stringAppearance() );
        richard.chat();
    }
    
}
