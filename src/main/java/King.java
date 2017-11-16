import java.util.Random;

public class King extends SwordsMan {


    private KickBehaviour kickBehaviour = new Sword();

    public King() {


        super(5, 15, 5, 15, "King");
    }

    @Override
    public void kick(Character c) {
        if (this.getHp() > 10) {
            c.setHp(0);
        } else {
            kickBehaviour.kick(this, c);
        }
        setPower(getMIN_POWER() + new Random().nextInt(getMAX_POWER() - getMIN_POWER()));
    }

}
