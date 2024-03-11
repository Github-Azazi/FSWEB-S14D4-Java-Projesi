package rpg.models;

import rpg.util.Constants;

public interface Poisonable {
    default double poison(){
        return Constants.POISON_PERCENTAGE;
    }
}