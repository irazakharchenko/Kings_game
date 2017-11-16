import java.util.Random;

public class SwordsMan extends Character {


    Random rand = new Random();
    protected int MAX_POWER;
    protected int MIN_POWER;
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
        c.setHp(c.getHp() - (rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER));
        if(c.hp < 0){
            c.hp = 0;
        }
    }
    @Override
    public String toString(){
        return name + " power: " + MIN_POWER + " - " + MAX_POWER + ", hp: " + hp ;
    }
}
