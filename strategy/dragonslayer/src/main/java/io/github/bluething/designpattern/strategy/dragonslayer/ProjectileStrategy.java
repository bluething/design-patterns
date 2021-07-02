package io.github.bluething.designpattern.strategy.dragonslayer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("Projectile attack!");
    }
}
