package application.monsters;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DogEatingBug extends Monster {

  public DogEatingBug(Integer row, Integer col) {
    super(row, col);
    monsterName = "Dog-eating bug";
    attackPower = 10;
    deffence = 2;
    magicPower = 8;
    speed = 5;
  }

  @Override
  public Node getMonsterNode(double width, double height) {
    Image pugmaw = new Image("DogEatingBug.jpg");
    ImageView iv1 = new ImageView();
    iv1.setImage(pugmaw);
    Label label = new Label("DogEatingBug", iv1);
    label.setContentDisplay(ContentDisplay.TOP);
    iv1.setFitWidth(width);
    iv1.setFitHeight(height);
    iv1.setPreserveRatio(false);
    return iv1;
  }
}
