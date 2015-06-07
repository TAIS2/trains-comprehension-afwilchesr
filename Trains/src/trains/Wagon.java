/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;

import java.util.List;

/**
 *
 * @author javergarav
 */
public class Wagon {
    
    private int id;
    private int chairs;
    private int occupiedChairs;
    private List<Reservation> reservations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getOccupiedChairs() {
        return occupiedChairs;
    }

    public void setOccupiedChairs(int occupiedChairs) {
        this.occupiedChairs = occupiedChairs;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
}
