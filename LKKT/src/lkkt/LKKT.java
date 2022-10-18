/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kérjünk be 2 pozitív egész számot
        Scanner szam_bekero = new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív egész számot: ");
        int elso_szam = szam_bekero.nextInt();
        System.out.print("Adjon meg még egy pozitív egész számot: ");
        int masodik_szam = szam_bekero.nextInt();
        //Számoljuk ki a legkisebb közös többszörösüket
        int nagyobbSzam = Math.max(elso_szam, masodik_szam);
        int kisebbSzam = Math.min(elso_szam, masodik_szam);
        int lkt = nagyobbSzam;
        while ( lkt % kisebbSzam != 0) {
            lkt += nagyobbSzam;
        }
        System.out.println("A két megadott szám legkisebb közös többszöröse: " + lkt);
    }
}