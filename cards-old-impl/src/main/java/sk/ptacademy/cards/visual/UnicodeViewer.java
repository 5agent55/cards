
package sk.ptacademy.cards.visual;

import sk.ptacademy.cards.game.gameofseven.GameOfSevenColors;
import sk.ptacademy.cards.api.model.Card;


public class UnicodeViewer implements Viewer{

    @Override
    public void viewCard(Card card) {
        if(card.getColor() instanceof GameOfSevenColors){
        switch((GameOfSevenColors) card.getColor()){
            case HEARTS: 
                System.out.print("\u2665 ");
                break;
            case SPADES:
                System.out.print("\u2660 ");
                break;
            case DIAMONDS:
                System.out.print("\u2663 ");
                break;
            case CLUBS:
                System.out.print("\u2666 ");
                break;
        }
        System.out.println(card.getValue());   
        }
        else{
            System.out.println("Is not CommonFarba");
        }
    }
   
}
