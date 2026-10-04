public abstract class Beverage {
    String description = "Название напитка";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}