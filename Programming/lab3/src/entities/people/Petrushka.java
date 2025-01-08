package entities.people;

import common.Profession;

public class Petrushka extends Person{

    public Petrushka(String name, int levelOfBored){
        super(name, levelOfBored);
    }

    @Override
    public Profession getProfession(){
        return Profession.SENIOR;
    }

    @Override
    public String getPronoun() {
        return "Он";
    }
}
