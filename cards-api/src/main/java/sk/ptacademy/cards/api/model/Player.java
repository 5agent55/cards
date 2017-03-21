package sk.ptacademy.cards.api.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {
    private String name;
    private UUID playerId;
    Player(final String name){
        this.name = name;
        this.playerId = UUID.randomUUID();
    }
    String getName(){
        return this.name;
    }
    UUID getPlayerId() { return this.playerId;}

    List<Card> hand = new ArrayList();

    public void addToHand(Card card) {
        hand.add(card);
    }

    public Card throwAwayCard(Card card) {
        int index = -1;

        for (Card k : hand) {
            if (card.value == k.value && card.getColor().equals(k.getColor())) {
                index = hand.indexOf(k);
                break;
            }
        }
        if (index != -1) {
            return hand.remove(index);
        } else {
            return null;
        }    
    }

    public List<Card> getHand() {
        return hand;
    }       
}
