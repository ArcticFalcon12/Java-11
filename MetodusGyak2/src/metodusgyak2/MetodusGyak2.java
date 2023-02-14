/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak2;

/**
 *
 * @author user3
 */
public class MetodusGyak2 {
    public static boolean szamjegyEllenorzo(int szam) {
        String szamok = Integer.toString(szam);
        String[] szamokKulon = szamok.split("");
        int elsoSzam = Integer.parseInt(szamokKulon[0]);
        int masodikSzam = Integer.parseInt(szamokKulon[1]);
        return (elsoSzam % 2 == 0 && masodikSzam % 2 == 0);
    }
    public static boolean szamKozeppont(int szamEgy, int szamKetto, int szamHarom) {
        int kozepsoSzam = 0;
        int elolSzam = Math.min(Math.min(szamEgy, szamKetto), szamHarom);
        int hatulSzam = Math.max(Math.max(szamEgy, szamKetto), szamHarom);
        if (elolSzam != szamEgy && hatulSzam != szamEgy) {
            kozepsoSzam = szamEgy;
        }
        else if (elolSzam != szamKetto && hatulSzam != szamKetto) {
           kozepsoSzam = szamKetto;
        }
        else {
            kozepsoSzam = szamHarom;
        }
        return (kozepsoSzam - elolSzam == hatulSzam - kozepsoSzam);
    }
    public static void matrix(int szam) {
        for(int i = 0; i < szam; i++) {
            for(int j = 0; j < szam; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int egeszSzam = 94;
        System.out.println(szamjegyEllenorzo(egeszSzam));
        int elsoSzam = 2;
        int masodikSzam = 5;
        int harmadikSzam = 8;
        System.out.println(szamKozeppont(elsoSzam, masodikSzam, harmadikSzam));
        int randomSzamN = 5;
        matrix(randomSzamN);
    }
   
    
}
