

public class Elf extends Character {
    public Elf(){
        super(10, 10, "Elf");
    }

    public void kick(Character c ){
        if(c.power < this.power)
            c.hp = 0;
        else
            if(c.power > 0){
                c.power--;
            }

    }



}
