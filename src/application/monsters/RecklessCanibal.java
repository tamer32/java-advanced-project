package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RecklessCanibal extends Monster {

  public RecklessCanibal(Integer row, Integer col) {
    super(row, col);
    monsterName = "Reckless Canibal";
    attackPower = 4;
    deffence = 6;
    magicPower = 8;
    speed = 10;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("RecklessCanibal.jpeg");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("Reckless Canibal", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return label;
  }
}
