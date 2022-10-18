/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombok;

/**
 *
 * @author user3
 */
public class Tombok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Integer tömb deklarálása
        int[] szamok =new int[4];
        
        //Értékadás
        szamok[0] = 11;
        szamok[1] = 56; //Stb
        System.out.println(szamok[1]);
        
        //Tömb deklarálása értékadással együtt
        int[] jegyek = new int[] {3,2,5,4,4,3};
        System.out.println(jegyek[3]);
        
        //Tömb bejárása
        int i;
        for (i = 0; i < jegyek.length; i++) {
            System.out.println("------------------");
            System.out.println(jegyek[i]);
        }
        
        //String tömb deklarálása
        String[] nevek = new String[3];
        nevek[0] = "Marky Bale";
        System.out.println(nevek[0]);
        
        //String deklarálása
        String nevem;
        //String értékadás
        nevem = "Flakon";
        System.out.println(nevem.charAt(0));
        
    }
    
}
