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

    public void setPower(int power){
        this.power = power;
    }

    public abstract void kick(Character c);
    public boolean isAlive(){

        return getHp() > 0;
    }

    Character(int power, int hp, String name){
        this.power = power;
        setHp(hp);
        this.name = name;
    }



    @Override
    public String toString() {
        return getName() + " power: " + power + ", hp: " + hp ;
    }
}