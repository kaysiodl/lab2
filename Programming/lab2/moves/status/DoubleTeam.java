package ru.itmo.lab2.moves.status;

import ru.ifmo.se.pokemon.*;

/**
 * Двойная команда повышает скрытность пользователя на один уровень, благодаря чему его сложнее поразить.
 */

public final class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.turns(0).stat(Stat.EVASION, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "повышает свою скрытность, теперь противнику сложнее его поразить!";
    }
}
