package groupproject;


import java.util.ArrayList;

/**
 * Represents a player in the game.
 */
public class Player {
    private String name;  // Player's name
    private ArrayList<Card> hand; // Player's hand of cards

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize an empty hand
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card); // Add a card to the player's hand
    }

    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0); // Play the top card
        }
        return null; // No cards left to play
    }

    public boolean hasCards() {
        return !hand.isEmpty(); // Check if the player has cards left
    }
}