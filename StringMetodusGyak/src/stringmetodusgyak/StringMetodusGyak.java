/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusgyak;

/**
 *
 * @author user3
 */
public class StringMetodusGyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "A Diak osztály objektuma ( Vad Alma ) példányosítás útján jön létre";
        int zarojel1 = szoveg.indexOf("(");
        int zarojel2 = szoveg.indexOf(")");
        String szovegEgyben = szoveg.substring(zarojel1 + 1, zarojel2);
        String nev = szovegEgyben.toUpperCase();
        System.out.println(nev);
        //Irasd ki a Vad Alma hosszát
        System.out.println(nev.trim().length());
        //Cseréljük ki az alma szót körtére;
        String korte = nev.replace("ALMA", "KÖRTE");
        System.out.println(korte);
        //Vad Alma kapjon iskolai email címet
        String nev2 = nev.concat("KÖRTE");
        String email = nev2.trim().replace(" ", ".").toLowerCase().concat(".2022i@bankitatabanya.hu");
        System.out.println(email);
        
        
        
        //Ellenőrzés
        String szovegEllenorzes = "Sok lúd disznót győz";
        String masikszoveg = "Sok Bákszi nem öl";
        //1. Feladat
        System.out.println(szovegEllenorzes.length());
        //2. Feladat
        System.out.println(szovegEllenorzes.charAt(0));
        //3. Feladat
        System.out.println(szovegEllenorzes.equals(masikszoveg));
        //4. Feladat
        System.out.println(szovegEllenorzes.contains("lúd"));
        //5. Feladat
        System.out.println(szovegEllenorzes.indexOf("lúd"));
        //6. Feladat
        System.out.println(szovegEllenorzes.replace("lúd", "veréb"));
        //7. Feladat
        int szokoz = szovegEllenorzes.indexOf(" ");
        String szovegSzokoz = szovegEllenorzes.substring(szokoz);
        System.out.println(szovegSzokoz);
    }
    
}
