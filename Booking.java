/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class is responsible for all the booking process about which player 
 * booked and which playground is booked and the time slot the player entered 
 * to book
 *
 * @author Mariam and Farah
 */
public class Booking {

    private String playerID;
    private int playgroundID;
    private String timeSlot;
    private Player player;

    /**
     * Empty constructor
     */
    public Booking() {

    }

    /**
     * This function set the three attributes (player ID , playground unique
     * number , time slot)
     *
     * @param p -Refers to player ID
     * @param pg -Refers to playground unique number
     * @param ts -Refers to time slot the user need
     */
    public void booking(String p, int pg, String ts) {
        playerID = p;
        playgroundID = pg;
        timeSlot = ts;
    }

    /**
     * Function to set the time slot entered
     *
     * @param ts Time slot the user need
     */
    public void setTimeSlot(String ts) {
        timeSlot = ts;
    }

    /**
     * Function to set the time slot needed
     *
     * @return -Returns time slot the user entered
     */
    public String getTimeSlot() {
        return timeSlot;
    }
}
