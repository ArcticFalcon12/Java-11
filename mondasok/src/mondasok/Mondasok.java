/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mondasok;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author gicziattila
 */
public class Mondasok {
    public static boolean vanE(ArrayList<String> pontok) {
        for (int i = 0; i<pontok.size(); i++) {
             if(pontok.get(i).contains("a")) {
                 return false;
        }
    }
        return true;
    }

    public static int countE(ArrayList<String> pontok) {
        int eBetu = 0;
        for(String s : pontok) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'e') {
                    eBetu++;
                }
            }
        }
        return eBetu;
    }
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> points = new ArrayList<>();
        try {
            raf = new RandomAccessFile("mondasok.txt", "r");
            int db = 0;
            sor = raf.readLine();
            while ( sor != null) {
                points.add(sor);
                db++;
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i<points.size(); i++) {
            System.out.println(points.get(i));
        }
        System.out.println("--------------- Feladatok -----------------");
        //Hányadik elem a leghosszabb és mennyi karakter
        int hossz = 0;
        int sorSzam = 0;
        for (int i = 0; i<points.size(); i++) {
            if (points.get(i).length() > hossz) {
                hossz = points.get(i).length();
                sorSzam++;
        }
        }
        System.out.println("A leghosszabb sor a következő: " + sorSzam + " ami " + hossz + " karakter hosszú");
        //Van e olyan elem amiben nincsen a betű
        System.out.println(vanE(points));
        //Számold meg az e betűket
        System.out.println(countE(points));
        }
    }
