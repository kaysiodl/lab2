package ru.itmo.lab2.moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * «Взрыв концентрации» наносит урон и с вероятностью 10% снижает специальную защиту цели на один уровень.
 * fighting, 120, 70
 */

public final class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect effect = new Effect();
        effect.chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует Взрыв Концентрации!";
    }
}
