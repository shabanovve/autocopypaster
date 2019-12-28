package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class AbstractJavaFxApplicationSupport extends Application {
    private static String[] savedArgs;

    private ConfigurableApplicationContext context;

    @Override
    public void init() {
        context = SpringApplication.run(getClass(), savedArgs);
        context.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(Stage stage) {

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
