package ru.itmo.lab2.pokemons;

import ru.itmo.lab2.moves.special.FocusBlast;

public final class Carracosta extends Tirtouga{
    public Carracosta(String name, int level){
        super(name, level);

        setStats(74, 108, 133, 83, 65, 32);
        addMove(new FocusBlast());
    }
}
