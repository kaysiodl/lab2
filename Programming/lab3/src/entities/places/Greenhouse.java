package entities.places;

import java.util.Objects;

public class Greenhouse extends Place {

    public Greenhouse(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "оранжереи";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Greenhouse greenhouse)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(greenhouse.toString(), greenhouse.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toString());
    }

}
