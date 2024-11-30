package ru.itmo.lab2.moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Пуля-семя наносит 2-5 ударов за ход. Вероятность каждого интервала указана в таблице, как и общая сила после каждого удара.
 */


public final class BulletSeed extends PhysicalMove{
    public BulletSeed(){
        super(Type.GRASS, 25, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        double damage = super.calcBaseDamage(attacker, defender);
        double rnd = Math.random();

        if (rnd < (7.0 / 8)) return damage * 16;
        else if (rnd < (6.0 / 8)) return damage * 9;
        else if (rnd < (3.0 / 8)) return damage * 4;
        else return damage * 25;
    }

    @Override
    protected String describe(){
        return "наносит удары с помощью атаки Bullet Seed";
    }
}
