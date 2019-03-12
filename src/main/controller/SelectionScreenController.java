package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SelectionScreenController extends Application {

    @FXML
    private RadioButton playerOneRadioButton;

    @FXML
    private RadioButton playerTwoRadioButton;

    @FXML
    private RadioButton threeRoundsRadioButton;

    @FXML
    private RadioButton fiveRoundsRadioButton;

    @FXML
    private RadioButton nineRoundsRadioButton;

    @FXML
    private RadioButton easyRadioButton;

    @FXML
    private RadioButton mediumRadioButton;

    @FXML
    private RadioButton hardRadioButton;

    @FXML
    private void initialize(){
        ToggleGroup playerToggleGroup = new ToggleGroup();
        playerOneRadioButton.setToggleGroup(playerToggleGroup);
        playerTwoRadioButton.setToggleGroup(playerToggleGroup);

        ToggleGroup roundToggleGroup = new ToggleGroup();
        threeRoundsRadioButton.setToggleGroup(roundToggleGroup);
        fiveRoundsRadioButton.setToggleGroup(roundToggleGroup);
        nineRoundsRadioButton.setToggleGroup(roundToggleGroup);

        ToggleGroup difficultyToggleGroup = new ToggleGroup();
        easyRadioButton.setToggleGroup(difficultyToggleGroup);
        mediumRadioButton.setToggleGroup(difficultyToggleGroup);
        hardRadioButton.setToggleGroup(difficultyToggleGroup);
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
