package at.fhj.msd;

/**
 * Represents a liquid used in drinks, with name, volume and alcohol percentage.
 */
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
     * @return volume in litres
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