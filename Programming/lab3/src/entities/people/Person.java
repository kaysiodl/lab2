package entities.people;

import common.Profession;
import exceptions.NameTooShortException;
import exceptions.NegativeLevelOfBoredException;

import java.util.Objects;

public abstract class Person {
    protected final static int shortestNameLength = 3;

    protected String name;

    protected int levelOfBored;

    protected Profession profession;

    public Person(String name, int levelOfBored){

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

    public String getName(){
        return this.name;
    }

    public Profession getProfession(){
        return this.profession;
    }

    public int getBoredLevel(){
        return this.levelOfBored;
    }

    public void setName(String name) throws NameTooShortException {
        if (name.length() < shortestNameLength) throw new NameTooShortException(shortestNameLength);
        this.name = name;
    }

    public void setProfession(Profession profession){
        this.profession = profession;
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
        return levelOfBored == person.levelOfBored && Objects.equals(name, person.name) && Objects.equals(profession, person.profession);
    }

    @Override
    public String toString() {
        if (this.profession != null) return this.profession.getText() + " " + this.name;
        else return this.name;
    }
}
