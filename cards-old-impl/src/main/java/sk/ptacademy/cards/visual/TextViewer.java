
package sk.ptacademy.cards.visual;

import sk.ptacademy.cards.api.model.Card;


public class TextViewer implements Viewer {

    @Override
    public void viewCard(Card card) {
       System.out.println(card.getColor()+"-"+card.getValue());
    }
    

  
    
       
    
    
}
