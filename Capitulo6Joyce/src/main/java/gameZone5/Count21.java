/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Count21 {
    public static void main(String[] args) {
        IA comp = new IA();
        Player jug = new Player();
        Scanner leer = new Scanner(System.in);
        int marcador = 0;
        
        
        do {
            System.out.println("Marcador: " +marcador);
            int num=0;
            do {
                System.out.println("Introduzca un número del 1 al 3:");
                 num = leer.nextInt();
                 if ((num==1)||(num==2)||(num==3)) {
                    break;
                }
            } while (true);           
            
            jug.setJugada(num);
            marcador+=num;
            
            if (marcador>21) {
                System.out.println("Ha ganado la computadora");
                break;
            }
            
            comp.determinarJugada(marcador);
            marcador+=comp.getJugada();
            
            if (marcador>21) {
                System.out.println("Ha ganado el jugador");
                break;
            }
            
        } while (marcador<=21);
        
        
    }


    }



