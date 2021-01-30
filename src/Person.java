import java.util.HashMap;
import java.util.Map;

public class Person {
    private final String name;
    private final int PESEL;
    private final Map<String, Ticket> personQualif = new HashMap<>();

    public Person(String name, int PESEL)
    {
        this.name = name;
        this.PESEL = PESEL;
    }

    public void addPersonQualif(Ticket ticket)
    {
        personQualif.put(name, ticket);
    }

    public Ticket findPersonQualif(String name) throws Exception
    {
        if(!personQualif.containsKey(name)) {
            throw new Exception("Unable to find a person " + name);
        }
        return personQualif.get(name);
    }

    public Ticket findPersonQualif(int PESEL) throws Exception
    {
        if(!personQualif.containsKey(Integer.toString(PESEL))) {
            throw new Exception("Unable to find a person " + this.PESEL);
        }
        return personQualif.get(Integer.toString(this.PESEL));
    }
}