/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixfeladatok;

import java.util.Random;

public class MatrixFeladatok {
    public static void fillMatrix(int[][] szamok) {
        int i;
        int j;
        Random randomSzam=new Random();
        for (i=0;i<4;i++) {
            for (j=0;j<5;j++) {
              szamok[i][j]=randomSzam.nextInt(10) + 1;
            }
        }
    }
    public static void writeMatrix(int[][] szamok) {
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                System.out.print(szamok[i][j]+"\t");
            }
            System.out.print("\n");
        }
     }
    public static void reverse(int[][] szamok) {
        int sorokSzama = szamok.length;
        int oszlopokSzama = szamok[0].length;
        for(int i = sorokSzama-1; i >= 0; i--) {
            for(int j = oszlopokSzama-1; j >= 0; j--) {
                System.out.print(szamok[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static int sumNumbers(int[][] szamok) {
        int osszeg = 0;
        int sorokSzama = szamok.length;
        for (int i = 0; i < sorokSzama; i++) {
            for (int j = 0; j<szamok[1].length; j++) {
                osszeg += szamok[i][j];
            }
        }
        return osszeg;
    }
    public static boolean halfEvenNumbers(int[][] szamok) {
        float osszesParosSzam = 0;
        int sorokSzama = szamok.length;
        int oszlopokSzama = szamok[0].length;
        for (int i = 0; i<sorokSzama;i++) {
            for(int j=0; j<oszlopokSzama;j++) {
                if (szamok[i][j] % 2 == 0)
                    osszesParosSzam++;
                }
            }
   return osszesParosSzam > ((sorokSzama * oszlopokSzama) / 2);
}
    public static void doubleNumbers(int[][] szamok) {
    int sorokSzama = szamok.length;
    for (int i = 0; i < sorokSzama; i++) {
        for (int j = 0; j<szamok[0].length; j++) {
            szamok[i][j] = szamok[i][j] * 2;
        }
    }
    }
    public static void main(String[] args) {
        System.out.println("----------Eredeti Mátrix-----------");
        int[][] numbers = new int[4][5];
        fillMatrix(numbers);
        writeMatrix(numbers);
        //Visszafelé kiírás
        System.out.println("-------Megfordított mátrix---------");
        reverse(numbers);
        //Visszaadja a mátrix elemeinek összegét
        System.out.println("");
        System.out.println("-----------Elemek összege---------------");
        System.out.println(sumNumbers(numbers));
        //Eldönti, hogy több mint a fele páros szám-e
        System.out.println("");
        System.out.println("----------Páros Számok------------");
        System.out.println(halfEvenNumbers(numbers));
        //Megduplazza a matrix minden elemet
        System.out.println("");
        System.out.println("----------Duplázás-------------");
        doubleNumbers(numbers);
        writeMatrix(numbers);
}
}