package ru.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.moves.special.AncientPower;
import ru.itmo.lab2.moves.special.Scald;
import ru.itmo.lab2.moves.status.ShellSmash;

public class Tirtouga extends Pokemon{
    public Tirtouga(String name, int level){
        super(name, level);
        setStats(54, 78, 103, 53, 45, 22 );
        setType(Type.WATER, Type.ROCK);
        setMove(new ShellSmash(), new AncientPower(), new Scald());
    }
}
