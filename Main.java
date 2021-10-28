/* @author: 
@version: 
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Pillowcase object named bag:
    Pillowcase bag = new Pillowcase();  
    // we might need to create a Pillowcase object before
    // calling methods from Pillowcase
    // mentioned in No.3 first and second bullet points

    // ask for user input:
    System.out.println("Happy Halloween!\nHow many houses should we trick or treat at?");
    Scanner s = new Scanner(System.in);
    int houseNum;
    houseNum=s.nextInt();

    if(houseNum <= Pillowcase.size()){ // #### error on Pillowcase.size()
      // Loop calling getCandy():
      for (int i = 0; i< houseNum; i++){
        bag.getCandy(); 
      }
      // use accessor method getNumber() divided by SIZE of Pillowcase:
      int percentPillowcase = (bag.getNumber() / Pillowcase.size()) * 100;
      double decimalPercent = percentPillowcase; 
      // #### error on Pillowcase.size()

      System.out.println("We have" + bag.getNumber() +" candies, " + percentPillowcase +"% of our pillowcase."); 
      // should be decimalPercent???

      bag.printNumCandies();
    }
    else {
      System.out.println("Your pillowcase will not be able to hold all the candy you will receive from that many houses!");
    }

  }
    
}