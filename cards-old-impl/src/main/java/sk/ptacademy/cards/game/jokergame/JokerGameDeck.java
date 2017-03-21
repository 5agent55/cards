/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.ptacademy.cards.game.jokergame;

import sk.ptacademy.cards.api.model.Deck;
import sk.ptacademy.cards.api.model.Color;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 5b_murgas_a
 */
public class JokerGameDeck implements Deck {
    private static final Color[] colors = {JokerGameColors.DIAMONDS, JokerGameColors.CLUBS, JokerGameColors.SPADES, JokerGameColors.HEARTS, JokerGameColors.JOKER};

    @Override
    public int getLowestCardValue() {
        return 1;
    }

    @Override
    public int getHighestCardValue() {
        return 14;
    }

    @Override
    public List<Color> getColors() {
        return Arrays.asList(colors);
    }
    
}
