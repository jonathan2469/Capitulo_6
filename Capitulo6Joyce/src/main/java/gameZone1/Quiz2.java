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
public class Quiz2 {
    public static void main(String[] args) {
        Cuerpo quiz = new Cuerpo();

        quiz.addPregunta("De qué color es el cielo?");
        quiz.addInciso(1, new Inciso("azul", true));
        quiz.addInciso(1, new Inciso("rojo", false));
        quiz.addInciso(1, new Inciso("no sé", false));
        quiz.addInciso(1, new Inciso("Marrón", false));
        quiz.addPregunta("Quien engaño a roger rabbit?");
        quiz.addInciso(2, new Inciso("sí", true));
        quiz.addInciso(2, new Inciso("tu", false));
        quiz.addInciso(2, new Inciso("chespirito", false));
        quiz.addInciso(2, new Inciso("no se", false));
        quiz.addPregunta("El profe krim es el mejor?");
        quiz.addInciso(3, new Inciso("sí", true));
        quiz.addInciso(3, new Inciso("no", false));
        quiz.addInciso(3, new Inciso("no sé", false));
        quiz.addInciso(3, new Inciso("Poco", false));

        
        int n=3;
        int i = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Responde cada pregunta correctamente");
        do{
            
            quiz.imprimir(i);
            if(quiz.verificaPregunta(i,leer.nextInt())){
                i++;
            }
            
        }while(i<quiz.getQuizSize());
    }
}
