import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class ReaderChat {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "RichardIntro.txt";  //is in same folder
       
        try{
	    //Make a reader thing
	    Scanner reader = new Scanner (new File(fileName));
             
	    //how to seperate the lines!
	    reader.useDelimiter("~");

	    String section1, section2, section3, section4, section5;
	      section1 = "";
	      section2= "";
	      section3 = "";

	      while(reader.hasNext())
		{
		    section1 = reader.next();
		    section2 = reader.next();
		    section3 = reader.next();
		    section4 = reader.next();
		    section5 = reader.next();
		}
	    
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

	    String stringSeperator = "\\r?\\n";
	    ArrayList<String> chatOptions = new ArrayList<String>();
	    chatOptions = section4.split(stringSeperator);
	    
	    ArrayList<String> chatResponses = new ArrayList<String>();
	    chatResponses = section5.split(stringSeperator);

	    /*for(int i = 0; i < sectionsList.size()/4; i++)
		{
		    System.out.println("Name:\t" + sectionsList.get(4*i));
		    System.out.println("Mood:\t" + sectionsList.get(4*i + 1));
		    System.out.println("Line:\t" + sectionsList.get(4*i + 2));
		    System.out.println("\n");
		    }*/
	    for(int i = 0; i < sectionsList.size()/3; i++) {
		
		currentPerson.setAppeareance(parseInt(sectionsList.get(3*i + 1)));
		System.out.print
		System.out.print(sectionsList.get(3*i));
		System.out.println(
	    }
	    
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
    }
}
