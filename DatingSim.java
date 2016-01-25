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
    
    public static void main(String[] args){
	DatingSim game = new DatingSim();

	/*while( Playa.days > 0) {
	    
	  }*/
     // System.out.println(view.overlay(person) );

    }
    
}
