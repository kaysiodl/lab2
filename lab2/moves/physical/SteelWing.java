package ru.itmo.lab2.moves.physical;

import ru.ifmo.se.pokemon.*;

/**
 * Стальное крыло наносит урон и с вероятностью 10% повышает защиту пользователя на один уровень.
 */

public class SteelWing extends PhysicalMove {
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.1).turns(0).stat(Stat.DEFENSE, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует атаку Steel Wing, бьёт противника стальными крыльями";
    }
}
