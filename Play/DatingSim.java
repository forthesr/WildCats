//Team WildCats - Lisa Shi and Jordan Louie
//APCS1 pd5
//Final Project -- Dating Sim
//2016-01-25

//Driver File

import java.util.Scanner;
import cs1.Keyboard;
import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import cs1.Keyboard;


public class DatingSim { 

    //~~~~~~~~~~~~~~~INSTANCE VARS~~~~~~~~~~~~~~~~
    private static Playa playa;
    private static DatingSim game;
    private DatableSO datingPartner;
    private String[][] view;
    private Setting currentPlace;

    private boolean onDate = false;

    //settings
    private Setting Map = new Map();
    private Setting Home = new Home();
    private Setting Mall = new Mall();
    private Setting McDonuds = new McDonuds();
    private Setting Never21 = new Never21();
    private Setting Park = new Park();
    private Setting School = new School();
    private Setting Class = new Class();
    private Setting Prom = new Prom();

    //CHaracters
    private DatableSO TD = new Daphne();
    private DatableSO CC = new Richard();
    private DatableSO RWFL = new Marisa();
    private DatableSO IM = new InvisibleMan();
    private DatableSO NOI = new Nico();
    private DatableSO S = new Sans();
    private DatableSO AW = new Naomi();

    String dateSpot;
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

	//playing game
	newGame();
    }
    
    public String[][] getView(){ //not sure need bc never getting view from othter place
      return view;
    }

    public void setView(Setting bg){
	view = bg.getImage();
    }

    public DatableSO getDatingPartner(){
      return datingPartner;
    }

    public void setDatingPartner(String person){
	DatableSO choice = TD;

        if (person.equals("Daphne")){
            choice = TD;
	}
        else if (person.equals("Richard")){
            choice = CC;
        }
        else if (person.equals("Marisa")){
            choice = RWFL;
        }
        else if (person.equals("InvisibleMan")){
            choice = IM;
        }
        else if (person.equals("Nico")){
            choice = NOI;
        }
        else if (person.equals("Sans")) {
            choice = S;
        }
        else if (person.equals("Naomi")) {
            choice = AW;
        }
        else {
            System.out.println("You didn't type in the right word");
            System.out.println("Try again");
            transport();
        }
	datingPartner = choice;
    }

    //read dialogue files
    public void readerNorm(DatableSO o, String fileName) {
	// The name of the file to open.
        //String fileName = "RichardChat1.txt";  //is in same folder
       
        try{
	    //Make a reader thing
	    Scanner reader = new Scanner (new File(fileName));
             
	    //how to seperate the lines!
	    reader.useDelimiter("\n");

	    ArrayList<String> sectionsList = new ArrayList<String>();
	    while(reader.hasNext())
		{
		    sectionsList.add(reader.next());              
		}
	    for(int i = 0; i < sectionsList.size()/4; i++) {
		if (sectionsList.get(4*i).equals( "name")) {
		    System.out.println(playa.getName() + ": " + sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
		else {
		    String x = (sectionsList.get(4*i + 1)).substring(0,1);
		    o.setEmotion(Integer.parseInt(x));
		    o.setAppearance();
		    overlay(o);
		    System.out.println(game);
		    System.out.print(sectionsList.get(4*i) + ": ");
		    System.out.println(sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
	    }
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
	
    }

    //read Chat files
    public void readerChat(DatableSO o, String fileName) {
	// The name of the file to open.
        //String fileName = "RichardChat1.txt";  //is in same folder
       
        try{
	    //Make a reader thing
	    Scanner reader = new Scanner (new File(fileName));
             
	    //how to seperate the lines!
	    reader.useDelimiter("~");

	    String section1, section2, section3, section4, section5;
	    section1 = "";
	    section2= "";
	    section3 = "";
	    section4= "";
	    section5 = "";

	    while(reader.hasNext())
		{
		    section1 = reader.next();
		    section2 = reader.next();
		    section3 = reader.next();
		    section4 = reader.next();
		    section5 = reader.next();
		}

	    String stringSeperator = "\\r?\\n";
	    
	    //ArrayList to hold lines
	    ArrayList<String> sectionsList = new ArrayList<String>();
	    for (String s : section1.split(stringSeperator)){
		sectionsList.add(s);
	    }
	    for (String s : section2.split(stringSeperator)){
		sectionsList.add(s);
	    }
	    for (String s : section3.split(stringSeperator)){
		sectionsList.add(s);
	    }
	    /*
	      0-2: preset dialogue
	      3-4: chosen dialogue
	    */

	    ArrayList<String> chatOptions = new ArrayList<String>();
	    for (String s : section4.split(stringSeperator)){
		chatOptions.add(s);
	    }
	    
	    ArrayList<String> chatResponses = new ArrayList<String>();
	    for (String s : section5.split(stringSeperator)){
		chatResponses.add(s);
	    }

	    for(int i = 0; i < sectionsList.size()/4; i++) {
		if (sectionsList.get(4*i).equals( "name")) {
		    System.out.println(playa.getName() + ": " + sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
		else {
		    String x = (sectionsList.get(4*i + 1)).substring(0,1);
		    o.setEmotion(Integer.parseInt(x));
		    o.setAppearance();
		    overlay(o);
		    System.out.println(game);
		    System.out.print(sectionsList.get(4*i) + ": ");
		    System.out.println(sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
	    }

	    System.out.println("How do you want to respond?: (type the number)");
	    for (int i = 0; i < chatOptions.size()/4; i++) {
		System.out.println(i + ": " + chatOptions.get(4*i + 3));
	    }

	    int input = Keyboard.readInt();

	    System.out.println(playa.name + ": " + chatOptions.get(4*input + 3) + "\n");

	    //Set and print DateableSO picture and chat
	    o.setEmotion(Integer.parseInt(chatResponses.get(4*input + 2)));
	    o.setAppearance();
	    overlay(o);
	    System.out.println(game);
	    System.out.print(chatResponses.get(4*input + 1) + ": ");
	    System.out.println(chatResponses.get(4*input + 3));
	    System.out.println("\n");
	    
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
	
    }

    public void transport(){
	Setting choice = Map;
        String nearChoice = Keyboard.readString();
	if (onDate == true) {
	    nearChoice = dateSpot;
        if (nearChoice.equals("Home")){
            choice = Home;}
        else if (nearChoice.equals("Mall")){
            choice = Mall;
        }
        else if (nearChoice.equals("McDonuds")){
            choice = McDonuds;
        }
        else if (nearChoice.equals("Never21")){
            choice = Never21;
        }
        else if (nearChoice.equals("Park")){
            choice = Park;
        }
        else if (nearChoice.equals("School")) {
            choice = School;
        }
        else if (nearChoice.equals("Class")) {
            choice = Class;
        }
        else {
            System.out.println("You didn't type in the right word");
            System.out.println("Try again");
            transport();
        }  }
         if (nearChoice.equals("Home")){
            choice = Home;}
        else if (nearChoice.equals("Mall")){
            choice = Mall;
        }
        else if (nearChoice.equals("McDonuds")){
            choice = McDonuds;
        }
        else if (nearChoice.equals("Never21")){
            choice = Never21;
        }
        else if (nearChoice.equals("Park")){
            choice = Park;
        }
        else if (nearChoice.equals("School")) {
            choice = School;
        }
        else if (nearChoice.equals("Class")) {
            choice = Class;
        }
        else {
            System.out.println("You didn't type in the right word");
            System.out.println("Try again");
            transport();
        }  
	setView(choice);
	currentPlace = choice;
	if (onDate == true) {
	    return;
	}
	else {
	    System.out.println(game);
	    System.out.println(currentPlace.text);
	}
    }
    
    public void overlay(DatableSO person){
	int i = view.length - person.getAppearance().length;
	for (int x = view.length- person.getAppearance().length; x < view.length; x++){
	    view[x][1] = person.getAppearance()[x - i];
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

    //
    public void date(){
	if (datingPartner.affection > 40 && playa.stamina > 5){
	    onDate = true;
	    playa.stamina -= 5;
	    System.out.println("Where would you like to go? You can visit park, class, mcdonuds or never21");
	    dateSpot = Keyboard.readString(); //need dateSpot variable
	    transport();
	    overlay(datingPartner);
	    System.out.println(game);
	    while (playa.stamina > 2) {
		System.out.println("Do you want to chat with them?(y/n): ");
		String ans = Keyboard.readString();
		if (ans.equals("y")){
		    chat();
		}
		else
		    break;
	    }
	    System.out.println("Then it's time for a kiss.");
	    kiss();
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
	if (datingPartner.affection > 50){
	    datingPartner.setAffection(5);
	    //read datingPartner + "kissacceptance.txt";
	    fileName = datingPartner.name + "KissAcceptance.txt";
	}
	else {
	    datingPartner.setAffection(-10);
	    //read datingPartner + "kissrejection.txt";
	    fileName = datingPartner.name + "KissRejection.txt";
	}
	//read fileName
	readerNorm(datingPartner, fileName);
    }

    //chatting with DatableSO
    public void chat(){
	String fileName = "";
    	if (playa.stamina > 2){
	    if (datingPartner.firstMeeting == true) {
		fileName = datingPartner.name + "Intro.txt";
		readerNorm(datingPartner, fileName);
		datingPartner.setFirstMeeting();
		return;
	    }
	    else {
		if (onDate == true ){
		    int chatNum = (int)(Math.random() * 4) + 1;
		    if (chatNum > 2){
			fileName = datingPartner.name + dateSpot +
			    "DateChat" + (chatNum - 2) + ".txt";
		    }
		    else {
			fileName = datingPartner.name +
			    "DateChat" + chatNum + ".txt";
		    }
		}
		else {
		    int chatNum = (int)(Math.random() * 5) + 1;
		    fileName = datingPartner.name + "Chat" + chatNum + ".txt";
		}
		playa.stamina -= 2;
		datingPartner.setAffection(4);
	    }
	}
	else
	    {System.out.println("Hey, you look too tired to chat. Why not take a nap?");}
	//read fileName
	readerChat(datingPartner, fileName);
    }

    //sleep
    public void sleep(){
	System.out.println("Do you want to go to sleep?(y/n):");
	String ans = Keyboard.readString();
	if (ans.equals("n")) {
	    setView(Map);
	    currentPlace = Map;
	}
	else  {
	    System.out.println("Good night!");
	    playa.stamina = 15;
	    playa.days --;
	    System.out.println(game);
	    System.out.println("You wake up feeling refreshed and ready to go!");
	    System.out.println("Only" + playa.days + "left to go before prom!");
	}
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
		System.out.println(game);
		System.out.println(Map.text);
		transport();
		if (currentPlace == Home)
		    break;
		if (currentPlace != Home && currentPlace != Park) 
		    transport();
		setDatingPartner(Keyboard.readString());//maybe fix?
		overlay(datingPartner);
		
		chat();
		System.out.println("Do you want to go on a date?(y/n): ");
		String ans = Keyboard.readString();
		if (ans.equals("y")){
		    date();
		}
		else {oneDay(); }
	}
	sleep();
    }

    public void promDate(){
	System.out.println(Prom.getImage() );
	System.out.println(Prom.getText() );
	String input = Keyboard.readString();
	setDatingPartner(input);
	overlay(datingPartner);
	if (datingPartner.affection < 100){
		readerNorm(datingPartner, datingPartner.name + "promrejection.txt");
		System.out.println("You did your best... or not enough. Try again next time.");
	}
	else {
		readerNorm(datingPartner, datingPartner.name + "promacceptance.txt");
		System.out.println("The night was long. The time was fun. But all good things come to an end. Luckily for you, the end is not here yet.");
		System.out.println("Type in 'end' to say your goodbyes.");
		if (Keyboard.readString().equals("end")){
			readerNorm(datingPartner, datingPartner.name + "end.txt");
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
	while( playa.getDays() > 0) {
	    game.oneDay();
	}
	game.promDate();
    }
    
}
