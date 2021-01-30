public class Camping extends FestivalArea implements Payable{
    private int amountOfTents;
    private int amountOfBathrooms;
    private int amountOfElectricSockets;
    private int places;
    private double cost;

    public Camping(double area_m2, int amountOfTents, int amountOfBathrooms, int amountOfElectricSockets, int places, double cost) {
        super(area_m2);
        this.amountOfTents = amountOfTents;
        this.amountOfBathrooms = amountOfBathrooms;
        this.amountOfElectricSockets = amountOfElectricSockets;
        this.places = places;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
