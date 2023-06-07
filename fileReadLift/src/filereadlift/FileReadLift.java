/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereadlift;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author gicziattila
 */
public class FileReadLift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int [][] igenyek = new int [100] [6];
        ArrayList<Integer[]> lift = new ArrayList<Integer[]>();
        try {
            raf = new RandomAccessFile("igeny.txt", "r");
            int elsosor = Integer.parseInt(raf.readLine());
            int masodiksor = Integer.parseInt(raf.readLine());
            int harmadiksor = Integer.parseInt(raf.readLine());
            sor = raf.readLine();
            while ( sor != null) {
                String[] feldarabol = sor.split(" ");
                Integer[] szamok = new Integer[6];
                for (int i = 0; i<6; i++) {
                    szamok[i]= Integer.parseInt(feldarabol[i]);
                }
                lift.add(szamok);
                sor = raf.readLine();
            }
            for (int i = 0; i < lift.size(); i++) {
                System.out.println(Arrays.toString(lift.get(i)));
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
    } 
}
