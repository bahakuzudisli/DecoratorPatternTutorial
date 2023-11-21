package beverages;

public abstract class Beverage {
    String description = "Unknown beverages.Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}