

public class GameManager {
    void fight(Character c1, Character c2){
        System.out.println(c1 + " in the red edge.");
        System.out.println(c2 + " in the blue edge.");
        System.out.println("Who will win?\n We will see.\n---------------------------");
        boolean b = true, tie = false;

        while( c1.isAlive() && c2.isAlive()){
            if (b) {
                System.out.println(c1.name + " turn.");
                c1.kick(c2);
                b = false;

            }
            else {
                System.out.println(c2.name + " turn.");
                c2.kick(c1);
                b = true;

            }

            System.out.println(c1 + "\n" + c2 + "\n---------------------------");
            if(c1.power == 0 && 0 == c2.power) {
                tie = true;
                break;
            }
        }
        if(tie){
            System.out.println("Tie.");
        }
        else if(c1.isAlive()){
            System.out.println(c1.name + " win. " );
        }
        else {
            System.out.println(c2.name + " win. ");
        }

    }


}

