package ru.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.moves.physical.BulletSeed;
import ru.itmo.lab2.moves.physical.Facade;
import ru.itmo.lab2.moves.physical.SteelWing;
import ru.itmo.lab2.moves.status.DoubleTeam;

public final class Tropius extends Pokemon {
    public Tropius(String name, int level) {
        super(name, level);
        setStats(99, 68, 83, 72, 87, 51);
        setType(Type.GRASS, Type.FLYING);
        setMove(new Facade(), new SteelWing(), new BulletSeed(), new DoubleTeam());
    }
}
