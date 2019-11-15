public class Elementary extends Decorator {
    Beverage beverage;

    public Elementary(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " whit milk";
    }
}
