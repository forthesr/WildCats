public class DatableSO extends Character {

    protected String[] appearence;
    protected int affection;
    protected boolean firstMeeting;

    //Accessors
    public String[] getAppearence(){
	return appearence;
    }

    public int getAffection() {
	return affection;
    }

    public boolean getFirstMeeting() {
	return firstMeeting;
    }

    //Mutators
    public void setAppearence(String[] newApp) {
	appearence = newApp;
    }

     public void setAffection(int aff) {
	affection+= aff;
    }

    public void setFirstMeeting() {
	firstMeeting = false;
    }

    //chatting with DatableSO
    public void chat(){
	String fileName;
    	if (stamina > 2){
	    if (onDate == true ){
		int chatNum = 1 + (int)(Math.random() * ((4-1) + 1) );
		if (chatNum > 2){
		    //read datingPartner + dateSpot + "datechat" + (chatNum - 2)
		    fileName = datingPartner + dateSpot +
			"DateChat" + (chatNum - 2);
		}
		else {
		    //read datingPartner + "datechat" + ChatNum;
		    fileName = datingPartner +
			"DateChat" + chatNum;
		}
	    }
	    else {
		int chatNum = 1 + (int)(Math.random() * ((5-1) + 1) );
		//read datingPartner + "chat" + chatNum;
		fileName = datingPartner + "Chat" + chatNum;
	    }
	    //read fileName
	}
	else
	    {System.out.println("Hey, you look too tired to chat. Why not take a nap?")}
	
    }

    //
    public void date(){
	if (affection > 50 && stamina > 5){
	    stamina - 5;
	    System.out.println("Where would you like to go? You can visit park, class, mcdonuds or never21");
	    dateSpot = Keyboard.readString(); //need dateSpot variable
	    setView(dateSpot);
	    dateSpot.overlay(datingPartner);
	    text = dateSpot.getText();       //text is set for going to setting to meet/chat with people
	                                     //need to add dateText or seperate dateSpots
	    System.out.println(getText() );
	}
	else if (stamina < 5){
	    System.out.println("You look a bit tired, shouldn't you go to sleep to regain some energy?");
	    return;
	}
	else if (affection < 50){
	    System.out.println("You're not close enough to ask them out.");
	}
    }

    public void kiss(){
	String fileName;
	if (affection > 60){
	    affection + 5;
	    //read datingPartner + "kissacceptance.txt";
	    fileName = datingPartner + "KissAcceptance.txt";
	}
	else {
	    affectino - 10;
	    //read datingPartner + "kissrejection.txt";
	    fileName = datingPartner + "KissRejection.txt";
	}
	//read fileName
    }



}

