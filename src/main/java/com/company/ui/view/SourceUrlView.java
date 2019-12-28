package com.company.ui.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import lombok.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Value
@Component
public class SourceUrlView {
    private final TextField urlTextField = new TextField();
    private final Label urlLabel = new Label("Source url");
    private final HBox layout = new HBox();

    @PostConstruct
    private void init() {
        urlLabel.setPadding(new Insets(5, 5, 5, 5));
        urlLabel.setAlignment(Pos.BASELINE_RIGHT);
        layout.getChildren().addAll(List.of(urlLabel, urlTextField));
    }

}
