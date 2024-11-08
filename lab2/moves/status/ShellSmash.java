package ru.itmo.lab2.moves.status;

import ru.ifmo.se.pokemon.*;

/**
 *  Shell Smash снижает защиту и особую защиту пользователя на один уровень,
 * а также повышает атаку, особую атаку и скорость на два уровня.
 */

public final class ShellSmash extends StatusMove {
    public ShellSmash(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.turns(0).stat(Stat.DEFENSE, -1).stat(Stat.SPECIAL_DEFENSE, -1);
        effect.turns(0).stat(Stat.ATTACK, +2).stat(Stat.SPECIAL_ATTACK, +2).stat(Stat.SPEED, +2);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "ломает броню!";
    }
}
