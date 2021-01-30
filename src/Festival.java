import java.time.LocalDate;
import java.util.*;

public class Festival implements Payable{
    private static final String continentOfFestival = "Europe";
    private final String name;
    private final String address;
    private double cost;
    private final String description = null;
    private final int numberOfDays;
    private final LocalDate firstDay;
    private final LocalDate endDate;
    private final List<Musician> musiciansOnFestival;
    private final List<Genre> genreOfFestival;
    private static List<Festival> extent = new ArrayList<>();

    public Festival(String name, LocalDate firstDay, LocalDate endDate, String address, double cost, int numberOfDays) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.numberOfDays = numberOfDays;
        this.firstDay = firstDay;
        this.endDate = endDate;
        this.musiciansOnFestival = new ArrayList<>();
        genreOfFestival = new LinkedList<>();
        addFestival(this);
    }

    private static void addFestival(Festival festival) {
        extent.add(festival);
    }


    public Genre addGenre(Genre genre){
        genreOfFestival.add(genre);
        return genre;
    }


    public boolean addMusician(Musician newMusician){
         if(!musiciansOnFestival.contains(newMusician)){
             musiciansOnFestival.add(newMusician);
             newMusician.addFestivalForMusician(this);
             return true;
         } else{
             return false;
         }
    }

    public void addDayOfShow(DayOfShow newDayOfShow){
        if((newDayOfShow.getDayOfShow().isBefore(endDate) && newDayOfShow.getDayOfShow().isAfter(firstDay) ||
                newDayOfShow.getDayOfShow().isEqual(firstDay) || newDayOfShow.getDayOfShow().isEqual(endDate))){
            newDayOfShow.addFestival(this);
        } else {
            System.out.println("This " + newDayOfShow.getDayOfShow() + " off the date of festival");
        }
    }

    public List<Musician> findMusiciansPlayingThisDay(DayOfShow day){
        if((day.getDayOfShow().isBefore(endDate) && day.getDayOfShow().isAfter(firstDay) ||
                day.getDayOfShow().isEqual(firstDay) || day.getDayOfShow().isEqual(endDate))){
            return day.getMusicians();
        }
        return null;
    }

    public static void showExtent (){
        System.out.println("All festivals are located in " + Festival.continentOfFestival);
        System.out.println("There are festivals: ");
        for (Festival festival: extent) {
            System.out.println("\t"+festival);
        }
    }

    public List<Musician> getMusiciansOnFestival() {
        return musiciansOnFestival;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getPrice() {
        return cost;
    }
}