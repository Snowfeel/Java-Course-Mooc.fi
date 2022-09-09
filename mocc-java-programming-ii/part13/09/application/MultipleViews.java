package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.logging.Level;

public class MultipleViews extends Application {



    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    public void start(final Stage stage) throws Exception {
        Label textFirst = new Label("First view!");
        Label textSecond = new Label("Second view!");
        Label textThird = new Label("Third view!");

        Button buttonFirst = new Button("To the second view!");
        Button buttonSecond = new Button("To the third view!");
        Button buttonThird = new Button("To the first view!");

        BorderPane first = new BorderPane();
        first.setTop(textFirst);
        first.setCenter(buttonFirst);

        VBox second = new VBox(buttonSecond,textSecond);

        GridPane third = new GridPane();
        third.add(textThird,0,0);
        third.add(buttonThird,1,1);

        final Scene firstScene = new Scene(first);
        final Scene secondScene = new Scene(second);
        final Scene thirdScene = new Scene(third);

        stage.setScene(firstScene);
        stage.show();
        buttonFirst.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                stage.setScene(secondScene);
            }
        });

        buttonSecond.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                stage.setScene(thirdScene);
            }
        });
        buttonThird.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                stage.setScene(firstScene);
            }
        });

    }
}
