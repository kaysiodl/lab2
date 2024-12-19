package entities.items;

public class Flower extends Item{
    public Flower(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "цветы ";
    }
}
