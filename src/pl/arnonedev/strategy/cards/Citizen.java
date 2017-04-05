package pl.arnonedev.strategy.cards;

import pl.arnonedev.strategy.attacks.Drowning;

/**
 * Created by Arek on 2017-04-05.
 */
public class Citizen extends Card {
    public Citizen() {
        specialAttack = new Drowning();
    }

    @Override
    public void attack() {
        System.out.println("Citizen inflicts damage to an opponent: 3");
    }
}
