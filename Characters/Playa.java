public class Playa extends Character {

    protected String name;
    protected String appearence; //dont need?
    protected String dialogue;
    protected int emotion;

    public int stamina;
    public int days = 30;
    
    
    //Constructors
    public Playa(String n) {
	name = n;
	emotion = 1;
	stamina = 15;
	dialogue = "";
    }
    /*    setName - replace default name "" to user input
    setAppearance - set as ""
    setEmotion - default 1, happy
    setStamina - set to 12
    setDialogue - set as ""
    */
    
}
