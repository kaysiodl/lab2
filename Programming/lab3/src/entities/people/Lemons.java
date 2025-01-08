package entities.people;

import common.Profession;
import entities.items.*;
import entities.places.*;

public class Lemons extends Person {

    public Lemons(String name, int levelOfBored){
        super(name, levelOfBored);
    }

    @Override
    public Profession getProfession(){
        return Profession.SOLDIER;
    }

    public String create(Fun fun) {
        return "придумывать " + fun.toString();
    }


    public String settle(Park park) {
        return "расположились " + park.toString();
    }


    public String fishing(Fish fish) {
        return "удить " + fish.toString();
    }


    public String read(Advertisement advertisement) {
        return "читали " + advertisement.toString();
    }


    public String shoot(Glass glass) {
        return "стрелять в цель" + glass.toString();
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
