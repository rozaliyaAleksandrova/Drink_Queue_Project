package at.fhj.msd;

    /**
     * Class representing a liquid that can be added to drinks.
     * 
     * @param name name of the liquid
     * @param volume volume in liters
     * @param alcoholPercent alcohol percentage
     */
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

    /**
     * Gets the name of the liquid.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume.
     * @return volume in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume.
     * @param volume new volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

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
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}