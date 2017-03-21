package sk.ptacademy.cards.api.model;

import java.util.List;
import sk.ptacademy.cards.api.model.Color;

/**
 *
 * @author Andrej Paučo
 */
public interface Deck {
    int getLowestCardValue();
    int getHighestCardValue();
    List <Color> getColors();
}
