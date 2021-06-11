
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * It's a class inherits from class User which stores the info of the user after
 * registration and the user chooses to be a Player, The player can see all
 * available playgrounds by using the function getAvailablePG() and book any of
 * them if he wants by using the function requestBooking()
 *
 *
 * @author Mariam and Farah
 */
public class Player extends Register {

    private Ewallet ewallet;
    /**
     * Making an object of the class booking to can access some functions from
     * there
     */
    public Booking book = new Booking();
    
    /**
     * Making an object of the class Playground to can access some functions and
     * attributes from there
     */
    public Playground playground;
    
    ArrayList<Booking> playerbookings = new ArrayList<Booking>();

    /**
     * Function the player call it when the user want to see all the available
     * playgrounds he can book!
     *
     * @param playgrounds -ArrayList of all playgrounds on the system
     */
    public void getAvailablePG(ArrayList<Playground> playgrounds) {
        System.out.println("All available playgrounds\n");
        for (int i = 0; i < playgrounds.size(); i++) {
            System.out.println("playground's number " + (i + 1));
            System.out.println("playground's name : " + playgrounds.get(i).getPgName());
            System.out.println("playground's location : " + playgrounds.get(i).getLocation());
            System.out.println("playground's available time : " + playgrounds.get(i).getAvailableTimes());
            System.out.println("playground's price per hour : " + playgrounds.get(i).getPricePerHour());
            System.out.println("\n");
        }
    }

    /**
     * Function the player call it when the user want to book any of the
     * available playgrounds that printed from the function getAvailablePG()
     *
     * @param playgrounds -ArrayList of all playgrounds on the system
     */
    public void requestBooking(ArrayList<Playground> playgrounds) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter playground number : ");
        num = scan.nextInt();
        int length = playgrounds.size();
        for (int i = 0; i < length; i++) {
            if (num == playgrounds.get(i).getPlaygroundID()) {
                String ts;
                System.out.println("Enter time slot you want to book : ");
                ts = scan.next();
                book.setTimeSlot(ts);
                book.booking(super.getName(), num, ts);
                System.out.println("successfully Booked! \n");
            }
        }
    }
}
