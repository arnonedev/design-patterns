package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.Drying;

/**
 * Created by Arek on 2017-04-05.
 */
public class Catapult extends Card {
    public Catapult() {
        specialAttack = new Drying();
    }

    @Override
    public void attack() {
        System.out.println("Catapult inflicts damage to an opponent: 45");
    }
}
