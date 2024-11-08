package ru.itmo.lab2.moves.physical;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Наносит урон и бьет с удвоенной силой (140),
 * если пользователь обожжен, отравлен или парализован
 */

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    private boolean f = false;
    @Override
    protected double calcBaseDamage(Pokemon pokemon1, Pokemon pokemon2) {
        double damage = super.calcBaseDamage(pokemon1, pokemon2);

        switch (pokemon1.getCondition()) {
            case BURN, POISON, PARALYZE:
                f = true;
                return damage*2;
            default:
                return damage;
        }
    }

    @Override
    protected String describe(){
        if (f) return "в огне, отравлен или парализован! Покемон использует атаку Facade с удвоенным уроном";
        return "использует атаку Facade";
    }
}
