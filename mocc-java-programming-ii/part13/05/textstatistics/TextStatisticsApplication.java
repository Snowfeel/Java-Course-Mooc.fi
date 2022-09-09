package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {

    public void start(Stage stage) throws Exception {
        BorderPane plane = new BorderPane();
        HBox box = new HBox();
        box.setSpacing(10);
        box.getChildren().add(new Label("Letters: 0"));
        box.getChildren().add(new Label("Words: 0"));
        box.getChildren().add(new Label("The longest word is:"));
        plane.setCenter(new TextArea());
        plane.setBottom(box);
        Scene view = new Scene(plane);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }


}
