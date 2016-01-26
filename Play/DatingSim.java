//Team WildCats - Lisa Shi and Jordan Louie
//APCS1 pd5
//Final Project -- Dating Sim
//2016-01-25

//Driver File

import java.util.Scanner;
import cs1.Keyboard;


public class DatingSim { 

    //~~~~~~~~~~~~~~~INSTANCE VARS~~~~~~~~~~~~~~~~
    private Playa playa;
    private DatingSim game;
    private DatableSO datingPartner;
    private String[][] view;
    private Setting currentPlace;

    private boolean onDate = false;

    //~~~~~~~~~~~~~~DEFAULT CONSTRUCTOR~~~~~~~~~~
    public DatingSim(){
	//datingPartner = "";
	view = new String[][] //Welcome Screen
	    {{"____________________","______________________________","____________________"}, //0
	     {"              __    ","      __  _                   ","                    "},
	     {"              \\ \\   ","     / / | |                  ","                    "}, //2
	     {"               \\ \\  ","/\\  / /__| | ___ ___  _ __ ___","   ___              "},
	     {"                \\ \\/","  \\/ / _ \\ |/ __/ _ \\| '_ ` _ ","\\ / _ \\             "}, //4
	     {"                 \\  ","/\\  /  __/ | (_| (_) | | | | |"," |  __/             "},
	     {"                  \\/","  \\/ \\___|_|\\___\\___/|_| |_| |","_|\\___|             "}, //6
	     {"                    ","                              ","                    "},
	     {"         _  _       "," Find a prom date in 10 days! ","        _  _        "}, //8
	     {"        / \\/ \\      ","                              ","       / \\/ \\       "},
	     {"       |      |     ","  A DATING SIM game based on  ","      |      |      "}, //10
	     {"       \\     /      "," Exciting datableSOs, Amazing ","       \\     /      "},
	     {"        \\   /       ","      storylines and YOU!     ","        \\   /       "}, //12
	     {"         \\ /        ","                              ","         \\ /        "},
	     {"          V         ","          Instructions:       ","          V         "}, //14
	     {"                    ","    - Type in your action     ","                    "},
	     {"                    ","  - Be Loyal (One prom date!) ","                    "}, //16
	     {"                    ","    - Pay attention to time   ","                    "},
	     {"                    ","          - HAVE FUN!         ","                    "}, 
	     {"____________________","______________________________","____________________"}  //19
	    };
	newGame();
    }
    
    public String[][] getView(){ //not sure need bc never getting view from othter place
      return view;
    }

    public void setView(Setting bg){
	view = bg.getImage();
    }

    public DateableSO getDatingPartner(){
      return datingPartner;
    }

    public void setDatingPartner(DateableSO person){
      datingPartner = person;
    }

    public void transport(){
        String nearChoice = Keyboard.readString();
        if (nearChoice == "Home"){
            Setting choice = home;}
        else if (nearChoice == "mall"){
            Setting choice = Mall;
        }
        else if (nearChoice == "mcDonuds"){
            Setting choice = McDonuds;
        }
        else if (nearChoice == "never21"){
            Setting choice = Never21;
        }
        else if (nearChoice == "Park"){
            Setting choice = Park;
        }
        else if (nearChoice == "School") {
            Setting choice = School;
        }
        else if (nearChoice == "class") {
            Setting choice = Class;
        }
        else {
            System.out.println("You didn't type in the right word");
            System.out.println("Try again");
            transport();
        }
	setView(choice.getImage());
	currentPlace = choice;
        System.out.println(game);
	System.out.println(currentPlace.text);
    }
    
    public void overlay(DateableSO person){
	for (int x = view.length- person.getAppearance().length; x < view.length; x++){
	    for (int i = 0; i < person.getAppearance().length; i++){
		view[x][2] = person.getAppearance[i];
	    }
	}
    }

    public String toString(){
	String s = "";
	for (String[] a : view) {
	    for (String b : a) {
		s += b;
	    }
	    s += "\n";
	}
	return s;
    }

//chatting with DatableSO
    public void chat(){
	String fileName;
    	if (playa.stamina > 2){
	    if (datingPartner.firstMeeting == true) {
		fileName = datingPartner + "Intro.txt";
		readerNorm(datingPartner, fileName);
		datingPartner.setFirstMeeting();
		return;
	    }
	    else {
		if (onDate == true ){
		    int chatNum = 1 + (int)(Math.random() * ((4-1) + 1) );
		    if (chatNum > 2){
			//read datingPartner + dateSpot + "datechat" + (chatNum - 2)
			fileName = datingPartner + dateSpot +
			    "DateChat" + (chatNum - 2) + ".txt";
		    }
		    else {
			//read datingPartner + "datechat" + ChatNum;
			fileName = datingPartner +
			    "DateChat" + chatNum + ".txt";
		    }
		    kiss();
		}
		else {
		    int chatNum = 1 + (int)(Math.random() * ((5-1) + 1) );
		    //read datingPartner + "chat" + chatNum;
		    fileName = datingPartner + "Chat" + chatNum + ".txt";
		}
	    }
	}
	else
	    {System.out.println("Hey, you look too tired to chat. Why not take a nap?");}
	//read fileName
	readerChat(datingPartner, fileName);
    }

    //
    public void date(){
	if (datingPartner.affection > 50 && playa.stamina > 5){
	    onDate = true;
	    playa.stamina -= 5;
	    System.out.println("Where would you like to go? You can visit park, class, mcdonuds or never21");
	    dateSpot = Keyboard.readString(); //need dateSpot variable
	    setView(dateSpot);
	    view.overlay(datingPartner);

	    chat();
	    onDate = false;
	}
	else if (playa.stamina < 5){
	    System.out.println("You look a bit tired, shouldn't you go to sleep to regain some energy?");
	}
	else if (datingPartner.affection < 50){
	    System.out.println("You're not close enough to ask them out.");
	}
    }

    public void kiss(){
	String fileName;
	if (datingPartner.affection > 60){
	    datingPartner.affection += 5;
	    //read datingPartner + "kissacceptance.txt";
	    fileName = datingPartner + "KissAcceptance.txt";
	}
	else {
	    datingPartner.affection -= 10;
	    //read datingPartner + "kissrejection.txt";
	    fileName = datingPartner + "KissRejection.txt";
	}
	//read fileName
	readerNorm(datingPartner, fileName);
    }
    
    public void newGame() {
	String s;
	String name = "";
	System.out.println(this);

	//Set name
	s = "What is your name?: ";
	System.out.print(s);
	name = Keyboard.readString();

	playa = new Playa( name );
    }

    public void oneDay(){
	
	while (currentPlace != Home) {
		setView(Map);
		Map.transport();
		if (currentPlace != park) 
		    currentPlace.transport();

		setDatingPartner(Keyboard.readString());//maybe fix?
		view.overlay(datingPartner);
		
		chat();
		date();
	}
    	Home.sleep();
    }

    public void promDate(){
	System.out.println(Prom.getImage() );
	System.out.println(Prom.getText() );
	datingPartner = Keyboard.readString();
	prom.overlay(datingPartner);
	if (datingPartner.affection < 100){
		readerNorm(datingPartner, datingPartner + "promrejection.txt");
		System.out.println("You did your best... or not enough. Try again next time.");
	}
	else {
		readerNorm(datingPartner, datingPartner + "promacceptance.txt");
		System.out.println("The night was long. The time was fun. But all good things come to an end. Luckily for you, the end is not here yet.");
		System.out.println("Type in 'end' to say your goodbyes.");
		if (Keyboard.readString().equals("end")){
			readerNorm(datingPartner, datingPartner + "end.txt");
		}
		else {
		    System.out.println("Well, that's it folks! Good night!");
		}
	}
	view = 	 new String[][]   {
	    {"____________________","______________________________","____________________"}, //0
	    {"                    ","                              ","                    "}, //1
	    {"  .-') _    ('-. .-.","   ('-.           ('-.       .","-') _  _ .-') _     "},
	    {" (  OO) )  ( OO )  /"," _(  OO)        _(  OO)     ( ","OO ) )( (  OO) )    "}, //3
	    {" /     '._ ,--. ,--.","(,------.      (,------.,--./ ",",--,'  \\     .'_    "},
	    {" |'--...__)|  | |  |"," |  .---'       |  .---'|   \\ ","|  |\\ ,`'--..._)   "}, //5
	    {" '--.  .--'|   .|  |"," |  |           |  |    |    \\","|  | ) |  |  \\ '   "},
	    {"    |  |   |       |","(|  '--.       (|  '--. |  .  ","   |/  |  |   ' |   "}, //7
	    {"    |  |   |  .-.  |"," |  .--'        |  .--' |  |\\ ","   |   |  |   / :   "},
	    {"    |  |   |  | |  |"," |  `---.       |  `---.|  | \\","   |   |  '--'  /   "}, //9
	    {"    `--'   `--' `--'"," `------'       `------''--   ","`--'   `-------'    "},
	    {"                    ","                              ","                    "}, //11
	    {"         Hey! Did yo","u have fun playing the game? Y","made sure to        "},
	    {"                  St","ay commited to your date, righ","t?                  "}, //13
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
	game = new DatingSim();

	while( playa.days > 0) {
	    oneDay();
	}
	promDate();
     // System.out.println(view.overlay(person) );

    }
    
}
