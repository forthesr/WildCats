//Team WildCats - Lisa Shi and Jordan Louie
//APCS1 pd5
//Final Project -- Dating Sim
//2016-01-08

//Driver File


public class DatingSim {

    private Playa playa;
    private DatableSO datingPartner;
    private String[][] view;
    private Setting currentPlace;

    public DatingSim(){
	//datingPartner = "";
	view = new String[][]
	    {{"____________________","___________________________________","____________________"}, //0
	     {"||||||||||||||||||||","||||||||||||||WELCOME||||||||||||||","||||||||||||||||||||"}, //1
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //3
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //5
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //7
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //9
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //11
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"}, //13
	     {"||||||||||||||||||||","|||||||||||||||||||||||||||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"}, //15
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||    o|||o    |||||||||||","||||||||||||||||||||"}, //17
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"},
	     {"||||||||||||||||||||","|||||||||||     |||     |||||||||||","||||||||||||||||||||"}  //19
	    };
	newGame();
    }
    
    public String[][] getView(){
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

	while( Playa.days > 0) {
	    
	}
     // System.out.println(view.overlay(person) );

    }
    
}
