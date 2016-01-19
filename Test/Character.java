public class Character {

    protected String name;
    protected String dialogue;

    protected int emotion; //happy, sad, angry, love

    public String getName() {
	return name;
    }
     public String getDialogue() {
	return dialogue;
    }
     public int getEmotion() {
	return emotion;
    }
    public void setEmotion(int nE) {
	emotion = nE;
    }
}
