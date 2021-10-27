/* @author: ZiYan Cui
@version: 10.27.2021
*/
class Candy {
  private String name;

  // constructor with no parameters
  Candy() {
    name = "";
  }

  // constructor for aName
  Candy(String aName){  //@param: constructor has a parameter called aName
    name = aName;
  }

  // mutator to set a candy name
  public void setName(String aName) {
    name = aName;
  }
  
  // accessor to get a candy name 
  public String getName() {
    return name;  // @return: it returns the name of the candy
  }

  // print() method: print the name of the candy
  public void print(){
    System.out.println(name);
  }
  
}