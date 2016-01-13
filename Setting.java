public class Setting {

    /*
      map

      places to meet people
        sansland
	hospital/doctors office
	
	mall
	  mcdonuds -- meet cashier or donut
	  forever54
	  bed, toilet and nowhere (sofa, sink, and somewhere)
	  something like gamestop
	school
	  class
	  cafeteria
	  auditorium

      date locations
        resturant 
	beach
	
      
     */
    protected String image;
    protected String text;

    public static void pickPlace {
	System.out.println ("1-School\t2-Mall\3-Hospital/Doctor's Office");
	System.out.println ("Enter the number of the place you wish to go:");
	String choice = Keyboard.readInt();

	if (choice = 1) {
	    //School
	}
	if (choice = 2) {
	    //Mall
	}
	if (choice = 3) {
	    //Hospital/Doctor's Office
	}
    }
}
