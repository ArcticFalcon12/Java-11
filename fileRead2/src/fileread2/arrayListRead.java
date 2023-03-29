/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileread2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author gicziattila
 */
public class arrayListRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
       ArrayList<Integer> szamok = new ArrayList<>();
        try {
            raf = new RandomAccessFile("adat1.txt", "r");
            int db = 0;
            sor = raf.readLine();
            while ( sor != null) {
                szamok.add(Integer.parseInt(sor));
                db++;
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i<szamok.size(); i++) {
            System.out.println(szamok.get(i));
        }
}
}
