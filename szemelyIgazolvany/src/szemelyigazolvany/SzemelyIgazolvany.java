/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szemelyigazolvany;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class SzemelyIgazolvany {
    public static boolean szemelyiEllenorzo(String szSzam) {
        if (szSzam.length() > 8 || szSzam.length() < 8){
           return false;
       }
        //Karakterekké alakítás
       char elso = szSzam.charAt(0);
       char masodik = szSzam.charAt(1);
       char harmadik = szSzam.charAt(2);
       char negyedik = szSzam.charAt(3);
       char otodik = szSzam.charAt(4);
       char hatodik = szSzam.charAt(5);
       char hetedik = szSzam.charAt(6);
       char nyolcadik = szSzam.charAt(7);
       //Karakterek megvizsgálása
       return Character.isLetterOrDigit(elso) && Character.isLetterOrDigit(masodik) && Character.isDigit(harmadik) && Character.isDigit(negyedik) && Character.isDigit(otodik) && Character.isDigit(hatodik) && Character.isLetterOrDigit(hetedik) || Character.isLetterOrDigit(Character.toLowerCase(hetedik)) && Character.isLetterOrDigit(nyolcadik); 
       }
    public static void main(String[] args) {
        Scanner bekero = new Scanner(System.in);
        String szemelyiSzam;
        do {
            System.out.println("Adja meg a személyi igazolványának számát: ");
            szemelyiSzam = bekero.nextLine();
        }while(!szemelyiEllenorzo(szemelyiSzam));
    }
        
}