/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileread03.pkg29;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author gicziattila
 */
public class FileRead0329 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> cars = new ArrayList<>();
        try {
            raf = new RandomAccessFile("cars.txt", "r");
            int db = 0;
            sor = raf.readLine();
            while ( sor != null) {
                cars.add(sor);
                db++;
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        
        
        
        try {
            raf = new RandomAccessFile("carsout.txt", "rw");
            for (String s: cars){
                if (s.startsWith("F")){
                    raf.writeBytes(s+"\n");
                }
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
}
}