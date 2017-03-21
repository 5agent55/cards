/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.ptacademy.cards.game;

import sk.ptacademy.cards.api.model.Deck;
import java.util.ArrayList;
import java.util.List;
import sk.ptacademy.cards.api.model.Card;

/**
 *
 * @author 5b_murgas_a
 */
public class DeckBuilder {
    public static List <Card> build(Deck deck){
       List <Card> resultingDeck = new ArrayList();
       for(int i = 0; i < deck.getColors().size(); i++){
           for (int j = deck.getLowestCardValue(); j <= deck.getHighestCardValue(); j++){
               Card k = new Card((short)(j), deck.getColors().get(i));
               resultingDeck.add(k);
           }
       }
        
     
        return resultingDeck;
    }
}