package entities.animals;

public class Fish {
    private final String color;
    protected String name;

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.name;
    }
}
