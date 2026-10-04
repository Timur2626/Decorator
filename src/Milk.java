public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " с молоком";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}