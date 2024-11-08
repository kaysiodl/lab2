package ru.itmo.lab2.moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * physic, 65, 100
 * Психологический луч наносит урон и с вероятностью 10% сбивает с толку цель.
 */

public final class Psybeam extends SpecialMove{
    public Psybeam(){
        super(Type.PSYCHIC, 65, 100);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe(){
        return "использует атаку Psybeam, сбивает с толку противника";
    }
}
