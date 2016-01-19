import java.util.Scanner;

public class Home extends Setting {

  protected String[] image;
  protected String text;
  
  //constructors
  public Home(){
    image = "";
    text = "Welcome home! WOuld you like to rest?
            Resting will regain full stamina and one day will pass."
  }
  
  //methods
  //gets
  public String[] getImage(){
    return image;
  }
  
  public String getText(){
    return text;
  }
  
  //sleep
  public void sleep(){
    System.out.println("Good night!");
    stamina = 15;
    days --;
    System.out.println(image);
    System.out.println(text);
  }
  

}
