package ticTacToe;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    String currentPlayer = "X";
    Button[][] btn = new Button[3][3];
    Label turn = new Label("Turn: " + currentPlayer);
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    public void start(Stage stage) throws Exception {
        BorderPane mainUI = new BorderPane();
        turn.setFont(Font.font("Monospaced", 40));
        GridPane game = new GridPane();
        game.setVgap(5);
        game.setHgap(5);
        game.setPadding(new Insets(10, 10, 10, 10));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final Button temp = new Button(" ");

                temp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        if (!turn.getText().equals("The end!"))
                        {
                            if (temp.getText().equals(" ")){
                                temp.setText(currentPlayer);
                                if (checkWin()){
                                    turn.setText("The end!");
                                }else {
                                    changePlayer();
                                    turn.setText("Turn: " + currentPlayer);
                                }
                            }
                        }
                    }
                });
                temp.setFont(Font.font("Monospaced", 40));
            btn[i][j] = temp;
            game.add(btn[i][j],i,j);
            }
        }


        mainUI.setTop(turn);
        mainUI.setCenter(game);
        Scene scene = new Scene(mainUI);
        stage.setScene(scene);
        stage.show();
    }

    public void changePlayer(){
        if (currentPlayer.equals("X")){
            currentPlayer = "O";
        } else if (currentPlayer.equals("O")) {
            currentPlayer = "X";
        }
    }

    public boolean checkWin(){
        if (checkVertical() || checkDiagonal() || checkHorizontal()){
            return true;
        }
        return false;
    }
    public boolean checkVertical(){
        if (!btn[0][0].getText().equals(" ") && btn[0][0].getText().equals(btn[1][0].getText()) && btn[1][0].getText().equals(btn[2][0].getText())){
            return true;
        }
        if (!btn[0][1].getText().equals(" ") && btn[0][1].getText().equals(btn[1][1].getText()) && btn[1][1].getText().equals(btn[2][1].getText())){
            return true;
        }
        if (!btn[0][2].getText().equals(" ") && btn[0][2].getText().equals(btn[1][2].getText()) && btn[1][2].getText().equals(btn[2][2].getText())){
            return true;
        }
        return false;
    }

    public boolean checkHorizontal(){
        if (!btn[0][0].getText().equals(" ") && btn[0][0].getText().equals(btn[0][1].getText()) && btn[0][1].getText().equals(btn[0][2].getText())){
            return true;
        }
        if (!btn[1][0].getText().equals(" ") && btn[1][0].getText().equals(btn[1][1].getText()) && btn[1][1].getText().equals(btn[1][2].getText())){
            return true;
        }
        if (!btn[2][0].getText().equals(" ") && btn[2][0].getText().equals(btn[2][1].getText()) && btn[2][1].getText().equals(btn[2][2].getText())){
            return true;
        }
        return false;
    }
    public boolean checkDiagonal(){
        if (!btn[0][0].getText().equals(" ") && btn[0][0].getText().equals(btn[1][1].getText()) && btn[1][1].getText().equals(btn[2][2].getText())){
            return true;
        }
        if (!btn[0][2].getText().equals(" ") && btn[0][2].getText().equals(btn[1][1].getText()) && btn[1][1].getText().equals(btn[2][0].getText())){
            return true;
        }
        return false;
    }
}

