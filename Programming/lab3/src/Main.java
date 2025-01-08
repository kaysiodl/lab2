import common.Proverb;
import entities.actions.Fun;
import entities.animals.Fish;
import entities.items.Advertisement;
import entities.items.Flower;
import entities.items.Glass;
import entities.items.Grass;
import entities.people.Lemons;
import entities.people.Petrushka;
import entities.places.Greenhouse;
import entities.places.Park;
import story.Others;
import story.Sentence;
import story.Story;


public class Main {
    public static void main(String[] args) {
        Proverb proverb = new Proverb("Но все было напрасно -- словно об стенку горох.");
        //Person
        Lemons lemons = new Lemons("Лимончики", 4);
        Petrushka petrushka = new Petrushka("Петрушка", 0);

        //Place
        Park park = new Park("Парк");
        Greenhouse greenhouse = new Greenhouse("Оранжерея");


        //Item
        Advertisement advertisement = new Advertisement("объявление", petrushka);
        Flower flower = new Flower("цветы");
        Glass glass = new Glass("стекло", greenhouse);
        Grass grass = new Grass("трава");

        Fish fish = new Fish("рыбки", "золотые");
        Fun fun = new Fun("забавы");

        //Sentences
        Sentence firstSentence = new Sentence(proverb.content());

        Sentence secondSentence = new Sentence(lemons.toString())
                .add(lemons.settle(park));

        Sentence thirdSentence = new Sentence(lemons.getPronoun())
                .add(lemons.haveFun())
                .add(lemons.read(advertisement), Others.THEN)
                .add(lemons.beBored(), Others.SO)
                .add(lemons.trample(grass, flower))
                .add(lemons.fishing(fish))
                .add(lemons.shoot(glass), Others.AND)
                .add(lemons.create(fun), Others.AND);


        Story story = new Story(firstSentence, secondSentence, thirdSentence);
        story.makeStory();
    }
}