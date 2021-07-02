package io.github.bluething.designpattern.strategy.dragonslayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DragonSlayingStrategyLambda {
    public enum Strategy implements DragonSlayingStrategy {
        MeleeStrategy(() -> LOGGER.info("Melee attack!")),
        ProjectileStrategy(() -> LOGGER.info("Projectile attack!")),
        SpellStartegy(() -> LOGGER.info("Spell attack!"));

        private final DragonSlayingStrategy dragonSlayingStrategy;
        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
