package io.github.bluething.designpattern.strategy.dragonslayer;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DragonSlayerTest {
    @Test
    public void dragonSlayerAttackVerifyTheExecuteMethodInStrategyCalled() {
        DragonSlayingStrategy strategy = mock(DragonSlayingStrategy.class);
        DragonSlayer dragonSlayer = new DragonSlayer(strategy);

        dragonSlayer.attack();
        verify(strategy).execute();
    }
}
