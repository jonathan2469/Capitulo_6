    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author jonat
 */
public class Pregunta {
    private String pregunta;
    private Inciso[] incisos;
    private Integer i;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.incisos = new Inciso[4];
        this.i=0;
    }

    public void setInciso(String inciso, Boolean correcto) {
        if (i < 4) {
            this.incisos[i] = new Inciso(inciso, correcto);
        }
        i++;
    }
    
    public Boolean getCorrecto(Integer inciso){
        return incisos[inciso].getStatus();
    }
    
    @Override
    public String toString(){
        return String.format("%s\n [0] %s\n [1] %s\n [2] %s\n [3] %s\n", pregunta, incisos[0].getTexto(),incisos[1].getTexto(),incisos[2].getTexto(),incisos[3].getTexto()); 
    }
}
