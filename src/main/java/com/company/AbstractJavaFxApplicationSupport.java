package com.company;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public abstract class AbstractJavaFxApplicationSupport extends Application {
    private static String[] savedArgs;
    private ConfigurableApplicationContext context;

    @Override
    public void init() {
        context = SpringApplication.run(getClass(), savedArgs);
        context.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        context.close();
    }

    static void launchApp(String[] args) {
        AbstractJavaFxApplicationSupport.savedArgs = args;
        Application.launch(com.company.Application.class, args);
    }
}
