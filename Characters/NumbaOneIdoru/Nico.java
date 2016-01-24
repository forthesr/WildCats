import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Nico extends DatableSO{

    //constructor
    public Nico(String input){
      name = "Nico";
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
       		"           NNNN              ",
       		"   |\/| NNNNNNNNMNNNN.|\./|  ",
       		"   |/;NNNNNNNNNNNMNNNN|/M |  ",
       		"   MNNNNN  NNNNN NMNNN MMMM  ",
       		"  MMM NNN   NN    8MNN  MM   ",
       		"  MMM NNN ^  N  ^ 8MNN  MM   ",
       		"  MM  NN     .      :N   MM  ",
       		"   M,  M     w      M ., ,M  ",
       		"  .__||  MM       MM  ||__.  ",
          "  |||||.  MO   $$M   .|||||  " }
       }
       else if (emotion == 2){
      appearance = {
          "           NNNN              ",
          "   |\/| NNNNNNNNMNNNN.|\./|  ",
          "   |/;NNNNNNNNNNNMNNNN|/M |  ",
          "   MNNNNN  NNNNN NMNNN MMMM  ",
          "  MMM NNN   NN    8MNN  MM   ",
          "  MMM NNN`o  N  o`8MNN  MM   ",
          "  MM  NN     .      :N   MM  ",
          "   M,  M     ^      M .  ,M  ",
          "         MM       MM         ",
          "          MO   $$M           " }
       }

       else if (emotion == 3){
      appearance = {
          "           NNNN              ",
          "   |\/| NNNNNNNNMNNNN.|\./|  ",
          "   |/;NNNNNNNNNNNMNNNN|/M |  ",
          "   MNNNNN  NNNNN NMNNN MMMM  ",
          "  MMM NNN \ NN  / 8MNN  MM   ",
          "  MMM NNN 0  N  0 8MNN  MM   ",
          "  MM  NN     .      :N   MM  ",
          "   M,  M    (A)     M .  ,M  ",
          "         MM       MM         ",
          "          MO   $$M           " }
       }

       else if (emotion == 4){
       appearance = {
          "           NNNN              ",
          "   |\/| NNNNNNNNMNNNN.|\./|  ",
          "   |/;NNNNNNNNNNNMNNNN|/M |  ",
          "   MNNNNN  NNNNN NMNNN MMMM  ",
          "  MMM NNN   NN    8MNN  MM   ",
          "  MMM NNN`o  N  o`8MNN  MM   ",
          "  MM  NN  \\ .  \\  :N   MM  ",
          "   M,  M     w      M .  ,M  ",
          "         MM       MM         ",
          "          MO   $$M           " }
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
    
   public String stringAppearance() {
      String newStr = "";
      for (int i = 0; i < appearance.length; i++){
        newStr += getAppearance(i) + "\n";
      }
      return newStr;
    }
      
    public static void main (String[] args){
        Nico nico = new Nico("nico");
        nico.setAppearance();
        System.out.println(nico.stringAppearance() );
    }
    
}
