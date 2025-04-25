package at.fhj.msd;

<<<<<<< HEAD
<<<<<<< HEAD
// put into drinkss
=======
/**
 * Represents a liquid used in drinks, with name, volume and alcohol percentage.
 */
>>>>>>> 1d8dccbe3650dc4977bc3bc50544738cbe45ef3c
public class Liquid {
    private String name;
    private double volume;
    private double alcoholPercent;

    /**
     * Constructor to create a Liquid object.
     * @param name name of the liquid
     * @param volume volume in litres
     * @param alcoholPercent alcohol percentage
     */
=======
// Class representing a liquid that can be added to drinks
public class Liquid {

    // Name of the liquid
    private String name; 

    // Volume of the liquid in liters
    private double volume; 

    // Alcohol percentage of the liquid (e.g., 42 for 42%)
    private double alcoholPercent;

    // Constructor to create a Liquid object
>>>>>>> bug_hunt
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

<<<<<<< HEAD
    /**
     * Gets the name of the liquid.
     * @return name
     */
=======
    // Getter for name
>>>>>>> bug_hunt
    public String getName() {
        return name;
    }

<<<<<<< HEAD
    /**
     * Sets the name of the liquid.
     * @param name new name
     */
=======
    // Setter for name
>>>>>>> bug_hunt
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    /**
     * Gets the volume.
     * @return volume in litres
     */
=======
     // Getter for volume
>>>>>>> bug_hunt
    public double getVolume() {
        return volume;
    }

<<<<<<< HEAD
    /**
     * Sets the volume.
     * @param volume new volume
     */
=======
    // Setter for volum
>>>>>>> bug_hunt
    public void setVolume(double volume) {
        this.volume = volume;
    }

<<<<<<< HEAD
    /**
     * Gets alcohol percentage.
     * @return alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets alcohol percentage.
     * @param alcoholPercent new alcohol percentage
     */
=======
    // Getter for alcohol percentage
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    // Setter for alcohol percentage
>>>>>>> bug_hunt
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}