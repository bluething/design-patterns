package io.github.bluething.designpattern.strategy.dragonslayer;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DragonSlayingStrategyLambdaTest {

    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[] {
                        DragonSlayingStrategyLambda.Strategy.MeleeStrategy,
                        "Melee attack!"
                },
                new Object[] {
                        DragonSlayingStrategyLambda.Strategy.ProjectileStrategy,
                        "Projectile attack!"
                },
                new Object[]{
                        DragonSlayingStrategyLambda.Strategy.SpellStartegy,
                        "Spell attack!"
                }
        );
    }

    private InMemmoryAppender appender;

    @BeforeEach
    public void setup() {
        appender = new InMemmoryAppender();
    }
    @AfterEach
    public void tearDown() {
        appender.stop();
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void strategyLambdaExecuteUsingParameterizedDataWriteSameMessageInLog(DragonSlayingStrategy dragonSlayingStrategy, String expectedResult) {
        dragonSlayingStrategy.execute();
        Assertions.assertEquals(expectedResult, appender.getLastMessage());
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void strategyExecuteLambdaUsingParameterizedDataResultingLogWithSizeOneForOneCall(DragonSlayingStrategy dragonSlayingStrategy, String expectedResult) {
        dragonSlayingStrategy.execute();
        Assertions.assertEquals(1, appender.getLogSize());
    }

    class InMemmoryAppender extends AppenderBase<ILoggingEvent> {

        private final List<ILoggingEvent> log;

        public InMemmoryAppender() {
            log = new LinkedList<>();
            ((Logger) LoggerFactory.getLogger("root")).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        public int getLogSize() {
            return log.size();
        }

        public String getLastMessage() {
            return log.get(log.size() - 1).getFormattedMessage();
        }
    }
}
