package application.monsters;

import javafx.scene.Node;

public abstract class Monster {
  protected String monsterName;
  protected Integer attackPower;
  protected Integer deffence;
  protected Integer magicPower;
  protected Integer speed;
  private Integer row;
  private Integer col;

  public Monster(Integer row, Integer col) {
    this.row = row;
    this.col = col;
  }

  public void move(Integer row, Integer col) {
    this.row = row;
    this.col = col;
  }

  public void attack() {};

  @Override
  public String toString() {
    return "Monster [monsterName="
        + monsterName
        + ", attackPower="
        + attackPower
        + ", deffence="
        + deffence
        + ", magicPower="
        + magicPower
        + ", speed="
        + speed
        + "]";
  }

  public abstract Node getMonsterNode(double width, double height);
}
