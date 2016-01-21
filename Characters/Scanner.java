import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class Scanner {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "Intro.txt";  //is in same folder
       
	//an exmple on how to do convos
        //convo1
        //convo 2 /folderNAme/.txt
        //convo3
       
        //random generator (1-3)
        //fileNAme = "convo" + gen# + ".txt"
          
        //Try catch! JAva won't like it if you try to do something
        //When there's no file. So anything that involves reading in a file
        //Should go in a TRY CATCH statement.
       
        try{
	    //Make a reader thing
	    Scanner reader = new Scanner (new File(fileName));
             
	    //how to seperate the lines!
	    reader.useDelimiter("~");
             
	    //Make Strings to hold the sections to seperate it into.
	    //This is 1 way to do it, if you know how many parts there are.
	    String section1, section2, section3, section4, section5, section6;
	    section1 = "";
	    section2 = "";
	    section3 = "";
	    section4 = "";
	    section5 = "";
	    section6 = "";
	    //ou have to initialize them, because java is a dumb poop butt and says you need something.
             
	    //While not at the end of the file
	    while(reader.hasNext())
		{
		    section1 = reader.next();
		    section2 = reader.next();
		    section3 = reader.next();
		    section4 = reader.next();
		    section5 = reader.next();
		    section6 = reader.next();
              
		    // System.out.println("Section 1: " + section1 + " \n Section 2: " + section2 + "\n Section 3: " + section3);
		}
             
             
	    //What if you want the first line, then second line, then third line?
	    //Here's how you split a string:
	    String stringSeperator = "\\r?\\n";
	    ArrayList<String> secList = new ArrayList<String>();

	    for (String s : section1.split(stringSeperator)){
		secList.add(s);
	    }
	    for (String s : section2.split(stringSeperator)){
		secList.add(s);
	    }
	    for (String s : section3.split(stringSeperator)){
		secList.add(s);
	    }
	    for (String s : section4.split(stringSeperator)){
		secList.add(s);
	    }
	    for (String s : section5.split(stringSeperator)){
		secList.add(s);
	    }
	    for (String s : section6.split(stringSeperator)){
		secList.add(s);
	    }
	    
             
	    for(int i = 0; i < secList.size()/4; i++)
		{
		    System.out.println("Name:\t" + secList.get(4*i));
		    System.out.println("Mood:\t" + secList.get(4*i + 1));
		    System.out.println("Line:\t" + secList.get(4*i + 2));
		    System.out.println("\n");
		}
             
	    
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
    }
}
