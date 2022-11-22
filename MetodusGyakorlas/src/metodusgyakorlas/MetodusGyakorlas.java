/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyakorlas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author user3
 */
public class MetodusGyakorlas {
    public static double smallestNumber(int szamEgy, int szamKetto, int szamHarom) {
        int legkisebbSzam;
        legkisebbSzam = Math.min(szamEgy, szamKetto);
        if (legkisebbSzam < szamHarom) {
            return legkisebbSzam;
        }
            return szamHarom;
    }
    public static void middleCharacter(String mondat) {
        int length = mondat.trim().length();
        int middleIndex = length / 2;
        char kozepsoKarakter = mondat.charAt(middleIndex);
        if (length % 2 == 0) {
            char middleCharacterMinusOne = mondat.charAt(middleIndex - 1);
            System.out.println("Mivel a megadott szó páros így 2 betű van középen: " + middleCharacterMinusOne + kozepsoKarakter);
        }
        else {
            System.out.println("A megadott szó középső karaktere: " + kozepsoKarakter);
        }
    }
    public static int charactersNumber(String masodikMondat) {
        int i;
        int szamok = 0;
        String kisMondat = masodikMondat.toLowerCase();
        for (i=0; i < masodikMondat.length(); i++) {
            if (kisMondat.charAt(i) == 'a' || kisMondat.charAt(i) == 'e' || kisMondat.charAt(i) == 'i' || kisMondat.charAt(i) == 'o' || kisMondat.charAt(i) == 'u') {
                szamok++;
            }
        }
        return szamok;
    }
    public static int wordNumbers(String harmadikMondat) {
        return harmadikMondat.split("\\s+").length;
    }
    public static void isPassword(String jelszo) {
        if (jelszo.length() >= 10) { 
            System.out.println("Ez megfelel");
        }
        else {
            System.out.println("Ez a jelszó nem felel meg");
        }
    }
    public static boolean isHigher(int elso, int masodik, int harmadik) {
        if (elso < masodik && masodik < harmadik) {
            return true;
        }
        return false;
    }
    public static int sumNumbers(int szam) {
        String szamok = Integer.toString(szam);
        String[] szamokTomb = szamok.split("");
        int elsoSzam = Integer.parseInt(szamokTomb[0]);
        int masodikSzam = Integer.parseInt(szamokTomb[1]);
        return elsoSzam + masodikSzam;   
    }
    public static String charactersBetween(String elsoKarakter, String masodikKarakter) {
        String valami = "Nincs";
        return valami;
    }
    public static void main(String[] args) {
        Scanner bekero = new Scanner(System.in);
        System.out.println("Adja meg az első számot: ");
        int elsoSzam = bekero.nextInt();
        System.out.println("Adja meg a második számot: ");
        int masodikSzam = bekero.nextInt();
        System.out.println("Adja meg az utolsó számot: ");
        int harmadikSzam = bekero.nextInt();
        bekero.nextLine();
        System.out.println("A megadott számok közül a legkisebb: " + smallestNumber(elsoSzam, masodikSzam, harmadikSzam));
        //--------------- 2. Feladat -----------------
        System.out.println("Adja meg a szót: ");
        String sentence = bekero.nextLine();
        middleCharacter(sentence);
        //---------------- 3. Feladat ---------------
        System.out.println("Adja meg még egy szót: ");
        String secondSentence = bekero.nextLine();
        System.out.println("A megadott stringben az angol magánhangzók száma: " + charactersNumber(secondSentence));
        //---------------- 4. Feladat ---------------
        System.out.println("Adjon meg egy mondatot: ");
        String thirdSentence = bekero.nextLine();
        System.out.println("A megadott mondatban lévő szavak száma: " + wordNumbers(thirdSentence));
        //--------------- 5. Feladat ----------------
        System.out.println("Adja meg a jelszavát: ");
        String password = bekero.nextLine();
        isPassword(password);
        //-------------- 6. Feladat -------------
        System.out.println("Adja meg az első számot: ");
        int firstNumber = bekero.nextInt();
        System.out.println("Adja meg a második számot: ");
        int secondNumber = bekero.nextInt();
        System.out.println("Adja meg az utolsó számot: ");
        int thirdNumber = bekero.nextInt();
        System.out.println("A megadott számok növekvő sorrendben vannak-e? " + isHigher(firstNumber, secondNumber, thirdNumber));
        //--------------- 7. Feladat --------------
        System.out.println("Adjon meg egy legalább 9-nél nagyobb számot: ");
        int number = bekero.nextInt();
        System.out.println("A megadott szám összege: " + sumNumbers(number));
        //--------------- 8. Feladat --------------
        System.out.println("Adja meg az első karaktert: ");
        String firstCharacter = bekero.nextLine();
        System.out.println("Adja meg a második karakter: ");
        String secondCharacter = bekero.nextLine();
    }
    
}
