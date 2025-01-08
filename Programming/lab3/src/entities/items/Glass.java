package entities.items;

import entities.places.Place;

public class Glass extends Item {

    private Place owner;

    public Glass(String name, Place owner) {
        super(name);
        this.owner = owner;
    }

    public Place getOwner() {
        return this.owner;
    }

    public void setOwner(Place owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return " по стеклам " + owner.toString();
    }
}
