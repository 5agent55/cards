package sk.ptacademy.cards.game;

import sk.ptacademy.cards.api.GameRules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ado on 20.03.2017.
 */
public class CardsServer {
    private List<GameRules> avalibleGameRules = new ArrayList<GameRules>();
    private Map<Class<? extends GameRules>, List<GameContext>> runningGames = new HashMap();
    private Map<Class<? extends GameRules>, GameContext> waitingGames = new HashMap();

    CardsServer(final List<GameRules> avalibleGameRules){
        this.avalibleGameRules = avalibleGameRules;
    }

    public List<GameRules> getAvalibleGameRules(){
        return this.avalibleGameRules;
    }
    public Player connectToGame(String playerName, GameRules gameRule) throws PlayerExistsExeption {
        Player player = new Player(playerName);
        GameContext context;
        if(!waitingGames.containsKey(gameRule.getClass())){
            context = createGameContext(gameRule);
            waitingGames.put(gameRule.getClass(),context);
        }else{
            context = waitingGames.get(gameRule.getClass());
        }
        context.addPlayer(player);
        if (context.players.size() >= gameRule.getMaxPlayersCount()){
            //to do
        }

        return player;
    }
    private GameContext createGameContext(GameRules gameRules){
        GameContext gameContext = new GameContext(gameRules);
        return gameContext;
    }
}
