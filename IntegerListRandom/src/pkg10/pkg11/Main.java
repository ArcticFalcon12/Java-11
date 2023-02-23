/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hozz létre egy 10 elemű integer tömböt, generáld le random elemeit (1-10)
        List<Integer> szamok = new ArrayList();
        int minVal = 0;
        int maxVal = 10;
        for (int i = 0; i < 10; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(minVal, maxVal);
            szamok.add(randInt);
        }
        System.out.println(szamok);
        //Összegezd az elemeit
        int sum = 0;
        for (int i = 0; i < szamok.size(); i++) {
            sum += szamok.get(i);
        }
        System.out.println("A számok összege: " + sum);
        //Számláld meg a páros számokat
        int parosSzamok = 0;
        for (int i = 0; i < szamok.size(); i++) {
            if (szamok.get(i) % 2 == 0) {
                parosSzamok++;
            }
        }
        System.out.println("A generált számok között ennyi páros szám van: " + parosSzamok);
        //Mekkora a legkisebb
        int legkisebb = szamok.get(0);
        for (int i = 0; i < szamok.size(); i++) {
           if (szamok.get(i) < legkisebb) {
               legkisebb = szamok.get(i);
           }
        }
        System.out.println("A legkisebb szám: " + legkisebb);
        //Mekkora a legnagyobb
        int legnagyobb = szamok.get(0);
        for (int i = 0; i < szamok.size(); i++) {
           if (szamok.get(i) > legnagyobb) {
               legnagyobb = szamok.get(i);
           }
        }
        System.out.println("A legnagyobb szám: " + legnagyobb);
        //Hányadik eleme a listának az első 5-nél kisebb szám
        int i = 0;
        while (szamok.get(i) > 5) {
            i++;
        } 
        System.out.println("Az első szám indexe ami kisebb 5-nél: " + i);
        //Van-e a számok között 4-gyel
        i = 0;
        while (i < szamok.size() && (szamok.get(i) % 4 != 0) ) {
            i++;
    }
        if (i < szamok.size()){
             System.out.println("Van a számok között 4-el osztható");
        }
        else {
            System.out.println("A számok között nincs 4-el oszhtató");
        }
}
}
