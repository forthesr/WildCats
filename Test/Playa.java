public class Playa extends Character {

    /*protected String name;
    protected String dialogue;
    protected int emotion;*/

    private int stamina;
    private int days;
    
    
    //Constructors
    public Playa(String n) {
	name = n;
	dialogue = "";
	emotion = 1;
	
	stamina = 12;
	days = 10;
    }

    //accessors
    public int getStamina (){
	return stamina;
    }

     public int getDays (){
	return days;
    }
    /*    setName - replace default name "" to user input
    setAppearance - set as ""
    setEmotion - default 1, happy
    setStamina - set to 12
    setDialogue - set as ""
    */
    
}
