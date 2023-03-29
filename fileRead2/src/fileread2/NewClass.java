/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author gicziattila
 */
public class NewClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        Integer[] szamok = new Integer[5];
        try {
            raf = new RandomAccessFile("adat2.txt", "r");
            int db = Integer.parseInt(raf.readLine());
            for(int x = 0; x < db; x++) {
                sor = raf.readLine();
                szamok[x] = Integer.parseInt(sor);
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i<szamok.length; i++) {
            System.out.println(szamok[i]);
        }
}
}