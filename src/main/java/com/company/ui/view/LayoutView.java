package com.company.ui.view;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import lombok.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Value
@Component
public class LayoutView {
    private HBox layout = new HBox();
    private TextField urlTextField = new TextField();

    @PostConstruct
    public void init() {
        layout.getChildren().add(urlTextField);
    }
}
