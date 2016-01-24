import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class Reader {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "RichardIntro.txt";  //is in same folder
       
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
	    reader.useDelimiter("\n");
             
	    //Make Strings to hold the sections to seperate it into.
	    //This is 1 way to do it, if you know how many parts there are.
	    /*String section1, section2, section3;
	    section1 = "";
	    section2= "";
	    section3 = "";
	    //ou have to initialize them, because java is a dumb poop butt and says you need something.
             
	    //While not at the end of the file
	    while(reader.hasNext())
		{
		    section1 = reader.next();
		    section2 = reader.next();
		    section3 = reader.next();
              
		    System.out.println("Section 1: " + section1 + " \n Section 2: " + section2 + "\n Section 3: " + section3);
		}
             
             
	    //What if you want the first line, then second line, then third line?
	    //Here's how you split a string:
	    String stringSeperator = "\\r?\\n";
	    String sec1[] = section1.split(stringSeperator);
             
	    for(int i = 0; i < sec1.length; i++)
		{
		    System.out.println("split a string: " + sec1[i]);
		}
             
	    System.out.println("This is the first line of the text document: " + sec1[0]);*/
             
	    //Great! Now what's another way of doing this?
	    //Make a string array to hold everything if you don't know how many there are?
	    
	    ArrayList<String> sectionsList = new ArrayList<String>();
	    while(reader.hasNext())
		{
		    sectionsList.add(reader.next());              
		    System.out.println("sections length: " + sectionsList.size());
		}
	    for(int i = 0; i < sectionsList.size()/4; i++)
		{
		    System.out.println("Name:\t" + sectionsList.get(4*i));
		    System.out.println("Mood:\t" + sectionsList.get(4*i + 1));
		    System.out.println("Line:\t" + sectionsList.get(4*i + 2));
		    System.out.println("\n");
		}
	    System.out.println(sectionsList.get(5));
             
	    
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
    }
}
