/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem1;
import java.util.Scanner;
        
/**
 *
 * @author jonat
 */
public class EventDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        
        Event ev1 = new Event();
        System.out.println("Introduzca el Numero de evento");
        String event = leer.nextLine();
        
        int n = 0;
        
        do {
            System.out.println("Introduzca el numero de invitados");
            n = leer.nextInt();
            if ((n>=5)&&(n<=100)) {
                break;
            }
        } while (true);
        
        
        Event ev2 = new Event(event, n);
        
        for (int i = 0; i < ev2.getNGuests(); i++) {
            System.out.println("Please come to my event");
        }
        
        System.out.println(ev1+"\n"+ev2);
        
    }
}
