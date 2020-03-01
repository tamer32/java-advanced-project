package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {
  @FXML private Button playButton;

  @FXML
  public void playHandler() throws IOException {
    Parent playStage = FXMLLoader.load(getClass().getResource("gameBoardPanel.fxml"));
    Stage buttonPlayStage = (Stage) playButton.getScene().getWindow();
    buttonPlayStage.setScene(new Scene(playStage, 1250, 900));
    buttonPlayStage.show();
  }
}
