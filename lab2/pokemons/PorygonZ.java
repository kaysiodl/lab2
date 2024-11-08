package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.special.SignalBeam;

public final class PorygonZ extends Porygon2{
    public PorygonZ(String name, int level){
        super(name, level);
        setStats(85, 80, 70, 135, 75, 90);
        addMove(new SignalBeam());
    }
}
