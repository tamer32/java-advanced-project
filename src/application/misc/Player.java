package application.misc;

import java.util.List;

import application.magic.AttackOn;
import application.magic.DeffenceUp;
import application.magic.HealTheWorld;
import application.magic.Magic;
import application.magic.Move;
import application.magic.Warrr;
import application.monsters.DogEatingBug;
import application.monsters.DrunkenKnight;
import application.monsters.MagicCat;
import application.monsters.Monster;
import application.monsters.RecklessCanibal;
import application.monsters.SandTurtle;
import application.monsters.SophisticatedSam;

public class Player {
  private String name;
  private List<Monster> monsterCards;
  private List<Magic> magicCards;

  public Player(String name) {
    this.name = name;
    init();
  }

  public void init() {
    monsterCards.add(new DogEatingBug(10, 2, 8, 5, -1, -1));
    monsterCards.add(new DrunkenKnight(5, 5, 5, 5, -1, -1));
    monsterCards.add(new MagicCat(8, 5, 10, 1, -1, -1));
    monsterCards.add(new RecklessCanibal(4, 6, 8, 10, -1, -1));
    monsterCards.add(new SandTurtle(5, 10, 1, 4, -1, -1));
    monsterCards.add(new SophisticatedSam(10, 5, 4, 1, -1, -1));
    magicCards.add(new AttackOn());
    magicCards.add(new DeffenceUp());
    magicCards.add(new HealTheWorld());
    magicCards.add(new Move());
    magicCards.add(new Warrr());
  }

  public Monster drawMonster() {
    return monsterCards.get(1);
    // Add random generator;
  }

  public Magic drawMagic() {
    return magicCards.get(1);
    // Add random generator
  }
}
