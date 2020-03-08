package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DrunkenKnight extends Monster {

  public DrunkenKnight(Integer row, Integer col) {
    super(row, col);
    monsterName = "Drunken knight";
    attackPower = 5;
    deffence = 5;
    magicPower = 5;
    speed = 5;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("DrunkenKnight.jpg");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("Drunken knight", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return iv1;
  }
}
