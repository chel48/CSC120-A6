import java.util.ArrayList;
/* House class is a child class of Building */
public class House extends Building{
  /**Creates an array list to store residents */
  ArrayList <String> residents;
  /** creates a boolean variable to determine if a house has a dining room */
  boolean hasDiningRoom;

  /**
   * Constructs a house object
   * @param name name of the house
   * @param address address of the house
   * @param nFloors number of floors in the house
   * @param hasDR true/false if house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors); // first step of buiding a house is making a building
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList <String> ();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accesses whether the house has a dining room 
   * @return this.hasDiningRoom true/false if house has a dining room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * Accesses the number of residents
   * @return this.residents.size() length of the residents array list
   */
  public int nResidents(){
    return this.residents.size();
  }

  /** adds a resident to the residents array list 
   * @param name name of person moving in
  */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /** removes a resident from the array list 
   * @param name name of resident moving out
   * @return name name of resident moving out
  */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  }

  /**
   * determines if the person is a resident in the house
   * @param person name of person being checked if in the house
   * @return this.residents.contains(person) true/false of if person is in residents array list
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  /** main method for testing */
  public static void main(String[] args) {
    House house = new House("My house", "5 Reed Drive", 4, false);
    house.moveIn("Nelly");
    System.out.print(house.nResidents());
  }


}