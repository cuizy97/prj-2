/* @author: ZiYan Cui
@version: 10.27.2021

*/


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

class Pillowcase{

  // ## NOT SURE: access control??? ##
  ArrayList<Candy> candies;
  int number; // whole number of candies count

  // constant instance SIZE can hold up to 1000 candies.
  static final int SIZE = 1000; 

  
  // constructor initializing candies ArrayList.
  Pillowcase(){
    candies = new ArrayList<Candy>();
    number = 0;   // ## NOT SURE:  set the number variable to 0? ##
  }

  // accessor for number variable
  public int getNumber() {
    return number;
  }

  // method to getCandy()
  public static String getCandy() {
    System.out.print("Trick or Treat!");

    Random r = new Random();
    int rNum= r.nextInt(100) + 1;
    if (rNum < 6){         // 1-5, 5%
      System.out.println(" We got Kit Kat!");
      return "Kit Kat"; 
    } 
    else if (rNum < 16){   // 6-15, 10%
      System.out.println(" We got M&Ms!");
      return "M&Ms"; 
    } 
    else if (rNum < 36){   // 16-35, 20%
      System.out.println(" We got Pink Starburst!");
      return "Pink Starburst"; 
    }
    else if (rNum < 51){   // 36-50, 15%
      System.out.println(" We got Hershey's Bar!");
      return "Hershey's Bar"; 
    }
    else if (rNum < 61){   //51-60, 10%
      System.out.println(" We got Milky Way!");
      return "Milky Way"; 
    }
    else if (rNum < 76){   //61-75, 15%
      System.out.println(" We got Twix!");
      return "Twix"; 
    }
    else {                 //76-100, 25%
      System.out.println(" We got Reese's!");
      return "Reese's"; 
    }
    // Add new candy object to candies ArrayList??????
  }

  // method printNumCandies()
  // NOT SURE how to do. Googled this result.
  public static void printNumCandies(ArrayList<String> candyArray){
    Map<String, Integer> hm = new HashMap<String, Integer>();
    for (String i : candyArray) {
      Integer j = hm.get(i);
      hm.put(i, (j == null) ? 1 : j + 1);
    }
  
    // displaying the occurrence of elements in the arraylist
    for (Map.Entry<String, Integer> val : hm.entrySet()) {
      System.out.println("Element " + val.getKey() + " "
                          + "occurs"
                          + ": " + val.getValue() + " times");
    }

  }


}    

/*
    cdnames.add("Kit Kat");
    cdnames.add("M&Ms");
    cdnames.add("Pink Starburst");
    cdnames.add("Hershey's Bar");
    cdnames.add("Milky Way");
    cdnames.add("Twix");
    cdnames.add("Reese's");

*/