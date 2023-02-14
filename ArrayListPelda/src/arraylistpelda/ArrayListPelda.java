/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpelda;

import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class ArrayListPelda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> szamok = new ArrayList<>();
        //Hozzáadom a számot(kat)
        int max = 20;
        int min = 10;
        int i;
        for (i=0; i < 10; i++) {
            szamok.add(Math.floor(Math.random()*(max-min+1)+min));
        }
        //Kiiratom mennyi szám van benne
        System.out.println(szamok.size());
        System.out.println(szamok);
        //szamok.get()
        //Számoljuk meg hány páros szám van
        int parosSzam = 0;
        for (i = 0; i < szamok.size(); i++) {
            if (szamok.get(i) % 2 == 0) {
                parosSzam++;
            }
        }
        System.out.println("A random generált számok között " + parosSzam + " páros szám található");
    }
}
