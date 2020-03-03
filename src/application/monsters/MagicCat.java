package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MagicCat extends Monster {

  public MagicCat(Integer row, Integer col) {
    super(row, col);
    monsterName = "Magic Cat";
    attackPower = 8;
    deffence = 5;
    magicPower = 10;
    speed = 1;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("magicCat.jpg");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("Magic Cat", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return label;
  }
}
