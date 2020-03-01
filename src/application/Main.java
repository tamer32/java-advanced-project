package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
    primaryStage.setTitle("Pe-sho-oh");
    primaryStage.setScene(new Scene(root, 1000, 900));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
