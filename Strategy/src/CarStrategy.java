public class CarStrategy implements  TransportStrategy {
    @Override
    public void transport() {
        System.out.println("Look at you!, getting to the airport by CAR. Is the fastest way, you're almost there");
    }
}
