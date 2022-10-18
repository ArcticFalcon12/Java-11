/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matematikai műveletek
            //két operandusú
            int a = 43;
            int b = 35;
            
            int osszeg = a + b;
            int kivonas = a - b;
            int szorzas = a * b;
            float osztas = (float)a / (float)b;
            int maradek = a % b; // az a/b osztas MARADÉKÁNAK 
            System.out.println(osszeg);
            System.out.println(kivonas);
            System.out.println(szorzas);
            System.out.println(osztas);
            System.out.println(maradek);
            
            //Egy operandusú
            int c = 5;
            c++; //c értékének növelése 1-gyel postfix formában
            System.out.println(c); //c értéke 6
            System.out.println(c++); //c értéke 6 majd növeli 1-gyel -> 7
            System.out.println(c);
            System.out.println(++c); //c értéke 8 lesz ezt iratjuk ki
            
            int d = 3;
            d--; //2
            System.out.println(--d); //1
            
            //relációs műveletek
            int x = 9;
            int y = 14;
            
            System.out.println(x > y); //false
            System.out.println(x < y); //true
            System.out.println(x >= y); //false
            System.out.println(x <= y); //true
            System.out.println(x == y); //false
            System.out.println(x != y); //true
            System.out.println("------------");
            //logikai műveletek
                boolean  t = true;
                boolean f = false;
                
                System.out.println(t && f); //ÉS művelet
                System.out.println(t || f); //VAGY művelet
                System.out.println(!t); //negáció (tagadás) művelet
                
                //Értékadó műveletek
                    int k;
                    
                    k = 3;
                    k = k + 1;
                    k += 1; //összevontuk a műveleteket
                    System.out.println(k);
                    k -= 1;
                    System.out.println(k);
                    k *= 2;
                    System.out.println(k);
                    k /= 4;
                    System.out.println(k);
                    k %= 2;
                    System.out.println(k);
                    
                //Összetett műveletek
                    int z = 12;
                    System.out.println("Összetett műveletek ------------------");
                    System.out.println((z % 3 == 0) && (z % 4 == 0)); //true
                    
                    
                    System.out.println((z % 3 == 0) || (z % 4 == 0));
                    
                    System.out.println(!(z % 3 == 0) && (z % 5 == 0));
                    
                    System.out.println((z % 5 == 0) && !(z < 0));
    }
    
}
