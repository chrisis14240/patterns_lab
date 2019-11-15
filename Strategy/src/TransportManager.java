public class TransportManager {
    private TransportStrategy strategy;

    public void setStrategy(TransportStrategy strategy){
        this.strategy = strategy;
    }

    public void gotTotheAirport() {
        this.strategy.transport();
    }
}
