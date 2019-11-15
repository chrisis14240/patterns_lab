public class Advanced extends Decorator {
    Beverage beverage;

    public Advanced(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with milk, mocha and a figure in the cover";
    }
}
