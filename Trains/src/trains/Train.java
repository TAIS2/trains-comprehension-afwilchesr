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

    //While whithout nesting
    public void accommodate(Reservation reservation) {
        ArrayList<Reservation> reservations = new ArrayList<>();
        int i = 0;
        while (i < WAGONSNUMBER) {
            int availableCapacity = (wagons.get(i).getChairs() - wagons.get(i).getOccupiedChairs());
            int reservationSize = reservation.getFamily().getMembers().size();
            if (reservationSize > availableCapacity) {
                i++;
                continue;
            }
            if (wagons.get(i).getReservations() != null) {
                for (int j = 0; j < wagons.get(i).getReservations().size(); j++) {
                    reservations.add(wagons.get(i).getReservations().get(j));
                }
                reservations.add(reservation);
            } else {
                reservations.add(reservation);
            }
            wagons.get(i).setReservations(reservations);
            int newWagonOccupiedChairs = wagons.get(i).getOccupiedChairs() + reservationSize;
            wagons.get(i).setOccupiedChairs(newWagonOccupiedChairs);
            System.out.println("Family with reservation #" + reservation.getId()
                    + " added to wagon #" + (i + 1) + ".");
            i++;
            return;
        }
    }
// do while whithout nesting

    public void accommodate1(Reservation reservation) {
        ArrayList<Reservation> reservations = new ArrayList<>();
        int i = 0;
        do {
            if (reservation.getFamily().getMembers().size()
                    > (wagons.get(i).getChairs() - wagons.get(i).getOccupiedChairs())) {
                i++;
                continue;
            }
            if (wagons.get(i).getReservations() != null) {
                for (int j = 0; j < wagons.get(i).getReservations().size(); j++) {
                    reservations.add(wagons.get(i).getReservations().get(j));
                }
                reservations.add(reservation);
            } else {
                reservations.add(reservation);
            }
            wagons.get(i).setReservations(reservations);
            int newWagonOccupiedChairs = wagons.get(i).getOccupiedChairs()
                    + reservation.getFamily().getMembers().size();
            wagons.get(i).setOccupiedChairs(newWagonOccupiedChairs);
            System.out.println("Family with reservation #" + reservation.getId()
                    + " added to wagon #" + (i + 1) + ".");
            i++;
            return;
        } while (i < WAGONSNUMBER);
    }

    //While whith nesting
    public void accommodate2(Reservation reservation) {
        ArrayList<Reservation> reservations = new ArrayList<>();
        int i = 0;
        while (i < WAGONSNUMBER) {
            int availableCapacity = (wagons.get(i).getChairs() - wagons.get(i).getOccupiedChairs());
            int reservationSize = reservation.getFamily().getMembers().size();
            if (reservationSize <= availableCapacity) {
                if (wagons.get(i).getReservations() != null) {
                    for (int j = 0; j < wagons.get(i).getReservations().size(); j++) {
                        reservations.add(wagons.get(i).getReservations().get(j));
                    }
                    reservations.add(reservation);
                } else {
                    reservations.add(reservation);
                }
                wagons.get(i).setReservations(reservations);
                int newWagonOccupiedChairs = wagons.get(i).getOccupiedChairs() + reservationSize;
                wagons.get(i).setOccupiedChairs(newWagonOccupiedChairs);
                System.out.println("Family with reservation #" + reservation.getId()
                        + " added to wagon #" + (i + 1) + ".");
                return;
            }
            i++;
        }
    }

    //do while whith nesting
    public void accommodate3(Reservation reservation) {
        ArrayList<Reservation> reservations = new ArrayList<>();
        int i = 0;
        do {
            if (reservation.getFamily().getMembers().size()
                    <= (wagons.get(i).getChairs() - wagons.get(i).getOccupiedChairs())) {
                if (wagons.get(i).getReservations() != null) {
                    for (int j = 0; j < wagons.get(i).getReservations().size(); j++) {
                        reservations.add(wagons.get(i).getReservations().get(j));
                    }
                    reservations.add(reservation);
                } else {
                    reservations.add(reservation);
                }
                wagons.get(i).setReservations(reservations);
                int newWagonOccupiedChairs = wagons.get(i).getOccupiedChairs()
                        + reservation.getFamily().getMembers().size();
                wagons.get(i).setOccupiedChairs(newWagonOccupiedChairs);
                System.out.println("Family with reservation #" + reservation.getId()
                        + " added to wagon #" + (i + 1) + ".");
                return;
            }
            i++;
        } while (i < WAGONSNUMBER);
    }
}
