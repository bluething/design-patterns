package io.github.bluething.designpattern.strategy.dragonslayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("Spell attack!");
    }
}
