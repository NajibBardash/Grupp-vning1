import java.util.*;
import java.util.concurrent.*;

public class DiceGame {
    public void optionsGame(Player player1, Player player2) {
        try (Scanner input = new Scanner(System.in)) {
            loop: while (true) {
                System.out.println("New game: ");
                System.out.println("Rules are simple, roll the dice, try to get the highest ammount.");
                System.out.println("Options: \n\tType 1 to start game.\n\tType 2 to quit");

                int option = input.nextInt();
                System.out.println();

                switch (option) {
                    case 1:
                        play(player1, player2);
                        break;
                    case 2:
                        System.out.println("Rounds played: " + player1.getroundsPlayed());
                        System.out.printf("%s won %d rounds!%n", player1.getName(), player1.getHighScore());
                        System.out.printf("%s won %d rounds!%n", player2.getName(), player2.getHighScore());
                        System.out.printf("They reached a tie %d times.%n", (player1.getroundsPlayed() - (player1.getHighScore() + player2.getHighScore())));

                        if (player1.getHighScore() > player2.getHighScore()) {
                            System.out.printf("%s won!%n", player1.getName());
                        } 
                        else if (player2.getHighScore() > player1.getHighScore()) {
                            System.out.printf("%s won!%n", player2.getName());
                        } 
                        else {
                            System.out.printf("We have a tie! Both players won %d rounds each.%n",
                                    player1.getHighScore());
                        }
                        System.out.println("Thanks for playing, game now shutting down...");
                        break loop;
                    default:
                        break;
                }
            }
        }
    }

    public static void play(Player player1, Player player2) {
        int player1Roll = ThreadLocalRandom.current().nextInt(10) + 1;
        int player2Roll = ThreadLocalRandom.current().nextInt(10) + 1;

        if (player1Roll > player2Roll) {
            System.out.printf("%s won! With a roll of %d. %s rolled %d.%n%n", player1.getName(), player1Roll,
                    player2.getName(), player2Roll);
            player1.newHighScore();
        }

        else if (player2Roll > player1Roll) {
            System.out.printf("%s won! With a roll of %d. %s rolled %d.%n%n", player2.getName(), player2Roll,
                    player1.getName(), player1Roll);
            player2.newHighScore();
        }

        else {
            System.out.printf("A tie with rolls of %d!%n", player1Roll);
        }

        player1.countRounds();
        player2.countRounds();
    }
}
