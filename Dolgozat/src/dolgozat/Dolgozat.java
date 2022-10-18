/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat;

/**
 *
 * @author user3
 */
public class Dolgozat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int[] szamok = new int[] {3, 2, 15, 4, 42, 3};
        
        
        
        //1. feladat
        int paratlanSzam = 0;
        for (i = 0; i < szamok.length; i++) {
            if (szamok[i] % 2 != 0) {
                paratlanSzam++;
            }
        }
        
        //2. Feladat
        int osszeg = 0;
        for (i = 0; i < szamok.length; i++) {
            osszeg = osszeg + szamok[i];
        }
        
        //3. Feladat
        i = 0;
        while (szamok[i] > szamok.length && (szamok[i] > 10 && szamok[i] < 20)) {
            i++;
        }
        if (i > 0) {
            System.out.println("Van 10-20 közötti szám");
        }
        
        //4. Feladat
        int min = szamok[0];
        for (i = 1; i < szamok.length; i++) {
            if (szamok[i] < min) {
                min = szamok[i];
            }
        }
        System.out.println("Páratlan számok: " + paratlanSzam);
        System.out.println("Összes szám: " + osszeg);
        System.out.println("Minimum: " + min);
    }
    
}
