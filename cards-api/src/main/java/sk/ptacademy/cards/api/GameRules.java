package sk.ptacademy.cards.api;

import sk.ptacademy.cards.api.model.Card;
import sk.ptacademy.cards.api.model.Deck;
import sk.ptacademy.cards.api.model.GameDirection;

/**
 *
 * @author Andrej Paučo
 */
public interface GameRules {
    /**
     * This method validates wether top card can be placed over bottom card
     * in specific game context.
     * @param bottomCard
     * @param topCard
     * @return 
     */
    boolean isValidMove(Card bottomCard, Card topCard);

    /**
     * Returns maximum amount of players in game.
     * @return
     */
    short getMaxPlayersCount();

    /**
     * Returns minimum amount of players needed to start a game.
     * @return
     */
    short getMinPlayersCount();

    /**
     * This metod returns the direction of the game described by {@link GameRules}
     * @return
     */
    GameDirection getGameDirection();

    /**
     * Returns deck that is used to play the game.
     * @return
     */
    Deck getDeck();

}
