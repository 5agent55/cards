/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.ptacademy.cards.game.gameofseven;

import sk.ptacademy.cards.api.model.Deck;
import sk.ptacademy.cards.api.model.Color;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 5b_murgas_a
 */
public class GameOfSevenDeck implements Deck {
    private static final Color[] colors = {GameOfSevenColors.HEARTS, GameOfSevenColors.DIAMONDS, GameOfSevenColors.CLUBS, GameOfSevenColors.SPADES};

    @Override
    public int getLowestCardValue() {
        return 7;
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
