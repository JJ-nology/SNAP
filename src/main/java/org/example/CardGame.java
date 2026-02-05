
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

    private static void populateDeck(){
        for (String suit: cardSuit){
            int count = 0;
            for(String symbol: cardSymbol){
                Card card = new Card(suit, symbol, cardValue[count++]);
                deckOfCards.add(card);
            }
        }
    }

    public static List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    static void getDeck(){
        for (Card card : deckOfCards){
            System.out.println(card.suit + card.symbol);
        }

    }

    public Card dealCard(){
        return deckOfCards.getFirst();
    }

    public void sortDeckInNumberOrder(){
        deckOfCards.sort(Comparator.comparingInt(card -> card.value));
    }

    public void sortDeckIntoSuits(){
        deckOfCards.sort(Comparator.comparing(card -> card.suit));
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
        getDeck();
    }
}
