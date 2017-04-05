package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.Bleeding;

/**
 * Created by Arek on 2017-04-05.
 */
public class Knight extends Card {
    public Knight() {
        specialAttack = new Bleeding();
    }

    @Override
    public void attack() {
        System.out.println("Knight inflicts damage to an opponent: 10");
    }
}
