/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblem1;

/**
 *
 * @author jonat
 */
public class Event {
    public final int PRICE_PER_GUEST =35;
    public final int CUTOFF = 50;
    public String event_number;
    private int n_guests;
    private double price;

    public Event(){
        setEventNumber("A000");
        setNGuests(0);
    }
    
    public Event(String event_n, int n_guests){
        setEventNumber(event_n);
        setNGuests(n_guests);
    }
    
    
    public void setEventNumber(String event_number) {
        this.event_number = event_number;
    }

    public void setNGuests(int n_guests) {
        this.n_guests = n_guests;
        this.price = this.n_guests*this.PRICE_PER_GUEST;
    }

    public String getEventNumber() {
        return event_number;
    }

    public int getNGuests() {
        return n_guests;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Event{" + "event_number=" + event_number + ", n_guests=" + n_guests + ", price=" + price + '}';
    }
}
