
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This is the main function which responsible for printing the output needed
 * upon any changes are set, contains all the classes and some controlled 
 * scenarios for the user
 *
 * @author Mariam and Farah
 */
public class Main {

    /**
     * User can register and chooses to be either a Player or a playground
     * Owner, If he chooses player he will be able to see all available
     * playgrounds and book any of them, If he chooses playground owner he till
     * now will be able to add any playground with its info ,Some functions may
     * be able to be used in the future!
     *
     * @param args That we will use it to saves the unnecessary wastage of
     * memory
     */
    public static void main(String[] args) {
        ArrayList<Playground> playgrounds = new ArrayList<Playground>();
        ArrayList<Player> players = new ArrayList<Player>();
        
        Scanner scan = new Scanner(System.in);
        
        Playground pg1 = new Playground();
        Playground pg2 = new Playground();
        Playground pg3 = new Playground();
        
        pg1.setPgName("Barcelona");
        pg1.setSize("200m");
        pg1.setLocation("Nasr city");
        pg1.setAvailableTimes("6am -> 12am");
        pg1.setPricePerHour("100 LE");
        pg1.setPlaygroundID(1);
        
        pg2.setPgName("Liverpool");
        pg2.setSize("180m");
        pg2.setLocation("Maadi");
        pg2.setAvailableTimes("6am -> 6pm");
        pg2.setPricePerHour("140 LE");
        pg2.setPlaygroundID(2);
        
        pg3.setPgName("Paris Saint German");
        pg3.setSize("130m");
        pg3.setLocation("October");
        pg3.setAvailableTimes("9am -> 12am");
        pg3.setPricePerHour("150 LE");
        pg3.setPlaygroundID(3);
        playgrounds.add(pg1);
        playgrounds.add(pg2);
        playgrounds.add(pg3);
        
        System.out.println("Welcome to GOFO \n" );
        System.out.println("Do you want to Register? if yes enter 'yes' if no press 'no' ");

        //Variable choice1 checks if user wants to register or not
        String choice1;
        choice1 = scan.nextLine();
        if ("yes".equals(choice1)) {
            Register u1 = new Register();
            String n = "", id = "", ph = "", email = "", pw = "", loc = "";
            System.out.println("Enter your name: ");
            n = scan.nextLine();
            u1.setName(n);
            System.out.println("Enter your national ID: ");
            id = scan.nextLine();
            u1.setID(id);
            System.out.println("Enter your Phone number: ");
            ph = scan.nextLine();
            u1.setPhone(ph);
            System.out.println("Enter your Email: ");
            email = scan.nextLine();
            u1.setEmail(email);
            System.out.println("Enter your Password: ");
            pw = scan.nextLine();
            u1.setPassword(pw);
            System.out.println("Enter your Location: ");
            loc = scan.nextLine();
            u1.setLocation(loc);
            System.out.println("Registration Completed \n");
        }
        while (true) {
            // variable choice2 checks what the user wants to be after registration
            String choice2 = "";
            System.out.println("choose what you want to be \n1-Player\n2-Playground Owner");
            choice2 = scan.nextLine();
            if ("1".equals(choice2)) { //chooses player
                Player p1 = new Player();
                players.add(p1);
                p1.getAvailablePG(playgrounds);
                while (true) {
                    System.out.println("Do you want to book any playground ?\nIf yes enter 'yes' if no press 'no' ");
                    // variable book checks the player wants to book a playground or not
                    String book = "";
                    book = scan.nextLine();
                    int index = 0;
                    if ("yes".equals(book)) {
                        p1.requestBooking(playgrounds);
                        int x = 0;
                        for (int i = 0; i < players.size(); i++) {
                            if (p1.getID().equals(players.get(i).getID())) {
                                x = i;
                            }
                        }
                        index = x;
                        players.get(index).playerbookings.add(p1.book);
                        
                    } else { 
                        System.out.println("Thank you, GoodBye!\n");
                        break;
                    }
                }
                break;
            } else if ("2".equals(choice2)) { //chooses playground owner
                PlaygroundOwner po1 = new PlaygroundOwner();
                while (true) {
                    System.out.println("Do you want to add any playground ?\n If yes enter 'yes' if no press 'no' ");
                    // variable add checks the playground owner wants to add any playground or not
                    String add = " ";
                    add = scan.nextLine();
                    if ("yes".equals(add)) {
                        Playground pg4 = new Playground();
                        po1.addPlayground(pg4);
                        playgrounds.add(pg4);
                    } else { //when playground owner press n
                        System.out.println("Thank you for registration!\n");
                        break;
                    }
                }
                break;
            } else { // if he enters numbers neither 1 nor 2
                System.out.println("Please enter either 1 or 2 !!\n");
            }
        }
    }
}
