package entities.items;

import entities.people.Person;

public class Advertisement extends Item{
    public Person owner;

    public Advertisement(String name,Person owner){
        super(name);
        this.owner = owner;
    }

    public Person getOwner(){
        return this.owner;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "объявления " + owner.toString();
    }
}
