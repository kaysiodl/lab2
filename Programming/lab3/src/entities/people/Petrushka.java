package entities.people;

import exceptions.NameTooShortException;
import exceptions.NegativeLevelOfBoredException;

public class Petrushka extends Person{
    public Petrushka(String name, int levelOfBored) throws NegativeLevelOfBoredException, NameTooShortException {
        super(name, levelOfBored);
    }
}
