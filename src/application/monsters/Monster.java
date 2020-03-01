package application.monsters;

public abstract class Monster {
  private Integer attackPower;
  private Integer deffence;
  private Integer magicPower;
  private Integer speed;
  private Integer row;
  private Integer col;

  public Monster(
      Integer attackPower,
      Integer deffence,
      Integer magicPower,
      Integer speed,
      Integer row,
      Integer col) {
    this.attackPower = attackPower;
    this.deffence = deffence;
    this.magicPower = magicPower;
    this.speed = speed;
    this.row = row;
    this.col = col;
  }

  public void move(Integer row, Integer col) {
    this.row = row;
    this.col = col;
  }

  public void attack() {};
}
