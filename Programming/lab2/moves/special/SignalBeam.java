package ru.itmo.lab2.moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * Сигнальный луч наносит урон и с вероятностью 10% сбивает с толку цель.
 */

public final class SignalBeam extends SpecialMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Signal Beam, сбивает с толку противника";
    }
}
