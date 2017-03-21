package sk.ptacademy.cards.game;


import org.junit.Assert;
import org.junit.Test;
import sk.ptacademy.cards.api.GameRules;
import sk.ptacademy.cards.api.model.Card;
import sk.ptacademy.cards.api.model.Deck;
import sk.ptacademy.cards.api.model.GameDirection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrej Paučo on 13.03.2017.
 */
public class GameContextTest {
    @Test
    public void addPlayer() throws Exception {
        String playerName = "Janko";
        Player player = new Player(playerName);
        GameRules gameRules = new GameRules() {
            public boolean isValidMove(Card bottomCard, Card topCard) {
                return false;
            }

            public short getMaxPlayersCount() {
                return 0;
            }

            public short getMinPlayersCount() {
                return 0;
            }

            public GameDirection getGameDirection() {
                return null;
            }

            public Deck getDeck() {
                return null;
            }
        };

        GameContext context = new GameContext(gameRules);
        context.addPlayer(player);
        assertEquals(1,context.players.size());
        
    }

    @Test
    public void removePlayer() throws Exception {

    }

}