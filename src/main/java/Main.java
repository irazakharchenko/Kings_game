public class Main {
    public static void main(String[] args) {

         CharacterFactory CF = new CharacterFactory();
         Character ch1 = CF.createCharacter();
         Character ch2 = CF.createCharacter();
         GameManager GM = new GameManager();
         GM.fight(ch1, ch2);

    }
}
