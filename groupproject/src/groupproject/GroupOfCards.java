package groupproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a group of cards, typically a deck.
 */
public class GroupOfCards {
    private ArrayList<Card> cards; // The group of cards

    public GroupOfCards() {
        cards = new ArrayList<>();
        initializeFullDeck(); // Initialize a full deck of cards
    }

    public void shuffle() {
        Collections.shuffle(cards); // Shuffle the cards
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0); // Draw the top card
        }
        return null; // No cards left
    }

    public boolean isEmpty() {
        return cards.isEmpty(); // Check if there are cards left
    }

    // Initialize a full deck of cards
    private void initializeFullDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }
}