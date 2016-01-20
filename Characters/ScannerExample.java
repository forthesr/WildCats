import java.io.*; //This is to use Java's FileReader class.
import java.util.ArrayList;

import java.util.Scanner; //This is to use Java's Scanner class.
//file reader = scanner!  They're basicaly the same thing.


public class Test2 {


    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "Intro.txt";  //is in same folder

          //final constants mean that they cannot be changed..
  //They are capitalbbecause that is good conventions 
        final int NAME_INDEX = 0;
        final int MOOD_INDEX = 1;
        final int QUOTE_INDEX = 2;
       
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
              String name, quote;
              int mood;
              name = "";
              quote = "";
              mood = 0;

              ArrayList<String> sectionsList = new ArrayList<String>();

              //ou have to initialize them, because java is a dumb poop
              // butt and says you need something.
             
              //While not at the end of the file
              while(reader.hasNext())
              {
               sectionsList.add(reader.next());
               System.out.println("how mch stuff got addded: " + sectionsList.size());
              }
             
             
              //What if you want the first line, then second line, then third line?
              //Here's how you split a string:

              String stringSeperator = "\\r?\\n";
              int howManyParts = sectionsList.size();

              //System.out.println("in the first section : " + sectionsList.get(0));

              //System.out.println("printing stuff in the first section: ");
              String part1[] = sectionsList.get(0).split(stringSeperator);
              
              /*for(int i = 0; i < part1.length; i++)
              {

                System.out.println(part1[i]);
              }*/

              name = part1[NAME_INDEX];
              mood = Integer.parseInt(part1[MOOD_INDEX]);
              quote = part1[QUOTE_INDEX];

              System.out.println("Here is the name: " + name + " here is the mood: " + mood 
                    + "here is waifu quote: \n" + quote);

              /*
              String stringSeperator = "\\r?\\n";
              String sec1[] = section1.split(stringSeperator);
             
              for(int i = 0; i < sec1.length; i++)
              {
               System.out.println("split a string: " + sec1[i]);
               }
             
              System.out.println("This is the first line of the text document: " + sec1[0]);
             

             /*
              //Great! Now what's another way of doing this?
              //Make a string array to hold everything if you don't know how many there are?
             
              /*
              ArrayList<String> sectionsList = new ArrayList<String>();
             while(reader.hasNext())
              {
                sectionsList.add(reader.next());              
               System.out.println("sections length: " + sectionsList.size());
              }
             
              */
              //very important! close things!  when you are done!
              reader.close();
              }
          catch(FileNotFoundException ex){
          System.out.println("Had a problem finding the file");
        }
    }
}
