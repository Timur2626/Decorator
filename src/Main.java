public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println(beverage.getDescription() + " будет стоить " + beverage.cost () + "$");

    }
}