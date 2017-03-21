package sk.ptacademy.cards.game.gameofseven;

import sk.ptacademy.cards.api.GameRules;
import sk.ptacademy.cards.api.model.Card;
import sk.ptacademy.cards.api.model.Deck;
import sk.ptacademy.cards.api.model.GameDirection;

/**
 *
 * @author Andrej Paučo
 */
public class GameOfSevenRules implements GameRules{


    public boolean isValidMove(Card bottomCard, Card topCard) {
        if(bottomCard.getColor() == topCard.getColor() || bottomCard.getValue() == topCard.getValue()){
            return true;
        }
        return false;
    }

    public short getMaxPlayersCount() {
        return 2;
    }

    public short getMinPlayersCount() {
        return 4;
    }

    public GameDirection getGameDirection() {
        return GameDirection.CLOCKWISE;
    }

    public Deck getDeck() {
        return null;
    }

}
