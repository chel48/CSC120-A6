/*
 * The Building Class creates a building object with basic building features
 */
public class Building {

    /*creates a String for the name of the building */
    private String name = "<Name Unknown>";
    /*creates a String for the address of the building */
    private String address = "<Address Unknown>";
    /*defines an int for the number of floors in the building */
    private int nFloors = 1;

    /*Constructs a building using the inputted name, address, and number of floors */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * accessor for the name of the building
     * @return this.name the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * accessor for the address of the building
     * @return this.address the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * accessor for the number of floors in the building
     * @return this.nFloors number of floors the building has
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns the buildings properties in a nicely formatted sentence
     * @return nicely formatted sentence
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /* Main method (for testing) */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}