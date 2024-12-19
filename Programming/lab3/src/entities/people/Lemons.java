package entities.people;

// можно просто common.*
import common.CanSettle;
import common.CanCreate;
import common.CanFishing;
import common.CanRead;
import common.CanShoot;
import common.CanTrample;
import common.HasPronoun;
import common.HaveFun;
import entities.items.Item;
import entities.places.Place;
import exceptions.NameTooShortException;
import exceptions.NegativeLevelOfBoredException;

public class Lemons extends Person implements CanSettle, CanCreate, CanFishing, CanRead, CanShoot, CanTrample,
    HasPronoun, HaveFun{

    public Lemons(String name, int levelOfBored) throws NegativeLevelOfBoredException, NameTooShortException {
        super(name, levelOfBored);
    }

    @Override
    public String create(Item item) {
        return "придумывать " + item.toString();
    }

    @Override
    public String settle(Place place) {
        return "расположились " + place.toString();
    }

    @Override
    public String fishing(Item item) {
        return "удить " + item.toString();
    }

    @Override
    public String read(Item item) {
        return "читали " + item.toString();
    }

    @Override
    public String shoot(Item item) {
        return "стрелять в цель " + item.toString();
    }

    @Override
    public String trample(Item... content) {
        String text = "cтали топтать";

        for (Item item : content) {
                text +=  " " + item.toString() + ",";
        }

        return text;
    }

    @Override
    public String getPronoun() {
        return "Они";
    }

    @Override
    public String haveFun() {
        return "развлекались ";
    }


}