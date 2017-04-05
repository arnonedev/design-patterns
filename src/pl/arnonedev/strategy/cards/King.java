package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.Poisoning;

/**
 * Created by Arek on 2017-04-05.
 */
public class King extends Card {
    public King() {
        specialAttack = new Poisoning();
    }

    @Override
    public void attack() {
        System.out.println("King inflicts damage to an opponent: 8");
    }
}
