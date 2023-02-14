package com.vignesh.pwdgen.password_generator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    int count=0;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(String.valueOf(++count));

    }
}