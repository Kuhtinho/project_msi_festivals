import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DayOfShow {
    private final LocalDate dayOfShow;
    private final List<Festival> festivals;
    private final List<Musician> musicians;

    public DayOfShow(LocalDate dayOfShow) {
        this.dayOfShow = dayOfShow;
        this.festivals = new LinkedList<>();
        this.musicians = new LinkedList<>();
    }

    public void addMusician(Musician musician){
        if(!musicians.contains(musician)){
            musicians.add(musician);
        }
    }

    public void addFestival(Festival festival){
        if(!festivals.contains(festival)){
            festivals.add(festival);
        }
    }

    public List<Musician> getMusicians() {
        return musicians;
    }

    public LocalDate getDayOfShow() {
        return dayOfShow;
    }
}
