package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsCalculatorApplication extends Application {



    public static void main(String[] args) {
        launch();
    }


    public void start(Stage stage) throws Exception {
        BorderPane ui = new BorderPane();

        BorderPane monthlyBorder = new BorderPane();
        BorderPane yearlyBorder = new BorderPane();

        XYChart.Series data = new XYChart.Series<>();
        XYChart.Series baseData = new XYChart.Series<>();
        Slider yearlySlider = new Slider(0,10,5);
        final Slider monthlySlider = new Slider(25,250,50);
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);


        //Slider monthlySlider = new Slider(25,250,50);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setMinorTickCount(5);
        monthlySlider.setPrefWidth(300);

        //Slider yearlySlider = new Slider(0,10,5);
        yearlySlider.setShowTickMarks(true);
        yearlySlider.setShowTickLabels(true);
        yearlySlider.setMajorTickUnit(100);
        yearlySlider.setPrefWidth(300);

        VBox sliderGroup = new VBox();
        sliderGroup.setPadding(new Insets(10));
        Label monthly = new Label("Monthly savings");
        Label yearly = new Label("Yearly interest rate");
        final Label monthlyData = new Label(String.valueOf(monthlySlider.getValue()));
        Label yearlyData = new Label(String.valueOf(yearlySlider.getValue()));

        monthlyBorder.setLeft(monthly);
        monthlyBorder.setCenter(monthlySlider);
        monthlyBorder.setRight(monthlyData);
        yearlyBorder.setLeft(yearly);
        yearlyBorder.setCenter(yearlySlider);
        yearlyBorder.setRight(yearlyData);

        lineChart.setTitle("Savings calculator");
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.getData().add(data);
        lineChart.getData().add(baseData);
        monthlySlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                monthlyData.setText(String.valueOf(monthlySlider.getValue()));
                updateSavings(monthlySlider.getValue(), yearlySlider.getValue(), baseData, data);
            }
        });

        yearlySlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                    yearlyData.setText(String.valueOf(yearlySlider.getValue()));
                updateSavings(monthlySlider.getValue(), yearlySlider.getValue(), baseData, data);
            }
        });



        sliderGroup.getChildren().add(monthlyBorder);
        sliderGroup.getChildren().add(yearlyBorder);
        ui.setTop(sliderGroup);
        ui.setCenter(lineChart);


        Scene scene = new Scene(ui);
        stage.setScene(scene);
        stage.show();

    }


    private void updateSavings(double savings, double interest,  XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i <=30; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));

            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interest / 100.0);
        }

    }
}
