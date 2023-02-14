package com.vignesh.pwdgen.password_generator;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label displayPassword;

    @FXML
            private TextField lengthInput;
    @FXML
            private CheckBox upperCheck;
    @FXML
            private CheckBox lowerCheck;
    @FXML
    private CheckBox numberCheck;
    @FXML
    private CheckBox symbolCheck;

    int count=0;


    @FXML
    protected void onGeneratePasswordClick(){
        PasswordGenerator p = new PasswordGenerator(Integer.parseInt(lengthInput.getText()),
                upperCheck.isSelected(),
                lowerCheck.isSelected(),
                numberCheck.isSelected(),
                symbolCheck.isSelected());
        displayPassword.setText(p.generatePassword());

    }
}