package rpg.models;

import rpg.util.Constants;

public class Werewolf extends Monster implements Bleedable{

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return getDamage()*level*Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double attack() {
        return getDamage()+bleed();
    }
}