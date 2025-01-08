package entities.people;

import common.HasPronoun;
import common.Profession;
import exceptions.NameTooShortException;
import exceptions.NegativeLevelOfBoredException;

import java.util.Objects;

public abstract class Person implements HasPronoun {
    protected final static int SHORTEST_NAME_LENGTH = 3;

    protected String name;

    protected int levelOfBored;

    public Person(String name, int levelOfBored) {

        try {
            this.setName(name);
        } catch (NameTooShortException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setBoredLevel(levelOfBored);
        } catch (NegativeLevelOfBoredException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws NameTooShortException {
        if (name.length() < SHORTEST_NAME_LENGTH) throw new NameTooShortException(SHORTEST_NAME_LENGTH);
        this.name = name;
    }

    public abstract Profession getProfession();

    public int getBoredLevel() {
        return this.levelOfBored;
    }

    public void setBoredLevel(int levelOfBored) throws NegativeLevelOfBoredException {
        if (levelOfBored < 0) throw new NegativeLevelOfBoredException(0);
        this.levelOfBored = levelOfBored;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return levelOfBored == person.levelOfBored && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        if (getProfession() != null) return getProfession().getText() + " " + this.name;
        else return this.name;
    }
}
