/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileread2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 *
 * @author gicziattila
 */
public class matrixBeolvasas {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int[][] numbers = new int[5][4];
        try {
            raf = new RandomAccessFile("adat3.txt", "r");
            int i = 0;
            sor = raf.readLine();
            while (sor != null) {
                String[] noSpace = sor.split(" ");
                for (int j = 0; j < 4; j++) {
                    numbers[i][j] = Integer.parseInt(noSpace[j]);
                }
                i++;
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(" ");
}
    }
}
