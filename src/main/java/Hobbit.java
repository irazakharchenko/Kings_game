

public class Hobbit extends Character {

    public Hobbit(){
        super(0,3, "Hobbit");

    }

    public void kick(Character c){
        toCry();

    }
    public void toCry(){
        System.out.println("Que que que");
    }


}
