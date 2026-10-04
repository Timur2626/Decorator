public abstract class Beverage {
    String description = "бррр...";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}