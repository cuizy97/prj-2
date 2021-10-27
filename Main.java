import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    System.out.println("Happy Halloween! \nHow many houses should we trick or treat at?");

    int houseNum;
    houseNum=s.nextInt();
    int randomNum= r.nextInt(houseNum);

    /*for (int i = 0; i< allLamps.size(); i++){
      System.out.print("Lamp is: " + allLamps.get(i).getStatus());
    } */


    System.out.println("We have" + s +" candies, " + r +" of our pillowcase. \nWe got...");
  }
}