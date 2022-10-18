/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Egész számok
        byte homerseklet = 19;
        short magassag = 165;
        int fizetes = 850000;
        long nyeremeny = 2500000000L;
        //Valós számok
        float tomeg = 44333.5698762F;
        double ezEgyValosSzam = 22555447778.013134235;
        //Karakter
        char egyBetu = 'k';
        char masikBetu = '\u0041'; //a karakter unicodde kódja hexadecimálisan
        //logikai
        boolean vane = false;
        
        //változók értékeinek kiiratása
        System.out.println("A hőmérséklet Celsius fokban:" + homerseklet);
        System.out.println("A magasság centiméterben:" + magassag);
        System.out.println("A bruttó havi fizetés forintban:" + fizetes);
        System.out.println("A nyeremény összege forintban:" + nyeremeny);
        System.out.println("Tömeg grammban:" + tomeg);
        System.out.println("Valós szám:" + ezEgyValosSzam);
        System.out.println("Egy betű:" + egyBetu);
        System.out.println("Másik betű:" + masikBetu);
        System.out.println((int)masikBetu);
        System.out.println("Igaz vagy hamis:" + vane);
        
        //adattípusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        System.out.println("A byte adattípus tartománya " + byteAlja + " értéktől " + byteTeteje + " értékig terjed.");
        System.out.println("A short adattípus tartománya " + Short.MIN_VALUE + " értéktől " + Short.MAX_VALUE + " értékig terjed.");
        System.out.println("Az int adattípus tartománya " + Integer.MIN_VALUE + " értéktől " + Integer.MAX_VALUE + " értékig terjed.");
        System.out.println("A long adattípus tartománya" + Long.MIN_VALUE + " értéktől " + Long.MAX_VALUE + " értékig terjed.");
        System.out.println("A float adattípus tartománya " + Float.MIN_VALUE + " értéktől " + Float.MAX_VALUE + " értékig terjed.");
        System.out.println("A double adattípus tartománya " + Double.MIN_VALUE + " értéktől " + Double.MAX_VALUE + " értékig terjed.");
    }
}
