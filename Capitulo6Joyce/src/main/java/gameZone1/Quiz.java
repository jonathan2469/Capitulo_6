/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Quiz {
    public static void main(String[] args) {
        Cuerpo quiz = new Cuerpo();

        quiz.addPregunta("De qué color es el cielo?");
        quiz.addInciso(1, new Inciso("azul", true));
        quiz.addInciso(1, new Inciso("rojo", false));
        quiz.addInciso(1, new Inciso("no sé", false));
        quiz.addInciso(1, new Inciso("Marrón", false));
        quiz.addPregunta("Quiero demasiado a Abril?");
        quiz.addInciso(2, new Inciso("sí", true));
        quiz.addInciso(2, new Inciso("no", false));
        quiz.addInciso(2, new Inciso("no sé", false));
        quiz.addInciso(2, new Inciso("Poco", false));
        quiz.addPregunta("Ella me quiere?");
        quiz.addInciso(3, new Inciso("sí", true));
        quiz.addInciso(3, new Inciso("no", false));
        quiz.addInciso(3, new Inciso("no sé", false));
        quiz.addInciso(3, new Inciso("Poco", false));

        
        int n=3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Responde cada pregunta correctamente");
        for (int i = 0; i < quiz.getQuizSize(); i++) {
            quiz.imprimir(i);
            quiz.verificaPregunta(i,leer.nextInt());
            n++;
        }
        quiz.calificacion();
            
        
        
    }
}
