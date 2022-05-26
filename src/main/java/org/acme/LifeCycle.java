package org.acme;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class LifeCycle {

    private static final Logger LOGGER = Logger.getLogger(LifeCycle.class);

    void onStart(@Observes final StartupEvent ev) {
        LOGGER.info("The application is starting...");
    }

    void onStop(@Observes final ShutdownEvent ev) {
        LOGGER.info("The application is stopping...");
    }
}
