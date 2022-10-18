/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

/**
 *
 * @author user3
 */
public class StringMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy szöveg!";
        String szoveg2 = "Ez egy másik szöveg!";        
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //Adott pozíción lévő karakter
        System.out.println(szoveg.charAt(3));
        
        //Kisbetűs lesz az összes karakter
        System.out.println(szoveg.toLowerCase());
        
        //Nagybetűs lesz az összes karakter
        System.out.println(szoveg.toUpperCase());
        
        //Felesleges szóköz levágása
        System.out.println(szoveg.trim());
        
        //Összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy szöveg!"));
        System.out.println(szoveg.compareToIgnoreCase("ez egy szöveg!"));
        System.out.println(szoveg.equals(szoveg2));
        
        //összefűzés
        System.out.println(szoveg.concat(szoveg2));
        
        //Tartalmazza e    
        System.out.println(szoveg.contains("Ez"));
        
        //Végződik-e 
        System.out.println(szoveg.endsWith("!"));
        
        //Kezdődik-e
        System.out.println(szoveg.startsWith("sd"));
    }
}
