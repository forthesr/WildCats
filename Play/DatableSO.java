public class DatableSO extends Character {

    protected String[] appearence;

    protected int affection;
    protected boolean firstMeeting;

    public String[] getAppearance() {
	return appearance;
    }

    public String getAppearance(int a){
	return appearance[a];
    }
    
    public int getAffection() {
	return affection;
    }
    
    public boolean getFirstMeeting(){
        return firstMeeting;
    }

    //mutators
    public void setAffection(int a){
        affection = affection + a;
    }
    
    public void setFirstMeeting(){
        firstMeeting = false;
    }

    //to make appearance a string to print out
    public String stringAppearance() {
	String newStr = "";
	for (int i = 0; i < appearance.length; i++){
	    newStr += getAppearance(i) + "\n";
	}
	return newStr;
    }
    
}
