package ru.itmo.lab2.moves.status;

import ru.ifmo.se.pokemon.*;

/**
 * «Громовая волна» парализует противника.
 * Парализованные покемоны с вероятностью 25% не смогут атаковать, а их скорость снизится на 50%.
 * electric, 0, 90
 */

public final class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect eff = new Effect();
        eff.paralyze(pokemon);
        eff.turns(0);
        eff.attack(0.75);
        eff.stat(Stat.SPEED, (int)pokemon.getStat(Stat.SPEED) / 2);
        pokemon.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "использует атаку Thunder Wave. Противник парализован!";
    }
}
