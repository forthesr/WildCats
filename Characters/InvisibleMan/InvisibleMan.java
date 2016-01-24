import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class InvisibleMan extends DatableSO{

    //constructor
    public InvisibleMan(String input){
      name = "Invisible man";
      appearance = new String[13]; 
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
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
       		"                             ",
          "                             " }
       }
       else if (emotion == 2){
       appearance = {
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             " }
       }

       else if (emotion == 3){
      appearance = {
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             " }
       }

       else if (emotion == 4){
       appearance = {
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             ",
          "                             " }
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
        InvisibleMan invisibleMan = new InvisibleMan("invisible man");
        invisibleMan.setAppearance();
        System.out.println(invisibleMan.stringAppearance() );
    }
    
}
