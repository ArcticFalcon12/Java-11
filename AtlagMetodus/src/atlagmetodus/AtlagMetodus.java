/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atlagmetodus;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class AtlagMetodus {
    //1. Feladat
    public static double atlagKiszamolo(double elsoSzam, double masodikSzam) {
        double atlag = (elsoSzam + masodikSzam) / 2.0;
        return atlag;
    }
    //2. Feladat
    public static void fejlecKiiratas() {
        System.out.println("*******************");
        System.out.println("*     Feladat     *");
        System.out.println("*******************");
    }
    //3. Feladat
    public static int randomSzam(int egyikSzam, int masikSzam) {
        if (egyikSzam == masikSzam) {
            System.out.println("A két szám egyenlő így nem lehet random számot generálni");
        }
        else {
            int alsoSzam;
            int felsoSzam;
            if (egyikSzam < masikSzam) {
                alsoSzam = egyikSzam;
                felsoSzam = masikSzam;
            }
            else {
                alsoSzam = masikSzam;
                felsoSzam = egyikSzam;
            }
            int randomSzam = (int) (Math.random() * (felsoSzam - alsoSzam) + 1) +alsoSzam;
            return randomSzam;
        }
        return 0;
    }
    public static void main(String[] args) {
        //Bekérem a 2 számot a felhasználótól
        Scanner bekero = new Scanner(System.in);
        System.out.println("Adja meg az első számát: ");
        int szam1 = bekero.nextInt();
        System.out.println("Adja meg a második számát: ");
        int szam2 = bekero.nextInt();
        System.out.println("A két megadott szám átlaga: " + atlagKiszamolo(szam1, szam2));
        //2. Feladat
        fejlecKiiratas();
        //3. Feladat
        System.out.println("Adja meg a tartomány alsó határát: ");
        int tartomanyAlso = bekero.nextInt();
        System.out.println("Adja meg a tartomány felső határát: ");
        int tartomanyFelso = bekero.nextInt();
        System.out.println("A random generált szám a megadott tartomány között: " + randomSzam(tartomanyAlso, tartomanyFelso));
    }
}
