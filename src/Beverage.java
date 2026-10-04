public abstract class Beverage {
    String description = "Название кофе";

    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() {
        return description;
    }

    public boolean hasMilk() { return milk; }
    public void setMilk(boolean b) { milk = b; }

    public boolean hasSoy() { return soy; }
    public void setSoy(boolean b) { soy = b; }

    public boolean hasMocha() { return mocha; }
    public void setMocha(boolean b) { mocha = b; }

    public boolean hasWhip() { return whip; }
    public void setWhip(boolean b) { whip = b; }

    public double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) condimentCost += 0.10;
        if (hasSoy()) condimentCost += 0.15;
        if (hasMocha()) condimentCost += 0.20;
        if (hasWhip()) condimentCost += 0.10;
        return condimentCost;
    }
}