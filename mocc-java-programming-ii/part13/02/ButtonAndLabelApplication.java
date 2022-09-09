package buttonandlabel;




import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;

public class ButtonAndLabelApplication extends Application {

    public void start(Stage window) {

        Node b = new javafx.scene.control.Button("Button");
        Node l = new javafx.scene.control.Label("Label");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(l);
        componentGroup.getChildren().add(b);
        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {

        launch(ButtonAndLabelApplication.class);
    }

}
