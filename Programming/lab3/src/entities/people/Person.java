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

    public Person(String name, int levelOfBored) throws NameTooShortException, NegativeLevelOfBoredException {
        if (name.length() < shortestNameLength) throw new NameTooShortException(shortestNameLength);
        if (levelOfBored < 0) throw new NegativeLevelOfBoredException(0);
        this.name = name;
        this.levelOfBored = levelOfBored;
    }

    public String getName(){
        return this.name;
    }

    public Profession getProfession(){
        return this.profession;
    }

    public String getBoredLevel(){
        if (this.levelOfBored < 5) return "не скучать";
        else return "сильно не скучать";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setProfession(Profession profession){
        this.profession = profession;
    }

    public void setBoredLevel(int level){
        this.levelOfBored = level;
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
