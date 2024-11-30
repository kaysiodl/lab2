package ru.itmo.lab2.moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * Древняя сила наносит урон и с вероятностью 10% повышает все характеристики пользователя
 * сразу — Атаку, Защиту, Специальную Атаку, Специальную Защиту и Скорость — на один уровень.
 * rock, 60, 100
 */

public final class AncientPower extends SpecialMove {
    public AncientPower(){
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.1).turns(0).stat(Stat.DEFENSE, +1).stat(Stat.SPEED, +1).stat(Stat.ATTACK, +1).stat(Stat.SPECIAL_ATTACK, +1).stat(Stat.SPECIAL_DEFENSE, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует атаку Ancient Power, повышая все свои характеристики сразу";
    }
}
