package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Card.*;

public class CardGame {
    static List<Card> deckOfCards = new ArrayList<>(){};


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

    static void getDeck(){
        for (Card card : deckOfCards){
            System.out.println(card);
        }

    }
}
