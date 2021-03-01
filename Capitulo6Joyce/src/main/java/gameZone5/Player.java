/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

/**
 *
 * @author jonat
 */
public class Player {
    private int jugada;
    
    public Player(){
        this.jugada = 0;
    }
    
    public void setJugada(int num){
        this.jugada = num;
    }
    
    public int getJugada(){
        return this.jugada;
    }
}
