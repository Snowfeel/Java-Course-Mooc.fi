package notifier;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class NotifierApplication extends Application {


    public void start(Stage stage) throws Exception {
        final TextField updateText = new TextField();
        Button updateButton = new Button("Update");
        final Label label = new Label("");
        updateButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                label.setText(updateText.getText());
                updateText.clear();

            }
        });

        VBox ui = new VBox(updateText,updateButton,label);
        Scene scene = new Scene(ui);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }


}
