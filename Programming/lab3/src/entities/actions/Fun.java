package entities.actions;

import java.util.Objects;

public class Fun {

    protected String name;

    public Fun(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fun fun = (Fun) o;
        return Objects.equals(name, fun.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), toString());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
