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
public class IA {
    private int jugada;
    
    public IA(){
        this.jugada = 0;
    }
    
    public void determinarJugada(int res){
        if (res == 1) {
            this.jugada = 2;
        }else if (res == 2) {
            this.jugada = 3;
        }else if (res == 3) {
            this.jugada = 2;
        }else if (res == 4) {
            this.jugada = 1;
        }else if (res == 5) {
            this.jugada = 2;
        }else if (res == 6) {
            this.jugada = 3;
        }else if (res == 7) {
            this.jugada = 2;
        }else if (res == 8) {
            this.jugada = 1;
        }else if (res == 9) {
            this.jugada = 2;
        }else if(res == 10){
            this.jugada = 3;
        }else if (res == 11) {
            this.jugada = 2;
        }else if (res == 12) {
            this.jugada = 1;
        }else if (res == 13) {
            this.jugada = 2;
        }else if (res == 14) {
            this.jugada = 3;
        }else if (res == 15) {
            this.jugada = 2;
        }else if (res == 16) {
            this.jugada = 1;
        }else if (res == 17) {
            this.jugada = 2;
        }else if (res == 18) {
            this.jugada = 3;
        }else if (res == 19) {
            this.jugada = 2;
        }else if (res == 20) {
            this.jugada = 1;
        }else if (res == 21) {
            this.jugada = 1;
        }
    }
    
    public int getJugada(){
        return this.jugada;
    }
}
