/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author user3
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //egyágú elágazás
        int szam = 25;
        if (szam > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam * 2);
        }
        
        
        //kétágú elágazás
        int szam2 = 25;
        if (szam2 > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam2 * 2);
        }
        else {
            System.out.println("Nem nagyobb");
        }
        
        //háromagú eset
        int szam3 = 20;
        if (szam3 > 20) {
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája: " + szam3 * 2);
        }
        else if (szam < 20) {
                System.out.println("Kisebb");
        }
        else {
            System.out.println("Egyenlő");
        }
        
        
        //Sokágú eset
        int honap = 5;
        switch( honap) {
            case 1: System.out.println("Január"); break;
            case 2: System.out.println("Február"); break;
            case 3: System.out.println("Március"); break;
            case 4: System.out.println("Április"); break;
            case 5: System.out.println("Május"); break;
            case 6: System.out.println("Június"); break;
            case 7: System.out.println("Július"); break;
            case 8: System.out.println("Augusztus"); break;
            case 9: System.out.println("Szeptember"); break;
            case 10: System.out.println("Október"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            
            default: System.out.println("Nem meghatározható");

            
        }
        
        //random generáltassunk egy karaktert!
        //a és z között
        int Randomkarakter = (int) (Math.random()* 26) +97;
        System.out.println("A random karaktered: " + (char)Randomkarakter);
        
        //Deklaráljunk 
        
        
    }
    }
