package borderpane;


import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        Node north = new javafx.scene.control.Label("NORTH");
        layout.setTop(north);
        layout.setRight(new javafx.scene.control.Label("EAST"));
        layout.setBottom(new javafx.scene.control.Label("SOUTH"));
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

}
