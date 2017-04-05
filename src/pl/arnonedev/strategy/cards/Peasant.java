package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.Arson;

/**
 * Created by Arek on 2017-04-05.
 */
public class Peasant extends Card {
    public Peasant() {
        specialAttack = new Arson();
    }

    @Override
    public void attack() {
        System.out.println("Peasant inflicts damage to an opponent: 20");
    }
}
