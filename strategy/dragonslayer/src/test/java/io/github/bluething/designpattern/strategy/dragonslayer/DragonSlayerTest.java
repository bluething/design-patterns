package io.github.bluething.designpattern.strategy.dragonslayer;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class DragonSlayerTest {
    @Test
    public void dragonSlayerAttackVerifyTheExecuteMethodInStrategyCalled() {
        DragonSlayingStrategy strategy = mock(DragonSlayingStrategy.class);
        DragonSlayer dragonSlayer = new DragonSlayer(strategy);

        dragonSlayer.attack();
        verify(strategy).execute();
    }

    @Test
    public void dragonSlayerChangeTheStrategyVerifyNoInteractionWithOldStrategy() {
        DragonSlayingStrategy oldStrategy = mock(DragonSlayingStrategy.class);
        DragonSlayer dragonSlayer = new DragonSlayer(oldStrategy);

        DragonSlayingStrategy newStrategy = mock(DragonSlayingStrategy.class);
        DragonSlayer newDragonSlayer = dragonSlayer.changeStrategy(newStrategy);

        dragonSlayer.attack();
        newDragonSlayer.attack();

        verify(oldStrategy).execute();
        verify(newStrategy).execute();

        verifyNoMoreInteractions(oldStrategy, newStrategy);
    }
}
