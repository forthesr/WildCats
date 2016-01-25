import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Marisa extends DatableSO{

    //constructor
    public Marisa(){
      name = "Marisa";
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
       		"       MNNNNNNNNN.           ",
       		"     NNNNNNNNNMNNNN.         ",
       		"   ,NNNNNNNNNNNMNNNN+        ",
       		"   NNNN  NNNNNNNMNNNN        ",
       		"  MNNNN -      ^ 8MNNN       ",
       		" MNNNM 0      0  MMNN        ",
       		"  NNNN     c      :NM        ",
       		"  .MNM     __     MNN.       ",
       		"  NNMMM        MMMNN         ",
		"    MNNMMO   $$MMMMN         ",
		"    MMMN$     $$MMMN         " };
	}


	else if (emotion == 2){
	    appearance = new String[]{
		"       MNNNNNNNNN.           ",
		"     NNNNNNNNNMNNNN.         ",
		"   ,NNNNNNNNNNNMNNNN+        ",
		"   NNNN  NNNNNNNMNNNN        ",
		"  MNNNN /     \\  8MNNN       ",
		" MNNNM  0     0  MMNN        ",
		"  NNNN     c      :NM        ",
		"  .MNM     __     MNN.       ",
		"  NNMMM        MMMNN         ",
		"    MNNMMO   $$MMMMN         ",
		"    MMMN$     $$MMMN         " };
	}

	else if (emotion == 3){
	    appearance = new String[]{
		"       MNNNNNNNNN.           ",
		"     NNNNNNNNNMNNNN.         ",
		"   ,NNNNNNNNNNNMNNNN+        ",
		"   NNNN  NNNNNNNMNNNN        ",
		"  MNNNN \\      / 8MNNN       ",
		" MNNNM  0     0  MMNN        ",
		"  NNNN     c      :NM        ",
		"  .MNM     o      MNN.       ",
		"  NNMMM        MMMNN         ",
		"    MNNMMO   $$MMMMN         ",
		"    MMMN$     $$MMMN         " };
	}

	else if (emotion == 4){
	    appearance = new String[]{
		"       MNNNNNNNNN.           ",
		"     NNNNNNNNNMNNNN.         ",
		"   ,NNNNNNNNNNNMNNNN+        ",
		"   NNNN  NNNNNNNMNNNN        ",
		"  MNNNN ~     ~  8MNNN       ",
		" MNNNM  0     0  MMNN        ",
		"  NNNN     c      :NM        ",
		"  .MNM ``  w ``   MNN.       ",
		"  NNMMM        MMMNN         ",
		"    MNNMMO   $$MMMMN         ",
		"    MMMN$     $$MMMN         " };
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
        Marisa reporterWaifu = new Marisa();
        reporterWaifu.setAppearance();
        System.out.println(reporterWaifu.stringAppearance() );
    }
    
}
