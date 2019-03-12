import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("selection_screen.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public void startGame(Settings.Player player, Settings.Rounds rounds, Settings.Difficulty difficulty){
        Parent root = FXMLLoader.load(getClass().getResource("game_screen.fxml"));
        Stage stage = new Stage();
        stage.setScene(root);

        //do like this https://stackoverflow.com/questions/14187963/passing-parameters-javafx-fxml
    }


    public static void main(String[] args) {
        launch(args);
    }
}


