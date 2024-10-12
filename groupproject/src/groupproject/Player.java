package groupproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nietr
 */
import java.util.LinkedList;

public class Player {
    private String name;
    private LinkedList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.addLast(card);
    }

    public Card playCard() {
        return hand.removeFirst(); // Play the top card
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public int getHandSize() {
        return hand.size();
    }
}
