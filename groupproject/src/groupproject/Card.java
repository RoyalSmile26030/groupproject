package groupproject;

/**
 * Represents a playing card with a suit and value.
 */
public class Card {
    private String suit;  // The suit of the card
    private String value; // The value of the card

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
