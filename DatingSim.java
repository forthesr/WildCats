//Team WildCats - Lisa Shi and Jordan Louie
//APCS1 pd5
//Final Project -- Dating Sim
//2016-01-08

//Driver File


public class DatingSim {
    
    protected DatableSO datingPartner;
    protected String[][] view;
    private final int VIEW_LENGTH = 3; 

    public DatingSim(){
      datingPartner = "";
      //Make a view by populating it with blank spaces.
      for(int i = 0; i < VIEW_LENGTH; i++)
      {
        for (int j = 0; j < VIEW_LENGTH; j++)
        {
          view[i][j] = " ";
        }
      }
    }

    public String[][] getView(){
      return view;
    }

    public void setView(String[][] bg){
      view = bg;
    }

    public DatableSO getDatingPartner(){
      return datingPartner;
    }

    public void setDatingPartner(DatableSO person){
      datingPartner = person;
    }

    public void overlay(DatableSO person){

      //Person = new PErson(spersonNAme)
      for (int x = view.length- person.getAppearance().length; x < view.length; x++){
        for (int i = 0; i < person.getAppearance().length; i++){
        view[x][2] = person[i];
      } }
    }

    public static void main(String[] args){

     // System.out.println(view.overlay(person) );

    }
    
}
