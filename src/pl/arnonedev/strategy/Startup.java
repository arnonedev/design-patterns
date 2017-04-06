package pl.arnonedev.strategy;

import pl.arnonedev.strategy.attacks.Arson;
import pl.arnonedev.strategy.attacks.Drowning;
import pl.arnonedev.strategy.cards.Card;
import pl.arnonedev.strategy.cards.Catapult;

/**
 * Created by Arek on 2017-04-05.
 */
public class Startup {
    public static void main(String[] args) {
        Card catapult = new Catapult();
        catapult.attack();
        catapult.makeSpecialAttack();
        catapult.setSpecialAttack(new Arson());
        catapult.makeSpecialAttack();
        catapult.setSpecialAttack(new Drowning());
        catapult.makeSpecialAttack();
    }
}
