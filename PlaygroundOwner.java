/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * It's a class inherits from class User which stores the info of the user after
 * registration and the user chooses to be a PlaygroundOwner, The
 * PlaygroundOwner can add any of the available playgrounds by using the
 * function addPlayground()
 *
 * @author Mariam and Farah
 */
public class PlaygroundOwner extends Register {

    public Ewallet ewallet;
    
    Scanner scan = new Scanner(System.in);
    
    ArrayList<Playground> playground = new ArrayList<Playground>();

    /**
     * Function the playgroundOwner call it when the user want to add any of the
     * available with entering its info
     *
     * @param pg -Object from class Playground
     */
    public void addPlayground(Playground pg) {
        String name;
        String size;
        String loc;
        String PPH;
        String t;
        int pnum;
        
        System.out.println("Enter plyaground name : ");
        name = scan.nextLine();
        pg.setPgName(name);
        
        System.out.println("Enter plyaground size : ");
        size = scan.nextLine();
        pg.setSize(size);
        
        System.out.println("Enter plyaground location : ");
        loc = scan.nextLine();
        pg.setLocation(loc);
        
        System.out.println("Enter plyaground price per hour : ");
        PPH = scan.nextLine();
        pg.setPricePerHour(PPH);

        System.out.println("Enter plyaground available times : ");
        t = scan.nextLine();
        pg.setAvailableTimes(t);

        System.out.println("Enter plyaground number : ");
        pnum = scan.nextInt();
        pg.setPlaygroundID(pnum);

        System.out.println("Sussessfully added!\n");
        playground.add(pg);
    }

}
