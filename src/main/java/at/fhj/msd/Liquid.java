package at.fhj.msd;

// Class representing a liquid that can be added to drinks
public class Liquid {

    // Name of the liquid
    private String name; 

    // Volume of the liquid in liters
    private double volume; 

    // Alcohol percentage of the liquid (e.g., 42 for 42%)
    private double alcoholPercent;

    // Constructor to create a Liquid object
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

     // Getter for volume
    public double getVolume() {
        return volume;
    }

    // Setter for volum
    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Getter for alcohol percentage
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    // Setter for alcohol percentage
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
