import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class TsundereDonut{

    private String name;
    private static String[] appearance;
    private String dialogue;
    private int emotion;
    private int affection;
    private boolean firstMeeting;
    
    //constructor
    public TsundereDonut(){
      appearance = new String[12]; 
      emotion = 1;
      affection = 0;
      firstMeeting = true;
    }
    
    public TsundereDonut(String input){
      name = input;
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
        appearance[0] = "      .~I==========+..       ";
        appearance[1] = "    .:=             =..      ";
        appearance[2] = " .?~  / .      . ~   =.     ";
        appearance[3] = " .?     //      //    =.     ";
        appearance[4] = " .?~         w         =.    ";
        appearance[5] = ".?=         .....       =.   ";
        appearance[6] = "I=        =.   .I       =.   ";
        appearance[7] = "$         =.   ..        =,  ";
        appearance[8] = " .=++===~=:=====+========.    "; 
    } }
    
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
        TsundereDonut daphne = new TsundereDonut("Daphne");
        daphne.setAppearance();
        System.out.println(daphne.stringAppearance() );
        daphne.chat();
    }
    
}

