package application.misc;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
  private List<Monster> monsterCards = new LinkedList<>();
  private List<Magic> magicCards = new LinkedList<>();
  private Random rand = new Random();
  private List<Monster> monsterInHand = new LinkedList<>();
  private List<Magic> magicInHand = new LinkedList<>();
  private Integer mp;

  public Player(String name) {
    this.name = name;
    init();
  }

  public Integer getMp() {
    return mp;
  }

  public void setMp(Integer mp) {
    this.mp = mp;
  }

  public void init() {
    monsterCards.add(new DogEatingBug(-1, -1));
    monsterCards.add(new DrunkenKnight(-1, -1));
    monsterCards.add(new MagicCat(-1, -1));
    monsterCards.add(new RecklessCanibal(-1, -1));
    monsterCards.add(new SandTurtle(-1, -1));
    monsterCards.add(new SophisticatedSam(-1, -1));
    magicCards.add(new AttackOn());
    magicCards.add(new DeffenceUp());
    magicCards.add(new HealTheWorld());
    magicCards.add(new Move());
    magicCards.add(new Warrr());
  }

  public void drawMonster() {
    int randomCard = rand.nextInt(6);
    monsterInHand.add(monsterCards.get(randomCard));
  }

  public void drawMagic() {
    int randomMagick = rand.nextInt(5);
    magicInHand.add(magicCards.get(randomMagick));
  }

  public List<Monster> getMonsterInHand() {
    return monsterInHand;
  }

  public List<Magic> getMagicInHand() {
    return magicInHand;
  }

  public Integer rollTheDice() {
    return rand.nextInt(6);
  }
}
