/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szigetek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user3
 */
public class Szigetek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Integer> szamok = new ArrayList<>(Arrays.asList(0, 0, 200, 548, 20, 0, 0, 0, 310, 980, 1280, 650, 200, 0 ,0, 45, 0 ,21, 65, 0, 0));
    //Hány sziget van
    int i;
    int szigetek = 0;
    for (i=0;i<szamok.size()-1;i++) {
        if (szamok.get(i) == 0 && szamok.get(i+1) != 0) {
            szigetek++;
        }
    }
    System.out.println("Ennyi sziget van: " + szigetek);
    //Legmagasabb pont
    System.out.println("A sziget legmagasabb pontja: " + Collections.max(szamok));
    //Legmeredekebb emelkedő
    int kivonas = 0;
    for (i=0;i<szamok.size()-1;i++) {
        kivonas = Math.abs(szamok.get(i)-szamok.get(i+1));
        if (szamok.get(i) != 0 && szamok.get(i) > szamok.get(i-1)) {
                System.out.println("");
        }
    }  
    //Völgy
    int a = 1;
    while(a < szamok.size()-1 && !(szamok.get(a) == 0 && szamok.get(a+1) == 0 && szamok.get(a) > szamok.get(a+1) && szamok.get(a+2) > szamok.get(a+1))) {
        a++;
    }
    if (a < szamok.size()) {
        System.out.println("A szigeteknél van völgy");
    }
    }
}
