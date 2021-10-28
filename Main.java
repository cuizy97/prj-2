import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Happy Halloween! \nHow many houses should we trick or treat at?");

    int houseNum;
    houseNum=s.nextInt();

    for (int i = 0; i < houseNum; i++){
      Pillowcase.getCandy();
      
    } 




    System.out.println("We have" + houseNum +" candies,     of our pillowcase.");  //" + r +"





  }
}