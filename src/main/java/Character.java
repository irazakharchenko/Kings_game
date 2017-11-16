import java.util.Random;

public abstract class Character {
    protected int power;
    protected int hp;
    protected String name;

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void kick(Character c);
    public boolean isAlive(){
        if (getHp() < 0)
            setHp(0);
        return getHp() > 0;
    }

    Character(int power, int hp, String name){
        this.power = power;
        setHp(hp);
        this.name = name;
    }

    Character(int power_min, int power_max, int hp, String name){
        power = new Random().nextInt(power_max - power_min) + power_min;
        this.hp = hp;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " power: " + power + ", hp: " + hp ;
    }
}