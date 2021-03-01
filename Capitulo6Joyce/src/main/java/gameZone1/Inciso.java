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
public class Inciso {
    private String Texto;
    private Boolean Status;

    public Inciso(String Texto, Boolean Status) {
        this.Texto = Texto;
        this.Status = Status;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public Boolean getStatus() {
        return Status;
    }

}
