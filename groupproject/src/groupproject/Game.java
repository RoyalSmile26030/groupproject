package groupproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nietr
 */
public class Game {
    private Player player1;
    private Player player2;
    private GroupOfCards deck;

    public Game(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        deck = new GroupOfCards();
        deck.shuffle();
        dealCards();
    }

    private void dealCards() {
        while (!deck.isEmpty()) {
            player1.addCard(deck.drawCard());
            if (!deck.isEmpty()) {
                player2.addCard(deck.drawCard());
            }
        }
    }

    public void play() {
        while (player1.hasCards() && player2.hasCards()) {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getValue() > card2.getValue()) {
                System.out.println(player1.getName() + " wins the round!");
                player1.addCard(card1);
                player1.addCard(card2);
            } else if (card2.getValue() > card1.getValue()) {
                System.out.println(player2.getName() + " wins the round!");
                player2.addCard(card1);
                player2.addCard(card2);
            } else {
                System.out.println("War!");
                // Logic for a "war" (could involve drawing more cards)
            }
            System.out.println(player1.getName() + " has " + player1.getHandSize() + " cards left.");
            System.out.println(player2.getName() + " has " + player2.getHandSize() + " cards left.");
        }

        if (player1.hasCards()) {
            System.out.println(player1.getName() + " wins the game!");
        } else {
            System.out.println(player2.getName() + " wins the game!");
        }
    }

    public static void main(String[] args) {
        Game warGame = new Game("Player 1", "Player 2");
        warGame.play();
    }
}
