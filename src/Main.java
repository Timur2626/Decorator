public class Main {
    public static void main(String args[]) {

        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());



        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2.getDescription() + " $     " + beverage2.cost());

    }
}