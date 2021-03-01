/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class TwoDices3 {
    public static void main(String[] args) {
        Die dado = new Die();
        Die dado2 = new Die();
        
        Scanner leer = new Scanner(System.in);
        
        Integer resp = 0;
        
        Integer contador = 1;
    
        dado.Lanzar();
        dado2.Lanzar();
            
        Integer resultado = dado.getNumero() + dado.getNumero();
        
        do {
            System.out.println("Escoge un numero entre 2 y 12 ");
            resp = leer.nextInt();
            
            if (resp != resultado){
                System.out.println("Te equivocaste");
            }
            
        contador++;
            
        } while ((contador <= 3)&&(resp != resultado));
            if (resp == resultado) {
                System.out.println("Felicidades ganaste");
                System.out.println("El valor era " + resultado);
            }else{
                System.out.println("El valor era " + resultado);
                System.out.println("Lo siento la computadora gana");
            }
    }
}
