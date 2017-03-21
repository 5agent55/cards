package sk.ptacademy.cards.game;

import java.util.HashMap;
import java.util.Map;
import sk.ptacademy.cards.api.GameRules;

/**
 *
 * @author Andrej Paučo
 */
public class GameContext {
    Map<String,Player> players = new HashMap();
    GameRules rules;
    boolean gameRunning = false;

    GameContext(GameRules rules) {
        this.rules = rules;
    }

    public void startGame() throws NotEnoughPlayersExeption {
        if(players.size()<rules.getMinPlayersCount())
            throw new NotEnoughPlayersExeption();
        this.gameRunning = true;
    }



    /**
     * Adds player to list of players in {@link GameContext}
     * Throws {@link PlayerExistsExeption} if player is allready in the game.
     * @param player
     */
    void addPlayer(Player player) throws PlayerExistsExeption {
        if (players.containsKey(player.getName())){
            throw new PlayerExistsExeption();
        }

        players.put(player.getName(),player);
    }


    /**
     * Removes specified player from list of players in {@link GameContext}
     * @param player
     */
    void removePlayer(Player player){
        if (players.containsKey(player.getName())){
            players.remove(players.get(player.getName()));
        }
    }
}
