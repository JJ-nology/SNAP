
package org.example;

import java.util.*;


public class CardGame {
    static final String[] cardSuit = new String[]{"♠", "♥", "♦", "♣"};
    static final String[] cardSymbol = new String[]{"2", "3","4","5","6","7","8","9","10","J","Q","K","A"};
    static final int[] cardValue = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14};
    protected static List<Card> deckOfCards = new ArrayList<>();

    public CardGame() {
        populateDeck();
    }
//setup card deck and add cards to the new deck
    public static void populateDeck(){
        for (String suit: cardSuit){
            int count = 0;
            for(String symbol: cardSymbol){
                Card card = new Card(suit, symbol, cardValue[count++]);
                deckOfCards.add(card);
            }
        }
    }
//get the full deck of cards
    public static List<Card> getDeckOfCards() {
        return deckOfCards;
    }
//print out each card using its suit and symbol
    static void getDeck(){
        for (Card card : deckOfCards){
            System.out.println(card.suit + card.symbol);
        }

    }
//deal a single card from the top of the deck
    public void dealCard(){
        System.out.println(deckOfCards.getFirst());
    }
//sort the deck by each card's value
    public void sortDeckInNumberOrder(){
        deckOfCards.sort(Comparator.comparingInt(card -> card.value));
    }
//sort the deck by grouping suits together
    public void sortDeckIntoSuits(){
        deckOfCards.sort(Comparator.comparing(card -> card.suit));
    }
//shuffle/ randomize the whole deck
    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
}
