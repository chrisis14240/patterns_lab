public class Sophisticated extends Decorator {
    Beverage beverage;

    public Sophisticated(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with milk and cook time > 2 minutes";
    }
}
