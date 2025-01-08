package entities.items;

public class Fish extends Item{
    private String color;

    public Fish(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + "рыбок";
    }
}
