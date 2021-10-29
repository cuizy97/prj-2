/* @author: Dillon Pearon, Joseph Hannah, Wenhan Zhu, ZiYan Cui
@version: 10/29/2021
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Happy Halloween!\nHow many houses should we trick or treat at?");
    // Pillowcase object created:
    Pillowcase bag = new Pillowcase();

    // Ask to input total number of candies need to generate:
    Scanner s = new Scanner(System.in);
    int houseNum;
    houseNum=s.nextInt();

    // When the input number <= max size of pillowcase, run the program:
    if( houseNum <= bag.size){
      // Loop for generate input number of candies from pillowcase:
      for (int i = 0; i < houseNum; i++){
        bag.getCandy();
      }
      // Convert int to double:
      double percentPillowcase = (bag.getNumber()  /(double) bag.size)* 100;
      System.out.println("\nWe have " + bag.getNumber() +" candies, " + percentPillowcase +"% of our pillowcase.");

      // Print out the count and candy's name of those that generated:
      bag.printNumCandies();
    }
    else {
      System.out.println("Your pillowcase will not be able to hold all the candy you will receive from that many houses!");
    }
  }   
}