
import java.util.Random;

public class CharacterFactory {

    public Character createCharacter(){
        int iCharacter = new Random().nextInt(4);
        //System.out.println(iCharacter);
        Character characterCurrent;
        switch(iCharacter){
            case 0:  characterCurrent = new Hobbit();
                     break;
            case 1:  characterCurrent = new Elf();
                     break;
            case 2:  characterCurrent = new King();
                     break;
            case 3:  characterCurrent = new Knight();
                     break;
            default: characterCurrent = new Hobbit();
                     break;

        }
        //System.out.println(characterCurrent);
        return characterCurrent;

    }
}
