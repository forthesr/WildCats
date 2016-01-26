import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

//import Keyboard;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class ReaderNorm {

    public static void readerNorm(DatableSO o, String fileName) {
	// The name of the file to open.
        //String fileName = "RichardChat1.txt";  //is in same folder
       
        try{
	    //Make a reader thing
	    Scanner reader = new Scanner (new File(fileName));
             
	    //how to seperate the lines!
	    reader.useDelimiter("\n");

	    ArrayList<String> sectionsList = new ArrayList<String>();
	    while(reader.hasNext())
		{
		    sectionsList.add(reader.next());              
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
	    //very important! close things!  when you are done!
	    reader.close();
	}
	catch(FileNotFoundException ex){
	    System.out.println("Had a problem finding the file");
        }
	
    }


    public static void main(String [] args) {
	Daphne daphne = new Daphne("daphne duhh");
	readerNorm(daphne, "kissacceptance.txt");
    }
}
