import java.util.ArrayList;
import java.util.Random;

class Pillowcase {
  private int candies;
  private int number;
  int size = 1000;  // constant instance SIZE hold up to 1000 candies.
  
  ArrayList<Candy> allCandy;
  // constructor initializing candies ArrayList.
  Pillowcase() {
    
    number = 0; 
    allcandy = new ArrayList<Candy>();
  }

  int numCandy[] = {0, 0, 0, 0, 0, 0, 0};
  
  // method to getCandy()
  void getCandy(){
    System.out.println("Trick or Treat!");

    Random r = new Random();
    int rNum= r.nextInt(100) + 1;

    if (rNum < 6){          // 1-5, 5%
      System.out.print(" We got Kit Kat!");
      number++;  
      Candy cd1 = new Candy("Kit Kat");
      allcandy.add(cd1);
    } 
    else if (rNum < 16){    // 6-15, 10%
      System.out.print(" We got M&Ms!");
      Candy cd2 = new Candy("M&Ms");
      allcandy.add(cd2);
      number ++;
    } 
    else if (rNum < 36){    // 16-35, 20%
      System.out.print(" We got Pink Starburst!");
      Candy cd3 = new Candy("Pink Starburst");
      allcandy.add(cd3);
      number ++; 
    }
    else if (rNum < 51){    // 36-50, 15%
      System.out.print(" We got Hershey's Bar!");
      Candy cd4 = new Candy("Hershey's Bar");
      allcandy.add(cd4);
      number ++; 
    }
    else if (rNum < 61){   //51-60, 10%
      System.out.print(" We got Milky Way!");
      Candy cd5 = new Candy("Milky Way");
      allcandy.add(cd5);
      number ++; 
    }
    else if (rNum < 76){   //61-75, 15%
      System.out.print(" We got Twix!");
      Candy cd6 = new Candy("Twix");
      allcandy.add(cd6);
      number ++; 
    }
    else {                 //76-100, 25%
      System.out.print(" We got Reese's!");
      Candy cd7 = new Candy("Reese's");
      allcandy.add(cd7); 
      number ++;
    }
    // Add new candy object to candies ArrayList??????
  }

  void  printNumCandies() {
    System.out.println("We got..." );
    for (int i=0; i<allCandy.size(); i++){
      if (allCandy.get(i).getName().equals("Kit Kat")){
        numCandy[0] ++;
      }
      else if (allCandy.get(i).getName().equals("M&Ms")){    // 6-15, 10%
        numCandy[1] ++;
      } 
      else if (allCandy.get(i).getName().equals("Pink Starburst")){
        numCandy[2] ++;
      }
      else if (allCandy.get(i).getName().equals("Hershey's Bar")){
        numCandy[3] ++;
      }
      else if (allCandy.get(i).getName().equals("Milky Way")){
        numCandy[4] ++;
      }
      else if (allCandy.get(i).getName().equals("Twix")){
        numCandy[5] ++; 
      }
      else {
        numCandy[6] ++;
      }
    }
    
    if (numCandy[0] >= 1){
      System.out.println(numCandy[0] + "Kit Kats");
    }
    else if (numCandy[1] >= 1){
      System.out.println(numCandy[1] + "M&Ms");
    }
    else if (numCandy[2] >= 1){
      System.out.println(numCandy[2] + "Pink Starburst");
    }
    else if (numCandy[3] >= 1){
      System.out.println(numCandy[3] + "Hershey's Bar");
    }
    else if (numCandy[4] >= 1){
      System.out.println(numCandy[4] + "Milky Way");
    }
    else if (numCandy[5] >= 1){
      System.out.println(numCandy[5] + "Twix");
    }
    else {
      System.out.println(numCandy[6] + "Reese's");
    }
  }
  
  //accessor method to get number
   int getNumber() {
    return number; // @return: it returns the total number of candy
  }

}