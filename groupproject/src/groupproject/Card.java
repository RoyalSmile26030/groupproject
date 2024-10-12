/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package groupproject;

public class Card {
    private String suit;
    private int value; // Value from 2 to 14 (2-10, Jack=11, Queen=12, King=13, Ace=14)

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        String[] valueNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        return valueNames[value - 2] + " of " + suit;
    }
}