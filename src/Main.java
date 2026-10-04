public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage.setMilk(true);
        beverage.setMocha(true);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}