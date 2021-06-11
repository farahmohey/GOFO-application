
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class is essential as it stores the data of any playground on the system
 * and is a reference any time needed to access these data containing an
 * arrayList with all booked playgrounds and print the available for the player
 * if needed
 *
 * @author Mariam and Farah
 */
public class Playground {

    private String playgroundName, size, location, pricePerHour, availableTimes;
    private boolean activated;
    private int playgroundID;
    private PlaygroundOwner owner;

    ArrayList<Booking> bookedPlaygrounds = new ArrayList<Booking>();

    /**
     * It's an empty constructor to initialize the attributes ( pgName, size,
     * location, pricePerHour, availableTimes)
     */
    Playground() {

        playgroundName = "";
        size = "";
        location = "";
        pricePerHour = "";
        activated = true;
        playgroundID = 0;
        owner = new PlaygroundOwner();
    }

    /**
     * It sets the name of the playground
     *
     * @param n -Refers to Playground name
     */
    public void setPgName(String n) {
        playgroundName = n;
    }

    /**
     * It sets the size of the playground
     *
     * @param sz -Refers to Playground size
     */
    public void setSize(String sz) {
        size = sz;
    }

    /**
     * It sets the location of the playground
     *
     * @param loc -Refers to Playground location
     */
    public void setLocation(String loc) {
        location = loc;
    }

    /**
     * It sets the price per hour of the playground
     *
     * @param pph -Refers to Playground price per hour
     */
    public void setPricePerHour(String pph) {
        pricePerHour = pph;
    }

    /**
     * It sets the available times of the playground
     *
     * @param at -Refers to Playground available times
     */
    public void setAvailableTimes(String at) {
        availableTimes = at;
    }

    /**
     * It sets the unique number of the playground
     *
     * @param num -Refers to Playground ID
     */
    public void setPlaygroundID(int num) {
        playgroundID = num;
    }

    /**
     * It sets the owner of the playground
     *
     * @param ow -Refers to Playground owner
     */
    public void setOwner(PlaygroundOwner ow) {
        owner = ow;
    }

    /**
     * Function to return the playground name
     *
     * @return -Playground Name
     */
    public String getPgName() {
        return playgroundName;
    }

    /**
     * Function to return the playground size
     *
     * @return -Playground Size
     */
    public String getSize() {
        return size;
    }

    /**
     * Function to return the playground location
     *
     * @return -Playground Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Function to return the playground price per hour
     *
     * @return -Playground PricePerHour
     */
    public String getPricePerHour() {
        return pricePerHour;
    }

    /**
     * Function to return the playground unique number
     *
     * @return -Playground ID
     */
    public int getPlaygroundID() {
        return playgroundID;
    }

    /**
     * Function to return the playground available times
     *
     * @return -Playground Available Times
     */
    public String getAvailableTimes() {
        return availableTimes;
    }

    /**
     * Function to return the playground owner
     *
     * @return -Playground Owner
     */
    public PlaygroundOwner getOwner() {
        return owner;
    }

    /**
     * Function to check if the playground is activated or not
     *
     * @param active Activated or not activated!
     */
    public void checkActivation(boolean active) {
        activated = active;
    }
}
