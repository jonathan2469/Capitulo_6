/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem2;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el numero de contracto");
        String n = leer.nextLine();
        
        int m = 0;
        do {
            System.out.println("Introduzca el numero de minutos");
            m = leer.nextInt();
            if ((m>=60)||(m<=7200)) {
                break;
            }
        } while (true);       
        
        Rental r1 = new Rental(m, n);
        Rental r2 = new Rental();
        
        for (int i = 0; i < r1.getNum_hours(); i++) {
            System.out.println("Coupon good for 10 percent off nextal rental");
        }
        
        System.out.println(r1+"\n"+r2);
        
    }
}
