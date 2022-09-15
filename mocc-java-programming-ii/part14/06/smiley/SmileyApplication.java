package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }


    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(200, 200);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        painter.setFill(Color.WHITE);
        painter.fill();

        painter.setFill(Color.BLACK);
        painter.fillRect(40, 40, 20, 20);
        painter.fillRect(100, 40, 20, 20);
        painter.fillRect(20, 100, 20, 20);
        painter.fillRect(40, 120, 80, 20);
        painter.fillRect(120, 100, 20, 20);


        Scene view = new Scene(paintingLayout);
        stage.setScene(view);
        stage.show();
    }
}
