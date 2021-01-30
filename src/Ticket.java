import java.time.LocalDate;

public class Ticket {
    private final int ID;
    private Festival festival;
    private boolean parking;
    private boolean camping;
    private final LocalDate date;

    public Ticket(int ID, Festival festival, boolean parking, boolean camping, LocalDate date) {
        this.ID = ID;
        this.festival = festival;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void CostOFTicket(Parking newParking, Camping newCamping) {
        double totalCost;
        if(!parking && !camping){
            totalCost = festival.getPrice();
        } else if(!parking){
            totalCost = festival.getPrice() + newCamping.getPrice();
        } else if(!camping){
            totalCost = festival.getPrice() + newParking.getPrice();
        } else{
            totalCost = festival.getPrice() + newParking.getPrice() + newCamping.getPrice();
        }
        System.out.println(totalCost);
    }
}