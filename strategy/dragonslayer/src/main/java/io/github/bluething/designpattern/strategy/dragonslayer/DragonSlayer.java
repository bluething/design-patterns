package io.github.bluething.designpattern.strategy.dragonslayer;

public class DragonSlayer {
    private final DragonSlayingStrategy dragonSlayingStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void attack() {
        dragonSlayingStrategy.execute();
    }

    public DragonSlayingStrategy changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
        return dragonSlayingStrategy;
    }
}
