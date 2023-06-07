/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gicziattilafileread2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author gicziattila
 */
public class GicziAttilaFileRead2 {

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
        //Kiveszem a számokat az array listből és összeadom őket egy változóba
        int sumPoints = 0;
        for (int i = 3; i<points.size(); i++) {
             sumPoints += Integer.parseInt(points.get(i));
        }
        System.out.println(sumPoints);
        //Kiveszem az első sort és berakom a név változóba
        String nev = points.get(0);
        System.out.println(nev);
        //Kiveszem a születési évét és levágom róla az elejét
        String birth = points.get(1);
        String[] birthSplit = birth.split(" ");
        String birthdate = birthSplit[1];
        int birthdateInt = Integer.parseInt(birthdate);
        System.out.println(birthdateInt);
        
        
        
        try {
            raf = new RandomAccessFile("pointsout.txt", "rw");
            raf.writeBytes(nev + " (" + birthdateInt + "): " + sumPoints + " pont");
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
    }
    
}
