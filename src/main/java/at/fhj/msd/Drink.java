package at.fhj.msd;

public interface Drink {
    double getVolume();
    double getAlcoholPercent();
    boolean isAlcoholic();
    String getName();
    void setName(String name);
}
