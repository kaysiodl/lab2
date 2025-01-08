import entities.people.Lemons;
import entities.people.Petrushka;
import entities.items.Advertisement;
import entities.items.Fun;
import entities.items.Flower;
import entities.items.Glass;
import entities.items.Fish;
import entities.items.Grass;
import entities.places.*;
import common.*;
import story.Others;
import story.Sentence;
import story.Story;


public class Main {
    public static void main(String[] args){
        Proverb proverb = new Proverb("Но все было напрасно -- словно об стенку горох.");
        //Person
        Lemons lemons = new Lemons("Лимончики", 4);
        Petrushka petrushka = new Petrushka("Петрушка", 0);

        lemons.getProfession();
        petrushka.getProfession();


        //Place
        Park park = new Park("Парк");
        Greenhouse greenhouse = new Greenhouse("Оранжерея");


        //Item
        Advertisement advertisement = new Advertisement("объявление", petrushka);
        Fish fish = new Fish("рыбки");
        Flower flower = new Flower("цветы");
        Fun fun = new Fun("забавы");
        Glass glass = new Glass("стекло", greenhouse);
        Grass grass = new Grass("трава");

        fish.setColor("золотых");

        //Sentences
        Sentence firstSentence = new Sentence(proverb.content());

        Sentence secondSentence = new Sentence(lemons.toString());
        secondSentence = secondSentence.add(lemons.settle(park));

        Sentence thirdSentence = new Sentence(lemons.getPronoun());
        thirdSentence = thirdSentence.add(lemons.haveFun());
        thirdSentence = thirdSentence.add(lemons.read(advertisement), Others.THEN);
        thirdSentence = thirdSentence.add(lemons.beBored(), Others.SO);
        thirdSentence = thirdSentence.add(lemons.trample(grass, flower));
        thirdSentence = thirdSentence.add(lemons.fishing(fish));
        thirdSentence = thirdSentence.add(lemons.shoot(glass), Others.AND);
        thirdSentence = thirdSentence.add(lemons.create(fun), Others.AND);

        Story story = new Story(firstSentence, secondSentence, thirdSentence);
        story.makeStory();

    }
}
