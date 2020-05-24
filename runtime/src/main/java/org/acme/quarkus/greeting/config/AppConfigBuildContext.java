package org.acme.quarkus.greeting.config;

import io.quarkus.arc.runtime.BeanContainerListener;
import io.quarkus.runtime.annotations.Recorder;
import org.acme.quarkus.greeting.GreetingServlet;

@Recorder
public class AppConfigBuildContext {
    public BeanContainerListener setAppConfig(AppConfig appConfig) {
        return beanContainer -> {
            GreetingServlet instance = beanContainer.instance(GreetingServlet.class);
        };
    }

}
