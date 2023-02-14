/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyakorlas_12.pkg09;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class MetodusGyakorlas_1209 {
    public static int befektetes(int szam, int evEgy){
        int i;
        for (i=0; i<evEgy; i++){
            szam = (int) (szam*1.1);
            
        }
        return szam;
    }
    public static void main(String[] args) {
        Scanner penz = new Scanner(System.in);
        System.out.println("Megadott fix kamat: 10%");
        System.out.println("Megadott fix év: 5");
        System.out.println("Adja meg a befektettni való értéket: ");
        int ev = 5;
        int money = penz.nextInt();
        System.out.println("A befektetett pénzből a megadott kamattal, és futamidővel ennyi: " + befektetes(money, ev) + " forintot tudna keresni.");
    }
    
}
