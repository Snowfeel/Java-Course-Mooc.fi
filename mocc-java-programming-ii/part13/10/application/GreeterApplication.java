package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    public void start(final Stage stage) throws Exception {
        GridPane ui = new GridPane();
        Label welcome = new Label("Enter your name and start");
        TextField name = new TextField();
        Button enter = new Button("Start");
        Label welName = new Label();

        ui.add(welcome,0,1);
        ui.add(name,0,2);
        ui.add(enter,0,3);

        StackPane wel = new StackPane(welName);

        Scene firstScene = new Scene(ui);
        final Scene secondScene = new Scene(wel);

        stage.setScene(firstScene);
        stage.show();

        enter.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                welName.setText("Welcome " + name.getText() + "!");
                stage.setScene(secondScene);
            }
        });
    }
}
