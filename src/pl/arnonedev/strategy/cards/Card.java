package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.SpecialAttack;

/**
 * Created by Arek on 2017-04-05.
 */
public abstract class Card {
    protected SpecialAttack specialAttack;

    public abstract void attack();

    public void setSpecialAttack(SpecialAttack specialAttack) {
        this.specialAttack = specialAttack;
    }

    public void makeSpecialAttack() {
        int damage = specialAttack.attack();
        System.out.println("A special attack inflicts damage to an opponent: " + damage);
    }
}
