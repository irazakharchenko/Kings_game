

public class Elf extends Character {
    private KickBehaviour kickBehaviour = new Sword();
    public Elf(){
        super(10, 10, "Elf");
    }


    public void kick(Character c ){
        if(c.power < this.power)
            c.hp = 0;
        else {
            if (c.power > 0) {
                c.power--;

            }
            kickBehaviour.kick(this, c);
        }


    }



}
