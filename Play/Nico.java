import java.util.Arrays;
import java.io.*; 
import java.util.Scanner;

public class Nico extends DatableSO{

    //constructor
    public Nico(){
      name = "Nico";
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
       		"           NNNN              ",
       		"   |\\/| NNNNNNNNMNNNN.|\\./|  ",
       		"   |/;NNNNNNNNNNNMNNNN|/M |  ",
       		"   MNNNNN  NNNNN NMNNN MMMM  ",
       		"  MMM NNN   NN    8MNN  MM   ",
       		"  MMM NNN ^  N  ^ 8MNN  MM   ",
       		"  MM  NN     .      :N   MM  ",
       		"   M,  M     w      M ., ,M  ",
       		"  .__||  MM       MM  ||__.  ",
		"  |||||.  MO   $$M   .|||||  " };
	}
	else if (emotion == 2){
	    appearance = new String[]{
		"           NNNN              ",
		"   |\\/| NNNNNNNNMNNNN.|\\./|  ",
		"   |/;NNNNNNNNNNNMNNNN|/M |  ",
		"   MNNNNN  NNNNN NMNNN MMMM  ",
		"  MMM NNN   NN    8MNN  MM   ",
		"  MMM NNN`o  N  o`8MNN  MM   ",
		"  MM  NN     .      :N   MM  ",
		"   M,  M     ^      M .  ,M  ",
		"         MM       MM         ",
		"          MO   $$M           " };
	}

	else if (emotion == 3){
	    appearance = new String[]{
		"           NNNN              ",
		"   |\\/| NNNNNNNNMNNNN.|\\./|  ",
		"   |/;NNNNNNNNNNNMNNNN|/M |  ",
		"   MNNNNN  NNNNN NMNNN MMMM  ",
		"  MMM NNN \\ NN  / 8MNN  MM   ",
		"  MMM NNN 0  N  0 8MNN  MM   ",
		"  MM  NN     .      :N   MM  ",
		"   M,  M    (A)     M .  ,M  ",
		"         MM       MM         ",
		"          MO   $$M           " };
	}

	else if (emotion == 4){
	    appearance = new String[]{
		"           NNNN              ",
		"   |\\/| NNNNNNNNMNNNN.|\\./|  ",
		"   |/;NNNNNNNNNNNMNNNN|/M |  ",
		"   MNNNNN  NNNNN NMNNN MMMM  ",
		"  MMM NNN   NN    8MNN  MM   ",
		"  MMM NNN`o  N  o`8MNN  MM   ",
		"  MM  NN  \\ .  \\  :N   MM  ",
		"   M,  M     w      M .  ,M  ",
		"         MM       MM         ",
		"          MO   $$M           " };
	}    }
    
    public static void main (String[] args){
        Nico nico = new Nico();
        nico.setAppearance();
        System.out.println(nico.stringAppearance() );
    }
    
}
