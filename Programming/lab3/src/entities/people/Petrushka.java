package entities.people;

public class Petrushka extends Person{

    public Petrushka(String name, int levelOfBored){
        super(name, levelOfBored);
    }

    @Override
    public String getPronoun() {
        return "Он";
    }
}
