/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem2;

/**
 *
 * @author jonat
 */
public class Rental {
    public final static int MIN_HOUR=60;
    public final static int HOUR_RATE =40;
    private String conract_n;
    private int num_hours;
    private int num_min;
    private double price;
    
    public Rental(int num_mins, String con_n){
        setHoursAndMinutes(num_mins);
        setContractNumber(con_n);
    }
    
    public Rental(){
        setHoursAndMinutes(0);
        setContractNumber("A000");
    }
    
    public void setContractNumber(String c_n){
        this.conract_n=c_n;
    }
    
    public void setHoursAndMinutes(int mins){
        this.num_hours = mins/MIN_HOUR;
        this.num_min = mins%MIN_HOUR;
        this.price = this.num_hours*40+num_min*1;
    }

    public String getConract_n() {
        return conract_n;
    }

    public int getNum_hours() {
        return num_hours;
    }

    public int getNum_min() {
        return num_min;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Rental{" + "conract_n=" + conract_n + ", num_hours=" + num_hours + ", num_min=" + num_min + ", price=" + price + '}';
    }
}
