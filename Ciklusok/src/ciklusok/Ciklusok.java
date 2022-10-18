/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciklusok;

/**
 *
 * @author user3
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        //Növekményes ciklus (FOR)
        for (i = 0; i <5; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        //Visszafele irassuk ki
        for (i = 4; i > -1; i--) {
            System.out.println(i);
        }
        System.out.println("--------------");
        //Előre felé de 2-esével lépjen
        for (i = 0; i < 5; i+=2) {
            System.out.println(i);
        }
        System.out.println("---------------");
        
        
        
        //Előtesztelő ciklus
        int szam = 0;
        while (szam < 5){
            System.out.println(szam);
            szam++;
            
        }
        System.out.println("----------------");
        //Feladat: generáljunk 1-20 között egy páros számot
        int parosSzam = 1;
        while (parosSzam % 2 != 0) {
            int parosSzam = (int) (Math.random()* )
            System.out.println(parosSzam);
        }
    }
    
}
