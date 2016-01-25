import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import cs1.Keyboard;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class ReaderChat {

    public static void readerChat(DateableSO o, String fileName) {
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
		    System.out.println(playa.name + ": " + sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
		else {
		    String x = (sectionsList.get(4*i + 1)).substring(0,1);
		    o.setEmotion(Integer.parseInt(x));
		    o.setAppearance();
		    System.out.println(o.stringAppearance());
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
	    System.out.println(o.stringAppearance());
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
    
    public static void main(String [] args) {
	Richard richard = new Richard();
	readerChat(richard, "RichardChat1.txt");
    }
}
