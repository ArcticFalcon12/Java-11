/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gicziattila;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class GicziAttila {
    //1. feladat
    public static boolean emailCimE(String email) {
        return email.contains("@");
    }
    public static void main(String[] args) {
        //1. feladat
        Scanner email = new Scanner(System.in);
        System.out.println("Adja meg az email címét: ");
        String emailCim = email.nextLine();
        while (emailCimE(emailCim) != true) {
            System.out.println("Nem jó formátum, adja meg újra: ");
            emailCim = email.nextLine();
        }
        System.out.println("Email cím elfogadva!");
        //2. feladat
        ArrayList<Integer> szamok = new ArrayList<>();
        int max = 20;
        int min = 10;
        int i;
        for (i=0; i < 5; i++) {
            szamok.add((int) (Math.random() * (max-min+1) + min));
        }
        int szamnagyobb = 0;
        for (i=0; i < szamok.size()-1; i++) {
            if (szamok.get(i+1) > szamok.get(i)) {
                szamnagyobb++;
            }
        }
        System.out.println(szamok);
        System.out.println("A random számokkal feltöltött listában ennyi: " + szamnagyobb + " szám van amit egy nagyobb szám követ!");
        if (szamnagyobb == 4) {
             System.out.println("A random számokkal feltöltött listában a számok növekvő sorrendben vannak!");
        }
        else {
            System.out.println("A random számokkal feltöltött listában a számok nincsenek növekvő sorrendben!");
        }
    }     
    
}
