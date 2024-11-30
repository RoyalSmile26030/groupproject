package groupproject;

import java.util.Scanner;

/**
 * The main game class that handles the game flow.
 */
public class Game {
    private Player player1;
    private Player player2;
    private GroupOfCards deck;

    public Game() {
        this.deck = new GroupOfCards(); // Create a new deck of cards
        deck.shuffle(); // Shuffle the deck
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        // Get player names
        System.out.print("Enter the name of Player 1: ");
        String name1 = scanner.nextLine();
        player1 = new Player(name1);

        System.out.print("Enter the name of Player 2: ");
        String name2 = scanner.nextLine();
        player2 = new Player(name2);

        // Distribute cards to players
        for (int i = 0; i < 26; i++) {
            player1.addCard(deck.drawCard());
            player2.addCard(deck.drawCard());
        }

        // Start the game rounds
        playRounds();
        scanner.close();
    }

    private void playRounds() {
        Scanner scanner = new Scanner(System.in);

        while (player1.hasCards() && player2.hasCards()) {
            System.out.println("\n" + player1.getName() + " has " + player1.getCardCount() + " cards.");
            System.out.println(player2.getName() + " has " + player2.getCardCount() + " cards.");

            // Ask players to play the next round
            System.out.print("\nPress Enter to play the next round...");
            scanner.nextLine();

            // Players play their top cards
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();
            System.out.println(player1.getName() + " plays: " + card1);
            System.out.println(player2.getName() + " plays: " + card2);

            // Compare card values
            int comparison = compareCards(card1, card2);
            if (comparison > 0) {
                System.out.println(player1.getName() + " wins this round!");
                player1.addCard(card1);
                player1.addCard(card2);
            } else if (comparison < 0) {
                System.out.println(player2.getName() + " wins this round!");
                player2.addCard(card1);
                player2.addCard(card2);
            } else {
                System.out.println("It's a tie! Cards are returned to each player.");
                player1.addCard(card1);
                player2.addCard(card2);
            }
        }

        // Declare the winner
        declareWinner();
    }

    private int compareCards(Card card1, Card card2) {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int value1 = getCardValue(card1.getValue(), values);
        int value2 = getCardValue(card2.getValue(), values);

        return Integer.compare(value1, value2);
    }

    private int getCardValue(String value, String[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)) {
                return i; // Return the index as the value
            }
        }
        return -1; // Default if not found
    }

    private void declareWinner() {
        System.out.println("\nGame Over!");
        if (player1.hasCards()) {
            System.out.println(player1.getName() + " wins the game with " + player1.getCardCount() + " cards!");
        } else if (player2.hasCards()) {
            System.out.println(player2.getName() + " wins the game with " + player2.getCardCount() + " cards!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
