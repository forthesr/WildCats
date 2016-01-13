public class TsundereDonut extends DatableSO {

    private String name;
    private String[] appearence;
    private String dialogue;
    private int emotion;
    private int affection;
    
    //constructor
    public TsundereDonut(){
	  name = "Daphne";
	  appearance = " "; //must be fixed
	  emotion = 1;
	  affection = 0;
    }
    
    //methods
    //get methods
    public getName () {
      return name;
    }
    
    public getAppearance() {
      return appearance;
    }
    
    public getEmotion() {
      return emotion;
    }
    
    public getAffection() {
      return affection;
    }
    
    //set methods
    
    public setAppearance() {
      if (image == 1 ){
        appearance = "     	  .~I==========+..   
      	     	    	    .:=			    =.. 
     	     	     	   .?~	   / .         . \    =.  
       	     	     	 .? 	\\		  \\	=.
     	     	        .?~		  w		 =.  
      	     	     	.?=	        .....	         =.
      	     	     	 I=	       =.   .I	         =.
      	     	     	 $	       =.   ..           =,
      	     	     	 7=	       =... .?	         =.
      	     	     	    .=++===~=:=====+========.		"
      }
    
    }
    
    
    /* methods
    chat - MUST HAVE INTRO DIALOGUE
      will have preset five dialogues that will be chosen by random
          it will appear as dialogue and then user can chose from 2-3 replies
          will read user input and respond, may add affection
          emotion + appearance may change to match dialogue
    date - will have preset location and dialogues to be chosen by random
          will have chat and kiss options
          user input may result in change in emotion, appearance, and affection
    endGame - the final cutscene of just chatting romance stuff
    */
    
}
