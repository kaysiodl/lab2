package ru.itmo.lab2;
import ru.ifmo.se.pokemon.*;
import ru.itmo.lab2.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Porygon("Водный Страж", 82));
        battle.addAlly(new Porygon2("Небесный Клюв", 82));
        battle.addAlly(new Carracosta("Титан Скальных Глубин", 84));

        battle.addFoe(new PorygonZ("Ветер Крыльев", 82));
        battle.addFoe(new Tirtouga("Каменный Защитник", 84));
        battle.addFoe(new Tropius("Великан Листолом", 56));

        battle.go();
    }
}