import java.util.Random;

import static java.lang.Math.max;

public class SwordsMan extends Character {





    private int MAX_POWER;
    private int MIN_POWER;


    public int getMAX_POWER() {
        return MAX_POWER;
    }

    public int getMIN_POWER() {
        return MIN_POWER;
    }

    public SwordsMan(int power_min, int power_max, int hp_min, int hp_max, String name){
        // we take random power as elf's kick depends on power his enemy
        // but when swordsman kick it will be another power
        super(new Random().nextInt(power_max - power_min) + power_min, new Random().nextInt(
                hp_max - hp_min) + hp_min, name);
        MAX_POWER = power_max;
        MIN_POWER = power_min;
        this.name = name;
    }
    @Override
    public void kick(Character c){
        Random rand = new Random();
        c.setHp(max(c.getHp() - (rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER), 0));

    }
    //@Override
    //public String toString(){
      //  return name + " power: " + MIN_POWER + " - " + MAX_POWER + ", hp: " + hp ;
    //}
}
