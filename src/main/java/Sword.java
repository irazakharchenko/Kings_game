import java.util.Random;

import static java.lang.Math.max;

public class Sword implements KickBehaviour {
    public void kick(Character c1, Character c2) {
        c2.setHp(max(c2.getHp() - c1.getPower() + new Random().nextInt(c1.getPower()), 0));

    }
}