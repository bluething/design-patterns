package io.github.bluething.designpattern.strategy.dragonslayer;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class DragonSlayingStrategyTest {

    private InMemmoryAppender appender;

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
