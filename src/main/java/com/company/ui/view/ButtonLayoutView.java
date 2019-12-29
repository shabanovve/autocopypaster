package com.company.ui.view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
@Component
public class ButtonLayoutView {
    private HBox layout = new HBox();
    private Button getDataButton = new Button("Get data");

    @PostConstruct
    private void init() {
        layout.getChildren().addAll(List.of(getDataButton));
    }
}
