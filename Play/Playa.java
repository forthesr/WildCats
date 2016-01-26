public class Playa extends Character {

    public int stamina;
    public int days = 30;
    
    //Constructors
    public Playa(String n) {
	name = n;
	emotion = 1;
	stamina = 15;
    }

    public String getName () {
      return name;
    }

    public int getStamina () {
      return stamina;
    }

    public int getDays () {
      return days;
    }
    
}
