/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.ptacademy.cards.game;

/**
 *
 * @author Andrej Paučo
 */
class Player {
    private final String name;
    Player(final String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}