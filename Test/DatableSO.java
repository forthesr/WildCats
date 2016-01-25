public class DatableSO extends Character {

    protected String[] appearence;
    protected int affection;
    protected boolean firstMeeting;

    //Accessors
    public String[] getAppearance(){
	return appearence;
    }

    public int getAffection() {
	return affection;
    }

    public boolean getFirstMeeting() {
	return firstMeeting;
    }

    //Mutators
    public void setAppearance(String[] newApp) {
	appearence = newApp;
    }

     public void setAffection(int aff) {
	affection+= aff;
    }

    public void setFirstMeeting() {
	firstMeeting = false;
    }
}

