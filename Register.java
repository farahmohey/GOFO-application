/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class is responsible for registration as it take from the user all his 
 * information and stores it until the system needs it
 *
 * @author Mariam and Farah
 */
public class Register {

    private String name, ID, password, phone, email,  location;

    /**
     * It is a constructor that initialize the attributes (name, ID, password, phone, email, location)
     *  
     */
    Register() {
        name = "";
        ID = "";
        password = "";
        phone = "";
        email = "";
        location = "";
    }

    /**
     * It sets the name of the User
     *
     * @param n -Refers to the User's name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * It sets the national id of the User
     *
     * @param id -Refers to User's NationalID
     */
    public void setID(String id) {
        ID = id;
    }

    /**
     * It sets the phone of the User
     *
     * @param ph -Refers to User's Phone
     */
    public void setPhone(String ph) {
        phone = ph;
    }

    /**
     * It sets the email of the User
     *
     * @param mail -Refers to User's E-mail
     */
    public void setEmail(String mail) {
        email = mail;
    }

    /**
     * It sets the password of the User
     *
     * @param pw -Refers to User's Password
     */
    public void setPassword(String pw) {
        password = pw;
    }

    /**
     * It sets the location of the U ser
     *
     * @param loc -Refers to User's Location
     */
    public void setLocation(String loc) {
        location = loc;
    }

    /**
     * Function to return the user's name
     *
     * @return -User's Name
     */
    public String getName() {
        return name;
    }

    /**
     * Function to return the user's national id
     *
     * @return -User's NationalID
     */
    public String getID() {
        return ID;
    }

    /**
     * Function to return the user's Phone
     *
     * @return -User's Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Function to return the user's email
     *
     * @return -User's E-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Function to return the user's password
     *
     * @return -User's Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Function to return the user's location
     *
     * @return -User's Location
     */
    public String getLocation() {
        return location;
    }
}
