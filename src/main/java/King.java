import java.util.Random;

public  class King extends Character{

    protected int MAX_POWER = 15;
    protected int MIN_POWER = 5;
    private KickBehaviour kickBehaviour = new Sword();

    private String name = "King";

    public String getName() {
        return name;
    }

    public King(){


        super(5,15, new Random().nextInt(15 - 5) + 5,
                "King");
    }

    @Override
    public void kick(Character c){
        if(getHp() > 10){
            kickBehaviour = (c1, c2) -> c2.setHp(0);
        }
        kickBehaviour.kick(this, c);
    }

    @Override
    public String toString(){
        return name + " power: " + MIN_POWER + " - " + MAX_POWER + ", hp: " + hp ;
    }



}
