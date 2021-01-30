import java.util.ArrayList;
import java.util.List;

public class Musician {
    private final String name;
    private final int amountOfGroupMembers;
    private final List<Festival> participatingFestivals;
    private final List<Genre> genreOfMusic;
    private final List<DayOfShow> daysOfShows;

    public Musician(String name, int amountOfGroupMembers) {
        this.name = name;
        this.amountOfGroupMembers = amountOfGroupMembers;
        this.participatingFestivals = new ArrayList<>();
        this.genreOfMusic = new ArrayList<>();
        this.daysOfShows = new ArrayList<>();
    }

    public void addGenreForMusician(Genre newGenre){
        if(!genreOfMusic.contains(newGenre)){
            genreOfMusic.add(newGenre);
        } else{
            System.out.println("Genre is already put");
        }
    }

    public void addFestivalForMusician(Festival newFestival){
        if(!participatingFestivals.contains(newFestival)){
            participatingFestivals.add(newFestival);
            newFestival.addMusician(this);
        } else{
            System.out.println(this.name + " is already participating on " + newFestival.getName());
        }
    }

    public void addDayOfShow(DayOfShow newDayOfShow){
        if(!daysOfShows.contains(newDayOfShow)){
            daysOfShows.add(newDayOfShow);
            newDayOfShow.addMusician(this);
            System.out.println("The day " + newDayOfShow.getDayOfShow() + " is added for " + this.name);
        }
    }

    public int getAmountOfGroupMembers() {
        return amountOfGroupMembers;
    }

    @Override
    public String toString() {
        return name;
    }
}
