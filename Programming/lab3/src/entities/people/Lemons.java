package entities.people;

import common.Profession;
import entities.items.Item;
import entities.places.Place;

public class Lemons extends Person {

    public Lemons(String name, int levelOfBored){
        super(name, levelOfBored);
    }

    @Override
    public Profession getProfession(){
        return Profession.SOLDIER;
    }

    public String create(Item item) {
        return "придумывать " + item.toString();
    }


    public String settle(Place place) {
        return "расположились " + place.toString();
    }


    public String fishing(Item item) {
        return "удить " + item.toString();
    }


    public String read(Item item) {
        return "читали " + item.toString();
    }


    public String shoot(Item item) {
        return "стрелять в цель" + item.toString();
    }


    public String trample(Item... content) {
        String text = "cтали топтать";

        for (Item item : content) {
                text +=  " " + item.toString() + ",";
        }

        return text;
    }

    public String haveFun() {
        return "развлекались";
    }

    public String beBored() {
        if (this.levelOfBored < 5) return "не скучать";
        else return "сильно не скучать";
    }

    @Override
    public String getPronoun() {
        return "Они";
    }
}
