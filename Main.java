import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What is player one's name?");
            Player player1 = new Player(input.nextLine());

            System.out.println("What is player two's name?");
            Player player2 = new Player(input.nextLine());

            DiceGame game = new DiceGame();
            game.optionsGame(player1, player2);

        }
    }
}
