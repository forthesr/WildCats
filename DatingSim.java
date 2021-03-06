//Team WildCats - Lisa Shi and Jordan Louie
//APCS1 pd5
//Final Project -- Dating Sim
//2016-01-08

//Driver File

import java.io.*;
import java.util.Scanner;

public class DatingSim {

    //~~~~~~~~~~~~~~~INSTANCE VARS~~~~~~~~~~~~~~~~
    private Playa playa;
    private DatableSO datingPartner;
    private String[][] view;
    private Setting currentPlace;

    //~~~~~~~~~~~~~~DEFAULT CONSTRUCTOR~~~~~~~~~~
    public DatingSim(){
	//datingPartner = "";
	    public DatingSim(){
	//datingPartner = "";
	view = new String[][] //Welcome Screen
	    {{"____________________","______________________________","____________________"}, //0
	     {"              __    ","      __  _                   ","                    "},
	     {"              \ \   ","     / / | |                  ","                    "}, //2
	     {"               \ \  ","/\  / /__| | ___ ___  _ __ ___","   ___              "},
	     {"                \ \/","  \/ / _ \ |/ __/ _ \| '_ ` _ ","\ / _ \             "}, //4
	     {"                 \  ","/\  /  __/ | (_| (_) | | | | |"," |  __/             "},
	     {"                  \/","  \/ \___|_|\___\___/|_| |_| |","_|\___|             "}, //6
	     {"                    ","                              ","                    "},
	     {"         _  _       "," Find a prom date in 10 days! ","        _  _        "}, //8
	     {"        / \/ \      ","                              ","       / \/ \       "},
	     {"       |      |     ","  A DATING SIM game based on  ","      |      |      "}, //10
	     {"       \     /      "," Exciting datableSOs, Amazing ","       \     /      "},
	     {"        \   /       ","      storylines and YOU!     ","        \   /       "}, //12
	     {"         \ /        ","                              ","         \ /        "},
	     {"          V         ","          Instructions:       ","          V         "}, //14
	     {"                    ","    - Type in your action     ","                    "},
	     {"                    ","  - Be Loyal (One prom date!) ","                    "}, //16
	     {"                    ","    - Pay attention to time   ","                    "},
	     {"                    ","          - HAVE FUN!         ","                    "}, 
	     {"____________________","______________________________","____________________"}  //19
	    };
	newGame();
    }
	newGame();
    }
    
    public String[][] getView(){ //not sure need bc never getting view from othter place
      return view;
    }

    public void setView(String[][] bg){
      view = bg;
    }

    public DatableSO getDatingPartner(){
      return datingPartner;
    }

    public void setDatingPartner(DatableSO person){
      datingPartner = person;
    }

     public void transport(){
        //System.out.println(text);
        Setting choice = Keyboard.readString();

	setView(choice.getImage());
	currentPlace = choice;
        System.out.println(DatingSim);
    }
    
    public void overlay(DatableSO person){

      //Person = new PErson(spersonNAme)
      for (int x = view.length- person.getAppearance().length; x < view.length; x++){
        for (int i = 0; i < person.getAppearance().length; i++){
        view[x][2] = person[i];
      } }
    }

     public String toString() {
	String s = "";
	for (String[] a : view) {
	    for (String b : a) {
		s += b;
	    }
	    s += "\n";
	}
	return s;
    }

    public void newGame() {
	String s;
	String name = "";
	System.out.println(DatingSim);

	//Set name
	s = "What is your name?: ";
	System.out.print(s);

	try {
	    name = Keyboard.readString();
	}
	catch (IOEXception e) {}

	playa = new Playa( name );
    }
    
    public void promDate(){
	System.out.println(Prom.getImage() );
	System.out.println(Prom.getText() );
	datingPartner = Keyboard.readString();
	prom.overlay(datingPartner);
	if (affection < 100){
		readerNorm(datingPartner, datingPartner + "promrejection.txt");
		System.out.println("You did your best... or not enough. Try again next time.");
	}
	else {
		readerNorm(datingPartner, datingPartner + "promacceptance.txt");
		System.out.println("The night was long. The time was fun. But all good things come to an end. Luckily for you, the end is not here yet.");
		System.out.println("Type in 'end' to say your goodbyes.");
		if (Keyboard.readString() == end){
			readerNorm(datingPartner, datingPartner + "end.txt");
		}
		else {"Well, that's it folks! Good night!"};
	}
	view = 	    {{"____________________","______________________________","____________________"}, //0
	     {"                    ","                              ","                    "}, //1
	     {"  .-') _    ('-. .-.","   ('-.           ('-.       .","-') _  _ .-') _     "},
	     {" (  OO) )  ( OO )  /"," _(  OO)        _(  OO)     ( ","OO ) )( (  OO) )    "}, //3
	     {" /     '._ ,--. ,--.","(,------.      (,------.,--./ ",",--,'  \     .'_    "},
	     {" |'--...__)|  | |  |"," |  .---'       |  .---'|   \ ","|  |\\ ,`'--..._)   "}, //5
	     {" '--.  .--'|   .|  |"," |  |           |  |    |    \","|  | ) |  |  \\ '   "},
	     {"    |  |   |       |","(|  '--.       (|  '--. |  .  ","   |/  |  |   ' |   "}, //7
	     {"    |  |   |  .-.  |"," |  .--'        |  .--' |  |\\","   |   |  |   / :   "},
	     {"    |  |   |  | |  |"," |  `---.       |  `---.|  |\\","   |   |  '--'  /   "}, //9
	     {"    `--'   `--' `--'"," `------'       `------''--   ","`--'   `-------'    "},
	     {"                    ","                              ","                    "}, //11
	     {"         Hey! Did yo","u have fun playing the game? Y","made sure to        "},
	     {"                  St","ay commited to your date, righ","t?                 "}, //13
	     {"     _      _       ","             ...              ","       _   __  J    "},
	     {"     __    ___      ","Well, you did your best, right","?  \\__    o / O    "}, //15
	     {"    /o     o / L    ","             ...              ","        c      R    "},
	     {"        c      I    ","                              ","        W      D    "}, //17
	     {"        ___    S    ","   Ah, whatever. Play again?  ","               A    "},
	     {"               A    ","                              ","               N    "}  //19
	     };
	System.out.println(view);
}

    
    public static void main(String[] args){
	DatingSim game = new DatingSim();

	/*while( Playa.days > 0) {
	    
	  }*/
     // System.out.println(view.overlay(person) );

    }
    
}
