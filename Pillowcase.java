import java.util.ArrayList;
import java.util.Random;

class Pillowcase {
  private int number;     // number of candy in the pillowcase
  public final int size;  // constant instance hold up to 1000 candies.
  ArrayList<Candy> allCandy;  // stores all the candies that randomly generated
  int numCandy[] = {0, 0, 0, 0, 0, 0, 0};  // count of each candy

  // constructor initializing candies ArrayList.
  Pillowcase() {
    size = 1000;
    number = 0; 
    allCandy = new ArrayList<Candy>();
  }


  // method to getCandy()
  void getCandy(){
    System.out.print("Trick or Treat!");
    Random r = new Random();
    int rNum= r.nextInt(100) + 1;  // randomly generate a number

    if (rNum < 6){          // 1-5, 5%
      System.out.println(" We got Kit Kat!");
      number++;  
      Candy cd1 = new Candy("Kit Kat");
      allCandy.add(cd1);
    } 
    else if (rNum < 16){    // 6-15, 10%
      System.out.println(" We got M&Ms!");
      Candy cd2 = new Candy("M&Ms");
      allCandy.add(cd2);
      number ++;
    } 
    else if (rNum < 36){    // 16-35, 20%
      System.out.println(" We got Pink Starburst!");
      Candy cd3 = new Candy("Pink Starburst");
      allCandy.add(cd3);
      number ++; 
    }
    else if (rNum < 51){    // 36-50, 15%
      System.out.println(" We got Hershey's Bar!");
      Candy cd4 = new Candy("Hershey's Bar");
      allCandy.add(cd4);
      number ++; 
    }
    else if (rNum < 61){   //51-60, 10%
      System.out.println(" We got Milky Way!");
      Candy cd5 = new Candy("Milky Way");
      allCandy.add(cd5);
      number ++; 
    }
    else if (rNum < 76){   //61-75, 15%
      System.out.println(" We got Twix!");
      Candy cd6 = new Candy("Twix");
      allCandy.add(cd6);
      number ++; 
    }
    else {                 //76-100, 25%
      System.out.println(" We got Reese's!");
      Candy cd7 = new Candy("Reese's");
      allCandy.add(cd7); 
      number ++;
    }
  }

  
  // method for getting how much of each candy that have gotten
  void printNumCandies() {
    System.out.println("We got..." );
    // store the count of candy that generated
    for (int i=0; i<allCandy.size(); i++){
      if (allCandy.get(i).getName().equals("Kit Kat")){
        numCandy[0] ++;
      }
      else if (allCandy.get(i).getName().equals("M&Ms")){
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
    // Print out the count and candy's name of those that generated:
    if (numCandy[0] >= 1){
      System.out.println(numCandy[0] + " Kit Kats");
    }
    if (numCandy[1] >= 1){
      System.out.println(numCandy[1] + " M&Ms");
    }
    if (numCandy[2] >= 1){
      System.out.println(numCandy[2] + " Pink Starburst");
    }
    if (numCandy[3] >= 1){
      System.out.println(numCandy[3] + " Hershey's Bar");
    }
    if (numCandy[4] >= 1){
      System.out.println(numCandy[4] + " Milky Way");
    }
    if (numCandy[5] >= 1){
      System.out.println(numCandy[5] + " Twix");
    }
    if (numCandy[6] >= 1) {
      System.out.println(numCandy[6] + " Reese's");
    }
  }
  
  
  //accessor method to get number
   int getNumber() {
    return number; // @return: it returns the total number of candy
  }
}