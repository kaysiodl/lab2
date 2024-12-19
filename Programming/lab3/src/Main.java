import entities.people.Lemons;
import entities.people.Petrushka;
import entities.people.Person;
import entities.items.*;
import entities.places.*;
import common.*;
import exceptions.NameTooShortException;
import exceptions.NegativeLevelOfBoredException;
import story.Others;
import story.Sentence;
import story.Story;


public class Main {
    public static void main(String[] args) throws NegativeLevelOfBoredException, NameTooShortException {

        //Person
        Lemons lemons = new Lemons("Лимончики", 2);
        Petrushka petrushka = new Petrushka("Петрушка", 0);

        lemons.setProfession(Profession.SOLDIER);
        petrushka.setProfession(Profession.SENIOR);


        //Place
        Park park = new Park("Парк");
        Greenhouse greenhouse = new Greenhouse("Оранжерея");


        //Item
        Advertisement advertisement = new Advertisement("Объявление", petrushka);
        Fish fish = new Fish("Рыбки");
        Flower flower = new Flower("Цветы");
        Fun fun = new Fun("Забавы");
        Glass glass = new Glass("Стекло", greenhouse);
        Grass grass = new Grass("Трава");

        fish.setColor("золотых");

        //Sentences
        Sentence firstSentence = new Sentence(Proverb.content);

        Sentence secondSentence = new Sentence(lemons.toString());
        secondSentence = secondSentence.add(lemons.settle(park));

        Sentence thirdSentence = new Sentence(lemons.getPronoun());
        thirdSentence = thirdSentence.add(lemons.haveFun());
        thirdSentence = thirdSentence.add(lemons.read(advertisement), Others.THEN);
        thirdSentence = thirdSentence.add(lemons.getBoredLevel(), Others.SO);
        thirdSentence = thirdSentence.add(lemons.trample(grass, flower));
        thirdSentence = thirdSentence.add(lemons.fishing(fish));
        thirdSentence = thirdSentence.add(lemons.shoot(glass), Others.AND);
        thirdSentence = thirdSentence.add(lemons.create(fun), Others.AND);

        Story story = new Story(firstSentence, secondSentence, thirdSentence);
        story.makeStory();

    }
}