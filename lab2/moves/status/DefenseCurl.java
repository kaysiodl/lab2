package ru.itmo.lab2.moves.status;

import ru.ifmo.se.pokemon.*;

/**
 * Защитный завиток повышает защиту пользователя на один уровень
 */

public final class DefenseCurl extends StatusMove {
    public DefenseCurl(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.turns(0).stat(Stat.DEFENSE, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "защищается с помощью Защитного Завитка";
    }
}
