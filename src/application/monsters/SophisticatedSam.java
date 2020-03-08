package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SophisticatedSam extends Monster {

  public SophisticatedSam(Integer row, Integer col) {
    super(row, col);
    monsterName = "Sam";
    attackPower = 10;
    deffence = 5;
    magicPower = 4;
    speed = 1;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("sam.png");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("Sophisticated Sam", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return iv1;
  }
}
