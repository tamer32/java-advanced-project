package application;

import java.io.IOException;

import application.misc.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controller {
  @FXML private Button playButton;
  private Double droppedCoordX;
  private Double droppedCoordY;
  @FXML private HBox cardOne;
  @FXML private AnchorPane screen;

  @FXML
  public void playHandler() throws IOException {
    Parent playStage = FXMLLoader.load(getClass().getResource("PlanB.fxml"));
    Stage buttonPlayStage = (Stage) playButton.getScene().getWindow();
    buttonPlayStage.setScene(new Scene(playStage, 1050, 1050));
    buttonPlayStage.setFullScreen(true);
    buttonPlayStage.show();
    screen = (AnchorPane) playStage.getChildrenUnmodifiable().get(0);
    gameStart();
  }

  @FXML
  public void gameStart() {

    Player player1 = new Player("Pesho");
    player1.setMp(10);
    for (int i = 0; i < 5; i++) {
      player1.drawMonster();
      HBox hBox = (HBox) screen.getChildren().get(2 + i);
      hBox.getChildren().add(player1.getMonsterInHand().get(i).getMonsterNode(78, 108));
    }
    Node monster = player1.getMonsterInHand().get(1).getMonsterNode(50, 50);
    // fightingBoard.add(monster, 0, 0);
    Player player2 = new Player("Gosho");
    player2.setMp(10);
    for (int i = 0; i < 5; i++) {
      player2.drawMonster();
      HBox hBox = (HBox) screen.getChildren().get(7 + i);
      hBox.getChildren().add(player2.getMonsterInHand().get(i).getMonsterNode(78, 108));
    }
  }

  public Boolean isPlayerOneFirst(Player player1, Player player2) {
    return (player1.rollTheDice().equals(player2.rollTheDice())) ? true : false;
  }

  public void playerMove(Player player) {}

  public void positionMonster(Player player, GridPane gameBoard) {}

  public void handleOnDrop(DragEvent drag) {
    drag.acceptTransferModes(TransferMode.ANY);
    Image node = drag.getDragboard().getDragView();
    ImageView image = new ImageView();
    image.setImage(node);
    droppedCoordX = drag.getSceneX();
    droppedCoordY = drag.getSceneY();
    Integer row = (int) (droppedCoordX / 1200);
    Integer col = (int) (droppedCoordY / 640);
    image.resize(50, 50);
    drag.consume();
  }

  public void handleDragStart(MouseEvent drag) {
    Dragboard dragBoard = cardOne.startDragAndDrop(TransferMode.ANY);
    ClipboardContent cb = new ClipboardContent();
    ImageView iv = (ImageView) cardOne.getChildren().get(0);
    cb.putImage(iv.getImage());
    dragBoard.setContent(cb);
    drag.consume();
  }
}
