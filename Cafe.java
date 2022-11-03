/* Class Cafe is a child class of Building*/
public class Cafe extends Building{

    /**The number of ounces of coffee remaining in inventory */
    private int nCoffeeOunces; 
    /**The number of sugar packets remaining in inventory */ 
    private int nSugarPackets; 
    /** The number of "splashes" of cream remaining in inventory */
    private int nCreams; 
    /** The number of cups remaining in inventory */
    private int nCups; 

    /** Constructor for a Cafe object
     * @param name name of cafe
     * @param address address of Cafe
     * @param nfloors number of floors in the cafe
     * @param nCoffee initial number of ounces of coffee in stock
     * @param nSugar initial number of sugar packets in stock
     * @param nCream initial number of creamers in stock
     * @param nCups initial number of cups in stock
     */
    public Cafe(String name, String address, int nfloors, int nCoffee, int nSugar, int nCream, int nCups) {
        super(name, address, nfloors);
        this.nCoffeeOunces = nCoffee;
        this.nSugarPackets = nSugar;
        this.nCreams = nCream;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Subtracts the ounces of coffee, sugar packets, and creams used in a coffee order
     * @param size ounces of coffee
     * @param nSugarPackets number of sugar packets
     * @param nCreams number of creams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        while (size > nCoffeeOunces){
            restock(150, 0, 0, 0);
        }
        this.nCoffeeOunces =- size;
        while (nSugarPackets > this.nSugarPackets){
            restock(0, 50, 0, 0);
        }
        this.nSugarPackets =- nSugarPackets;
        while (nCreams > this.nCreams){
            restock(0, 0, 50, 0);
        }
        this.nCreams =- nCreams;
        if (this.nCups == 0) {
            restock (0, 0, 0, 30);
        }
        this.nCups =- 1;
    }

    /**
     * Adds the amount of items restocked
     * @param nCoffeeOunces ounces of coffee restocked
     * @param nSugarPackets sugar packets restocked
     * @param nCreams creams restocked
     * @param nCups cups restocked
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces =+ nCoffeeOunces;
        this.nSugarPackets =+ nSugarPackets;
        this.nCreams =+ nCreams;
        this.nCups =+ this.nCups;
    }
    
    /** main method (for testing) */
    public static void main(String[] args) {
        new Cafe("My cafe", "1 Main st.", 2, 100, 50, 30, 30);
    }
    
}
