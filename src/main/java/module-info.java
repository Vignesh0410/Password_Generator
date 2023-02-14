module com.vignesh.pwdgen.password_generator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.vignesh.pwdgen.password_generator to javafx.fxml;
    exports com.vignesh.pwdgen.password_generator;
}