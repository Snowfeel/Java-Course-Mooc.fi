package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }


    public void start(Stage stage) throws Exception {
        Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"));
        NumberAxis xAxis = new NumberAxis(1968,2008,1);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        ArrayList<Integer> years= new ArrayList<>();

        LineChart lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Relative support of the parties");
        String xData = scanner.nextLine();
        String[] xPart = xData.split("\t");
        for (int i = 1; i < xPart.length; i++) {
            years.add(Integer.valueOf(xPart[i].trim()));
        }

        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] part = input.split("\t");

            XYChart.Series data = new XYChart.Series<>();
            data.setName(part[0]);
            for (int i = 1; i < part.length; i++) {
                if (!part[i].equals("-")) {
                    data.getData().add(new XYChart.Data(years.get(i-1), Double.valueOf(part[i].trim())));
                }
            }
            lineChart.getData().add(data);
        }

        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
    }
}
