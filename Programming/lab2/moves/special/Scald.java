package ru.itmo.lab2.moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * Water, 80, 100
 * Ошпаривание наносит урон и с вероятностью 30% поджигает цель.
 */

public final class Scald extends SpecialMove{
    public Scald(){
        super(Type.WATER, 80, 100);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).turns(0).condition(Status.BURN));
    }

    protected String describe(){
        return "использует атаку Scald, ошпаривает водой противника";
    }
}
