package org.acme.quarkus.greeting.deployment;

import io.quarkus.arc.deployment.BeanContainerListenerBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;
import org.acme.quarkus.greeting.GreetingServlet;
import org.acme.quarkus.greeting.config.AppConfig;
import org.acme.quarkus.greeting.config.AppConfigBuildContext;

class QuarkusGreetingProcessor {

    private static final String FEATURE = "quarkus-greeting";
    private AppConfig appConfig;

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }


    @BuildStep
    ServletBuildItem createServlet(
    ) {
        ServletBuildItem servletBuildItem = ServletBuildItem.builder("greeting", GreetingServlet.class.getName())
                .addMapping("/greeting")
                .addInitParam("app", "app")
                .build();
        return servletBuildItem;
    }
}
