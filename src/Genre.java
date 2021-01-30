import java.util.*;

public class Genre {
    private final String name;
    private final List<Musician> musiciansPlayingGenre = new LinkedList<>();
    private final List<Festival> festivalsWithGenre = new LinkedList<>();

    public Genre(String name) {
        this.name = name;
    }

    public void addMusicianToGenre(Musician musician){
        if(!musiciansPlayingGenre.contains(this)){
            musiciansPlayingGenre.add(musician);
            musician.addGenreForMusician(this);
        }
    }

    public List<Musician> getMusiciansPlayingGenre() {
        return musiciansPlayingGenre;
    }

    public void addFestivalToGenre(Festival festival){
        if(!festivalsWithGenre.contains(this)){
            festivalsWithGenre.add(festival);
            festival.addGenre(this);
        }
    }

    public String getName() {
        return name;
    }

    public List<Festival> getFestivalsWithGenre() {
        return festivalsWithGenre;
    }

    @Override
    public String toString() {
        return name;
    }
}
