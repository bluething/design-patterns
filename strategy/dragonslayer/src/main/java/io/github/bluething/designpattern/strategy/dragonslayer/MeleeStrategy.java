package io.github.bluething.designpattern.strategy.dragonslayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("Melee attack!");
    }
}
