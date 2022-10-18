/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Karakter
        Scanner bale = new Scanner(System.in);
        System.out.println("Adjon meg egy szöveget: ");
        String userName = bale.nextLine();
        System.out.println("String: " + userName);
        
        //Adat beolvasás billentyűzetről - egész szám
        System.out.print("Adj meg egész számot: ");
        int szam;
        szam = bale.nextInt();
        System.out.println(szam);

        //Valós szám
        System.out.print("Adjon meg egy valós számot: ");
        float szam2;
        szam2 = bale.nextFloat();
        System.out.println(szam2);
        
        //random szám generálás
        //(Math.random() * intervallum_méreteÖ + alsó -> Általános sintax;
        int Randomszam = (int) (Math.random() * 21); //0-20 közötti szám
        System.out.println(Randomszam);
        
        // -55 és 15 között
        int Randomszam2 = (int) (Math.random()* 71) -55;
        System.out.println("-55 és 15 között: " + Randomszam2);
        
        // -40 és 5 között
        int Randomszam3 = (int) (Math.random()* 46) -40;
        System.out.println("-40 és 15 között: " + Randomszam3);
        
        // 60 és 105 között
        int Randomszam4 = (int) (Math.random()* 46) +60;
        System.out.println("60 és 105 között: " + Randomszam4);
       
        // -45 és -20 között
        int Randomszam5 = (int) (Math.random()* 26) -45;
        System.out.println("-45 és -20 között: " + Randomszam5  );
    }
    
    
}
