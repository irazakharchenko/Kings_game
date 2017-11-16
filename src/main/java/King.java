import java.util.Random;

public  class King extends SwordsMan{


    private KickBehaviour kickBehaviour = new Sword();




    public King(){


        super(5,15, 5, 15,"King");
    }

    @Override
    public void kick(Character c){
        if(getHp() > 10){
            kickBehaviour = (c1, c2) -> c2.setHp(0);
        }
        kickBehaviour.kick(this, c);
    }

}
