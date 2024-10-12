package groupproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nietr
 */
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    private ArrayList<Card> deck;

    public GroupOfCards() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                deck.add(new Card(suit, i));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        return deck.remove(0);
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }
}