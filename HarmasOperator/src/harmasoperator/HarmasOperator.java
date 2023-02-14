/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmasoperator;

import java.util.Scanner;
public class HarmasOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 10;
        String decide;
        if (num < 20) {
            decide = "kisebb";
        }
        else {
            decide = "nagyobb";
        }
        System.out.println(decide);
        
        
        //Rövidített változat
        decide = (num < 20)? "kisebb" : "nagyobb";
        System.out.println(decide);
        
        
        
        Scanner szo = new Scanner(System.in);
        System.out.println("Adjon meg egy karaktert: ");
        char karakter = szo.next().charAt(0);
        if (Character.isUpperCase(karakter)) {
            System.out.println("A(z) " + karakter + " nagybetűs.");
        }
        else {
            System.out.println("A(z) " + karakter + " kisbetűs.");
        }
        
        //Egyszerűsített
        System.out.println("A(z)" + karakter + ((Character.isUpperCase(karakter))? " nagybetűs":" kisbetűs" + "."));
        
        
        //Switch
        System.out.println("Adja meg egy hónap sorszámát: ");
        int szam = szo.nextInt();
        int year = 2020;
        int days;
        switch(szam) {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
               days = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 29:28;
                   break;
            default:
                days = 0;
                break;
        }
        System.out.println(days);
    }
    
}
