package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SandTurtle extends Monster {

  public SandTurtle(Integer row, Integer col) {
    super(row, col);
    monsterName = "Sand Turtle";
    attackPower = 5;
    deffence = 10;
    magicPower = 1;
    speed = 4;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("SandTurtle.jpg");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("SandTurtle", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return iv1;
  }
}
