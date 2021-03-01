/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;
import java.util.ArrayList;
/**
 *
 * @author jonat
 */
public class Cuerpo {
    private ArrayList<Pregunta> quiz;
    private Integer aciertos;

    public Cuerpo() {
        this.quiz = new ArrayList();
        this.aciertos = 0;
    }

    public void addPregunta(String pregunta) {
        quiz.add(new Pregunta(pregunta));
    }

    public void addInciso(Integer pr, Inciso x) {
        Pregunta r = quiz.get(pr - 1);
        r.setInciso(x.getTexto(), x.getStatus());
        quiz.set(pr - 1, r);

    }
  
    public void calificacion() {
        double a = (double)(this.aciertos);
        double s = (double)(quiz.size());
        System.out.println("Su calificacion ha sido: " + (a/s)*100);
    }

    /*public void verificaPregunta(Integer g,Integer i) {
    if (quiz.get(g).getCorrecto(i)) {
    System.out.println("Respuesta correcta");
    this.aciertos++;
    } else {
    System.out.println("incorrecto");
    }
    }*/
    
    public Boolean verificaPregunta(Integer g,Integer i) {
        if (quiz.get(g).getCorrecto(i)) {
            System.out.println("Respuesta correcta");
            this.aciertos++;
            return true;
        } else {
            System.out.println("incorrecto");
            return false;
        }
    }
    
    public int getQuizSize(){
        return quiz.size();
    }

    
    
    public void imprimir(Integer j) {

        System.out.println(quiz.get(j).toString());

    }
}
