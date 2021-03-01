/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;
import gameZone3.Die;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jonat
 */


public class PigDiceGame {
    private Die dado1;
    private Die dado2;
    private Integer j;
    public Boolean j_e;
    private Integer c;
    public Boolean c_e;
    private final Integer GANA = 100;
    Scanner leer = new Scanner(System.in);
    Random rnd = new Random();

    public PigDiceGame() {
        this.dado1 = new Die();
        this.dado2 = new Die();
        this.j = 0;
        this.c = 0;
        this.j_e = true;
        this.c_e = false;
    }

    public void juego() {
        do {
            System.out.println("");
            marcador();
            if (this.j_e) {
                juega_j();
            } else if (this.c_e) {
                juega_c();
            }
            
            if (this.j >= 100) {
                System.out.println("Gano el jugador");
                break;
            } else if(this.c >= 100){
                System.out.println("Ganó la máquina");
                break;
                
            }
            
        } while (true);

    }

    public void marcador() {
        System.out.println("Jugador: " + this.j);
        System.out.println("Computadora: " + this.c);
    }

    public void juega_j() {
        this.dado1.Lanzar();
        this.dado2.Lanzar();

        if ((dado1.getNumero() != 1) && (dado2.getNumero() != 1)) {
            this.j += dado1.getNumero() + dado2.getNumero();
            System.out.println("Desea seguir jugando o pasa turno? (y/n)");
            String resp = leer.nextLine();
            if (resp == "y") {
                this.j_e = true;
                this.c_e = false;
            } else {
                this.j_e = false;
                this.c_e = true;
            }
        } else if ((dado1.getNumero() == 1) && (dado2.getNumero() == 1)) {
            this.j = 0;
            this.j_e = false;
            this.c_e = true;
        } else if ((dado1.getNumero() == 1) || (dado2.getNumero() == 1)) {
            this.j_e = false;
            this.c_e = true;
        } else {
            this.j_e = false;
            this.c_e = true;
        }
    }

    public void juega_c() {
        this.dado1.Lanzar();
        this.dado2.Lanzar();

        if ((dado1.getNumero() != 1) && (dado2.getNumero() != 1)) {
            this.c += dado1.getNumero() + dado2.getNumero();
            int decision = rnd.nextInt(1);
            System.out.println("gasda" + decision);
            if (decision >= 0.5) {
                this.c_e = true;
                this.j_e = false;
            } else {
                this.c_e = false;
                this.j_e = true;
            }
        } else if ((dado1.getNumero() == 1) && (dado2.getNumero() == 1)) {
            this.c = 0;
            this.c_e = false;
            this.j_e = true;
        } else if ((dado1.getNumero() == 1) || (dado2.getNumero() == 1)) {
            this.c_e = false;
            this.j_e = true;
        } else {
            this.c_e = false;
            this.j_e = true;
        }
    }
}
