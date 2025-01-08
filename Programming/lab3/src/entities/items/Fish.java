package entities.items;

public class Fish extends Item{
    private String color = "прозрачных";

    public Fish(String name){
        super(name);
    }

    public String getColor(String color){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + "рыбок";
    }
}
