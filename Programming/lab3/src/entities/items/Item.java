package entities.items;

import java.util.Objects;

public abstract class Item {
    protected String name;

    public Item(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toString());
    }
}
