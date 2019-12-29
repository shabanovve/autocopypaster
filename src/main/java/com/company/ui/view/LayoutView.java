package com.company.ui.view;

import javafx.scene.layout.VBox;
import lombok.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Value
@Component
public class LayoutView {
    private VBox layout = new VBox();
    private ButtonLayoutView buttonLayoutView;

    @PostConstruct
    public void init() {
        layout.getChildren().add(buttonLayoutView.getLayout());
    }
}
