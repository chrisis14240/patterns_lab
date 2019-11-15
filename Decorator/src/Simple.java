public class Simple extends Decorator {
    Beverage beverage;

    public Simple(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Just " + beverage.getDescription();
    }
}
