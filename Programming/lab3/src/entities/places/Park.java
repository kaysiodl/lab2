package entities.places;

import java.util.Objects;

public class Park extends Place{

    public Park(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "в парке ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Park park)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(park.toString(), park.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toString());
    }
}
