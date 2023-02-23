/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg07;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner szamok = new Scanner(System.in);
        //int beolvasottSzam;
        //do {
            //System.out.println("A szám kisebb mint 0 vagy nem osztható 2-vel.");
            //System.out.println("Adjon meg nullánál nagyobb páros számot: ");
            //beolvasottSzam = szamok.nextInt();
        //} while (!(beolvasottSzam > 0 && beolvasottSzam % 2 == 0));
        
        //while (beolvasottSzam < 0 || beolvasottSzam % 2 != 0) {
            //System.out.println("A szám kisebb mint 0 vagy nem osztható 2-vel.");
            //System.out.println("Adjon meg nullánál nagyobb páros számot: ");
            //beolvasottSzam = szamok.nextInt();
            
            
            
            
       //Feladat: Gondoltam egy számot: 0-10, találja ki
       Scanner szam_kitalalo = new Scanner(System.in);
       int randomszam = (int) (Math.random()* 11);
       System.out.println(randomszam);
        System.out.print("Találja ki melyik számra gondoltam (1-10 között): ");
        int beolvasottSzam = szam_kitalalo.nextInt();
        while (beolvasottSzam != randomszam) {
            System.out.println("Nem erre gondoltam");
            System.out.println("Egy kis segítség:");
            if (randomszam > 5) {
                System.out.print("A gondolt szám nagyobb vagy egyenlő 5-el");
            }
            else {
                System.out.println("A gondolt szám kisebb vagy egyenlő 5-el");
            }
            System.out.println("Most próbáld újra:");
            beolvasottSzam = szam_kitalalo.nextInt();
        }
    }
}
