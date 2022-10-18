/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst;

/**
 *
 * @author Attila Giczi
 */
public class MyFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("szevasz");
        
        //Deklaráció
        int szam = 15;
        System.out.print("A megadott érték: ");
        System.out.println(szam);
        System.out.println("A megadott érték:" + szam);
        
        double magassag = 1.78;
        System.out.println("Magasságom méterben:" + magassag);
        System.out.println("Magasságom centiméterben:" + magassag*100);
    }
    
}