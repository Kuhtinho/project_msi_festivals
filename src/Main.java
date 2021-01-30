import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Festival rockAmRing = new Festival("Rock am Ring Festival",
                LocalDate.of(2021, 6, 11),
                LocalDate.of(2021, 6, 13),
                " Nürburgring, Germany",
                100,
                3);
        Festival openEr = new Festival("Opener Festival",
                LocalDate.of(2021, 6,30),
                LocalDate.of(2021,7,3),
                "Gdynia, Poland",
                50,
                5);
        Festival download = new Festival("Download Festival",
                LocalDate.of(2021,6,4),
                LocalDate.of(2021,6,6),
                "Donington Park, UK",
                50,
                3);

        Musician systemOfADown = new Musician("System Of A Down",4);
        Musician gojira = new Musician("Gojira",6);
        Musician slipknot = new Musician("Slipknot",9);
        Musician wuTangClan = new Musician("Wu-Tang Clan",5);
        Musician muse = new Musician("Muse",3);
        Musician twentyOnePilots = new Musician("Twenty One Pilots", 2);
        Musician asapRocky = new Musician("Asap Rocky", 1);
        Musician theChemicalBrothers = new Musician("The Chemical Brothers", 2);
        Musician theKillers = new Musician("The Killers", 3);
        Musician kiss = new Musician("Kiss", 4);
        Musician deftones = new Musician("Deftones", 5);
        Musician megadeth = new Musician("Megadeth", 3);
        Musician alanWalker = new Musician("Alan Walker", 1);
        Musician yungblud = new Musician("YUNGBLUD", 1);


        Genre rock = new Genre("Rock");
        Genre metal = new Genre("Metal");
        Genre rap = new Genre("Rap");
        Genre pop = new Genre("Pop");
        Genre electronic = new Genre("Electro music");


        rock.addMusicianToGenre(systemOfADown);
        rock.addMusicianToGenre(muse);
        rock.addMusicianToGenre(theKillers);
        rock.addMusicianToGenre(kiss);

        metal.addMusicianToGenre(gojira);
        metal.addMusicianToGenre(slipknot);
        metal.addMusicianToGenre(systemOfADown);
        metal.addMusicianToGenre(deftones);
        metal.addMusicianToGenre(megadeth);

        rap.addMusicianToGenre(wuTangClan);
        rap.addMusicianToGenre(asapRocky);

        pop.addMusicianToGenre(yungblud);
        pop.addMusicianToGenre(twentyOnePilots);

        electronic.addMusicianToGenre(theChemicalBrothers);
        electronic.addMusicianToGenre(alanWalker);

        System.out.println("Musicians playing rock: " + rock.getMusiciansPlayingGenre());
        System.out.println("Musicians playing metal: " + metal.getMusiciansPlayingGenre());
        System.out.println("Musicians playing pop: " + pop.getMusiciansPlayingGenre());

        DayOfShow dayOfRockAmRing = new DayOfShow(LocalDate.of(2021,6,11));
        DayOfShow dayOfRockAmRing1 = new DayOfShow(LocalDate.of(2021,6,12));
        DayOfShow dayOfRockAmRing2 = new DayOfShow(LocalDate.of(2021,6,13));

        gojira.addDayOfShow(dayOfRockAmRing);
        systemOfADown.addDayOfShow(dayOfRockAmRing);
        muse.addDayOfShow(dayOfRockAmRing1);
        slipknot.addDayOfShow(dayOfRockAmRing1);
        deftones.addDayOfShow(dayOfRockAmRing2);


        rockAmRing.addMusician(systemOfADown);
        rockAmRing.addMusician(slipknot);
        rockAmRing.addMusician(deftones);
        rockAmRing.addMusician(alanWalker);
        rockAmRing.addMusician(muse);
        System.out.println("Musicians on Rock Am Ring: " + rockAmRing.getMusiciansOnFestival());
        System.out.println("Musicians playing on Rock Am Ring on the day " + dayOfRockAmRing.getDayOfShow() +
                ": " + dayOfRockAmRing.getMusicians());
        System.out.println("Musicians playing on Rock Am Ring on the day " + dayOfRockAmRing1.getDayOfShow() +
                ": " + dayOfRockAmRing1.getMusicians());
        System.out.println("Musicians playing on Rock Am Ring on the day " + dayOfRockAmRing2.getDayOfShow() +
                ": " + dayOfRockAmRing2.getMusicians());

        Person den = new Person("Matus", 12345);
        Ticket ticket1 = new Ticket(123, rockAmRing,true,true,LocalDate.of(2021, 1, 21));
        Camping campingRockAmRing = new Camping(100,100,10,50,1000, 15);
        Parking parkingRockAmRing = new Parking(200, 500, 10);

        ticket1.CostOFTicket(parkingRockAmRing,campingRockAmRing);


        den.addPersonQualif(ticket1);
        System.out.println(den.findPersonQualif("Matus").getID());

        Festival.showExtent();
    }
}
