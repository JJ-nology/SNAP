package org.example;

public class Card {
    static final String[] cardSuit = new String[]{"♠", "♥", "♦", "♣"};
    static final String[] cardSymbol = new String[]{"2", "3","4","5","6","7","8","9","10","J","Q","K","A"};
    static final int[] cardValue = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14};
    protected String suit;
    protected String symbol;
    protected int value;


    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }


    @Override
    public String toString(){
        return this.suit + this.symbol;
    }
}