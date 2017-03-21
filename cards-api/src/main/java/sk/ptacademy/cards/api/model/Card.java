
package sk.ptacademy.cards.api.model;

import sk.ptacademy.cards.api.model.Color;
public class Card {

    short value;
    
    Color color;

  /* public String zobraz() {
        return this.color + "-" + this.value;
    }
*/
    public Card(short value, Color color) {
        this.value = value;
        this.color = color;
    }

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
