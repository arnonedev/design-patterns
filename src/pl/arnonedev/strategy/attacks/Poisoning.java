package pl.arnonedev.strategy.attacks;

/**
 * Created by Arek on 2017-04-05.
 */
public class Poisoning implements SpecialAttack {
    @Override
    public int attack() {
        return 7;
    }
}
