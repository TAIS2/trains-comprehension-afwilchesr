package trains;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javergarav
 */
public class Trip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // People
        
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        
        person1.setId(1);
        person2.setId(2);
        person3.setId(3);
        person4.setId(4);
        person5.setId(5);
        person6.setId(6);
        
        person1.setName("Name1");
        person2.setName("Name2");
        person3.setName("Name3");
        person4.setName("Name4");
        person5.setName("Name5");
        person6.setName("Name6");
        
        // Family
        
        List<Person> membersFamily1 = new ArrayList<Person>();
        
        membersFamily1.add(person1);
        membersFamily1.add(person2);
        membersFamily1.add(person3);
        membersFamily1.add(person4);
        membersFamily1.add(person5);
        membersFamily1.add(person6);
        
        Family family1 = new Family();     
        family1.setId(1);
        family1.setMembers(membersFamily1);
        
        //Wagons
        
        Wagon wagon1 = new Wagon();
        Wagon wagon2 = new Wagon();
        Wagon wagon3 = new Wagon();
        
        wagon1.setId(1);
        wagon1.setChairs(20);
        wagon1.setOccupiedChairs(15);
        
        wagon2.setId(2);
        wagon2.setChairs(20);
        wagon2.setOccupiedChairs(18);
        
        wagon3.setId(3);
        wagon3.setChairs(20);
        wagon3.setOccupiedChairs(0);
        
        // Train
        
        List<Wagon> wagons = new ArrayList<Wagon>();
        wagons.add(wagon1);
        wagons.add(wagon2);
        wagons.add(wagon3);
        Train train = new Train();    
        train.setWagons(wagons);
        
        // Reservation
        
        Reservation reservation = new Reservation();
        
        reservation.setId(1);
        reservation.setCost(300000);
        reservation.setDate("25-06-2015");
        reservation.setFamily(family1);
        train.accommodate(reservation);
        
        System.out.println(family1.getMembers().get(0).getName()
                           + " is a member of the family " + family1.getId()
                           + " with the reservation " + reservation.getId()
                           + " and date " + reservation.getDate());
        
        
    }
    
}
