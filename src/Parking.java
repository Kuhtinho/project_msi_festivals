public class Parking extends FestivalArea implements Payable{
    private int places;
    private double cost;

    public Parking(double area_m2, int places, double cost) {
        super(area_m2);
        this.places = places;
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
