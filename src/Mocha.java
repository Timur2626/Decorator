public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Мокко";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}