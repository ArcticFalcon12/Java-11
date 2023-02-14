/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas_10.pkg02;

import java.util.ArrayList;
import java.util.Collections;

public class Gyakorlas_1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. feladat
        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(12);
        szamok.add(56);
        szamok.add(89);
        szamok.add(67);
        szamok.add(78);
        Collections.sort(szamok);
        System.out.println(szamok.get(szamok.size()-2));
        //2. feladat
        ArrayList<Integer> szamokEgyenloE = new ArrayList<>();
        szamokEgyenloE.add(12);
        szamokEgyenloE.add(56);
        szamokEgyenloE.add(89);
        szamokEgyenloE.add(67);
        szamokEgyenloE.add(78);
        Collections.sort(szamok);
        if (szamok.get(0) == szamokEgyenloE.get(0) && 
            szamok.get(1) == szamokEgyenloE.get(1) &&
            szamok.get(2) == szamokEgyenloE.get(2) &&
            szamok.get(3) == szamokEgyenloE.get(3) &&
            szamok.get(4) == szamokEgyenloE.get(4)){
            System.out.println("True");
        }
        else {
          System.out.println("False");
        }
    }
}
