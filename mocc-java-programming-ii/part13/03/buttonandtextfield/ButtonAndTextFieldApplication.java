package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        FlowPane a = new FlowPane();
        a.getChildren().add(new TextField());
        a.getChildren().add(new Button("Button"));
        Scene view = new Scene(a);
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
