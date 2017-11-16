import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KingTest {
    King k = new King(), k1 = new King();
    Knight kn = new Knight(), kn1 = new Knight();
    Hobbit h = new Hobbit(), h1 = new Hobbit();
    Elf e = new Elf(), e1 = new Elf();
    Main m = new Main();
    String[] arguments = new String[] {"123"};
    GameManager gm = new GameManager();
    CharacterFactory cf = new CharacterFactory();
    Character win ;

    @Test
    public void kick() throws Exception {
        k.setHp(11);
        k.kick(kn);

        assertEquals(false, kn.isAlive());
        kn.setHp(16);
        k = new King();

        for(int i  = 0; i < 10; i++) {
            k.setHp(9);
            kn.setHp(16);
            k.kick(kn);

            assertEquals(true, kn.getHp() > 0 && kn.getHp() < 12);
            k.setHp(13);
            kn.kick(k);


            assertEquals(true, k.getHp() > 0 && k.getHp() < 12);

        }

        h.kick(k);
        assertEquals(true, k.isAlive());
        k.setPower(6);
        e.kick(k);
        assertEquals(false, k.isAlive());
        kn.setHp(11);
        kn.setPower(11);
        assertEquals("Knight power: 11, hp: 11", kn.toString());
        e.kick(kn);
        assertEquals(true, kn.isAlive() && kn.getPower() == 10);
        Main.main(arguments);


    }

    @Test
    public void fight() throws Exception {
        //assertEquals(cf.createCharacter(), true);

        win = gm.fight(cf.createCharacter(), cf.createCharacter());
        assertEquals(true, win == null || win.getHp() > 0);
        win = gm.fight(k, e);
        assertEquals(true, win.getHp()>0 && (k.getHp() == 0 || e.getHp() == 0));
        win = gm.fight(e,e);
        assertEquals(true, win == null);
        win = gm.fight(h, h);
        assertEquals(true, win == null);
        k = new King();
        win = gm.fight(k1, k);
        assertEquals(true, win.getHp()>0 && (k.getHp() == 0 || k1.getHp() == 0));
        k = new King();
        win = gm.fight(k, kn1);
        assertEquals(true, win.getHp()>0 && (kn1.getHp() == 0 || k.getHp() == 0));
        kn1 = new Knight();
        kn = new Knight();
        win = gm.fight(kn, kn1);
        assertEquals(true,win.getHp()>0 && (kn1.getHp() == 0 || kn.getHp() == 0));
    }

}