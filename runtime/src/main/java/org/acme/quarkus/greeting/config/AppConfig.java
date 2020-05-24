package org.acme.quarkus.greeting.config;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "app", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class AppConfig {
    /***
     * simple config for message
     */
    @ConfigItem
    public String message;
}
