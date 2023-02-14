/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karaktermetodusok;

/**
 *
 * @author user3
 */
public class KarakterMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char kar = 'a';
        //A metódus true-val tér vissza ha a alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));
        //A metódus true-val tér vissza ha szám
        System.out.println(Character.isDigit(kar));
        //Ha betű
        System.out.println(Character.isLetter(kar));
        //Betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        //Kisbetűs-e
        System.out.println(Character.isLowerCase(kar));
        //Nagybetűs-e
        System.out.println(Character.isUpperCase(kar));
        //Szókőz-e?
        System.out.println(Character.isSpaceChar(kar));
        //Whitespace karakter-e?
        System.out.println(Character.isWhitespace(kar));
        //Kisbetű / Nagybetűvé alakítás (toUpperCase)
        System.out.println(Character.toLowerCase(kar));
        
    }
    
}
