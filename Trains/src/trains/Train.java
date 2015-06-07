/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javergarav
 */
public class Train {

    private int id;
    private List<Wagon> wagons;
    private static int WAGONSNUMBER = 3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public void accommodate(Reservation r) {
        ArrayList<Reservation> reservations = new ArrayList<>();
        for (int i = 0; i < WAGONSNUMBER; i++) {
            int availableCapacity = (wagons.get(i).getChairs() - wagons.get(i).getOccupiedChairs());
            int reservationSize = r.getFamily().getMembers().size();
            if (reservationSize <= availableCapacity) {
                if (wagons.get(i).getReservations() != null) {
                    for (int j = 0; j < wagons.get(i).getReservations().size(); j++) {
                        reservations.add(wagons.get(i).getReservations().get(j));
                    }
                } else {
                    reservations.add(r);
                }
                wagons.get(i).setReservations(reservations);
                int newWagonOccupiedChairs = wagons.get(0).getOccupiedChairs() + reservationSize;
                wagons.get(i).setOccupiedChairs(newWagonOccupiedChairs);
                System.out.println("Family with reservation #" + r.getId()
                        + " added to wagon #" + (i + 1)+ ".");
                return;
            }
        }

    }
}
