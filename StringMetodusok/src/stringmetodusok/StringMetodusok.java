/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class StringMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy szöveg!";
        String szoveg2 = "Ez egy másik szöveg!";        
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //Adott pozíción lévő karakter
        System.out.println(szoveg.charAt(3));
        
        //Kisbetűs lesz az összes karakter
        System.out.println(szoveg.toLowerCase());
        
        //Nagybetűs lesz az összes karakter
        System.out.println(szoveg.toUpperCase());
        
        //Felesleges szóköz levágása
        System.out.println(szoveg.trim());
        
        //Összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy szöveg!"));
        System.out.println(szoveg.compareToIgnoreCase("ez egy szöveg!"));
        System.out.println(szoveg.equals(szoveg2));
        
        //összefűzés
        System.out.println(szoveg.concat(szoveg2));
        
        //Tartalmazza e    
        System.out.println(szoveg.contains("Ez"));
        
        //Végződik-e 
        System.out.println(szoveg.endsWith("!"));
        
        //Kezdődik-e
        System.out.println(szoveg.startsWith("sd"));
        
        //Keresett karakter(ek) pozíciója
        System.out.println(szoveg.indexOf("sz"));
        
        //Utolsó keresett karakter
        System.out.println(szoveg.lastIndexOf("g"));
        
        //Az adott string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        
        //Cserélje ki a-t -> b-re
        System.out.println(szoveg.replace("szöveg", "játék"));
        System.out.println(szoveg.replace("e", "a"));
        
        //Lecseréli a szövegben az első karaktert
        System.out.println(szoveg.replaceFirst("e", "a"));
        
        //String szétszedése tömbbe megadott karakterek mentén
        //System.out.println(szoveg.split(" "));
        
        //Nem string típusú adat string-é alakítása
        Integer szam = 512;
        System.out.println(szam.toString());
        
        //Stringből substrin kivétele
        System.out.println(szoveg.substring(3, 6));
        
        
        //Feladatok:
        System.out.println("Feladatok");
        //Kérjük be egy diák teljes nevét a FullName változóba
        Scanner nev = new Scanner(System.in);
        System.out.print("Adja meg a teljes nevét: ");
        String FullName = nev.nextLine();
        //Szedjük szét a nevet egy FirstName és Lastname változókba
        String[] Name = FullName.split(" ");
        String FirstName = Name[1];
        String LastName = Name[0];
        System.out.println(FirstName);
        System.out.println(LastName);
        //Kérjük be az osztály azonsítóját a classId változóba
        System.out.print("Adja meg az osztály azonosítóját: ");
        String classId = nev.nextLine();
        //Ha a betűjele e-vel kezdődik alakítsuk E-re
        if (classId.charAt(4) == 'e') {
            classId = classId.replaceFirst("e", "E");
        }
        //Ha az évfolyam száma 2022-nél kisebb, akkor az osztályazonosító minden betűje legyen nagy
        String classIdEv = classId.substring(0, 3);
        int classIdEvInt = Integer.parseInt(classIdEv);
        System.out.println("Vezetékneve: " + LastName);
        System.out.println("Keresztneve: " + FirstName);
        String classIdNagy = classId.toUpperCase();
        if (classIdEvInt < 2022) {
            classId = classIdNagy;
            System.out.println("Osztályazonosítója: " + classIdNagy);
        }
        else {
            System.out.println("Osztályazonosítója: " + classId);
        }
        //Ha az osztály mindkét betűjele nagybetűs írjuk ki hogy esti osztály
        char elso = classId.charAt(4);
        char masodik = classId.charAt(5);
        if (Character.isUpperCase(elso) && Character.isUpperCase(masodik)) {
            System.out.println("Esti osztály");
        }
        else {
            System.out.println("Nappali osztály");
        }
        }
    }