public class IncrementsDecrements {
    public static void main(String[] args) {

        int lives = 5;

        //PostFija se accede primero a la variable y despues se incrementa
        lives--;
        System.out.println(lives);
        lives++;
        System.out.println(lives);

        //PreFija se incrementa directamente la variable y despues se accede
        int gift = 100 + ++lives;
        System.out.println(gift);
    }
}
