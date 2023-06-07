/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gicziattilafileread;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author gicziattila
 */
public class GicziAttilaFileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                RandomAccessFile raf;
        String sor;
        ArrayList<String> points = new ArrayList<>();
        try {
            raf = new RandomAccessFile("versenyzo.txt", "r");
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
        }
}
