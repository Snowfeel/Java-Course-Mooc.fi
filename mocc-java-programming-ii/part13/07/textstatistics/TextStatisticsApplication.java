package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    public void start(Stage stage) throws Exception {
        BorderPane component = new BorderPane();
        TextArea input = new TextArea();
        HBox box = new HBox();
        box.setSpacing(10);
        Label letter = new Label("Letters: 0");
        Label word = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        box.getChildren().addAll(letter,word,longestWord);
        component.setCenter(input);
        component.setBottom(box);
        input.textProperty().addListener((change, oldValue,newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            letter.textProperty().setValue("Letters: " + characters);
            word.textProperty().setValue("Words: " + words);
            longestWord.textProperty().setValue("The longest word is: " + longest);
        });

        Scene scene = new Scene(component);
        stage.setScene(scene);
        stage.show();


    }
}
