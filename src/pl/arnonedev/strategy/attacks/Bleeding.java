package pl.arnonedev.strategy.attacks;

/**
 * Created by Arek on 2017-04-05.
 */
public class Bleeding implements SpecialAttack {
    @Override
    public int attack() {
        return 10;
    }
}
