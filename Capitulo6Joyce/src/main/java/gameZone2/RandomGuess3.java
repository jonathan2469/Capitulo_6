/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

import java.util.Scanner;


/**
 *
 * @author jonat
 */
public class RandomGuess3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Integer resp;
        
        Integer contador = 0;
        
        Integer numero = (1 + (int)(Math.random() * 10));
                    
        do {
        System.out.println("Piense en un numero del 1 al 10");
        
        resp = leer.nextInt();  

        if (resp == numero) {
            
            System.out.println("Correcto");
            
        }else if (resp > numero) {
            
            System.out.println("Muy alto");
            
        }else if (resp < numero) {
            
            System.out.println("Muy bajo");
            
        }
        
        contador++;
        }while(resp != numero);
        
 
        System.out.println("El numero  " + numero); 
        
        System.out.println("Numero de intentos  "+contador);
    }
    
    
}
