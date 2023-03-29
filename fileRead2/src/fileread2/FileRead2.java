/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileread2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author gicziattila
 */
public class FileRead2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        Integer[] szamok = new Integer[6];
        try {
            raf = new RandomAccessFile("adat1.txt", "r");
            int db = 0;
            sor = raf.readLine();
            while ( sor != null) {
                szamok[db] = Integer.parseInt(sor);
                db++;
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i<szamok.length; i++) {
            System.out.println(szamok[i]);
        }
        int szamokOsszeadva = 0;
        for (int y = 0; y<szamok.length; y++) {
            szamokOsszeadva += szamok[y];
}
        System.out.println("Számok összeadva");
        System.out.println(szamokOsszeadva);
}
}
