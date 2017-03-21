package sk.ptacademy.cards;

import sk.ptacademy.cards.game.gameofseven.GameOfSevenDeck;
import sk.ptacademy.cards.game.DeckBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sk.ptacademy.cards.game.DeckBuilder;
import sk.ptacademy.cards.api.model.Player;
import sk.ptacademy.cards.api.model.Card;
import sk.ptacademy.cards.visual.TextViewer;
import sk.ptacademy.cards.visual.UnicodeViewer;
import sk.ptacademy.cards.visual.Viewer;

public class Application {

    public static void main(String[] args) {
        List<Card> deck = DeckBuilder.build(new GameOfSevenDeck());
         
        Viewer viewer = new UnicodeViewer();
        for(int i = 0; i<deck.size();i++){
        viewer.viewCard(deck.get(i));
        }
    }
}
