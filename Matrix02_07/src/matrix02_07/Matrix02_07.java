/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix02_07;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Matrix02_07 {
    public static void fillMatrix(int[][] szamok) {
        int i;
        int j;
        Random randomSzam=new Random();
        for (i=0;i<5;i++) {
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
    public static int sumNum(int[][] szamok) {
        int osszeg = 0;
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                if (i==j) {
                  osszeg += szamok[i][j];
                }
            } 
        }
        return osszeg;
    }
    public static void swapCustomNums(int[][] szamok, int i1, int j1, int i2, int j2) {
        int k = szamok[i1][j1];
        szamok[i1][j1] = szamok[i2][j2];
        szamok[i2][j2] = k;
    }
    public static boolean equalsMatrix(int[][] szamokNew1, int[][] szamokNew2) {
         for(int i=0;i<szamokNew1.length;i++) {
            for(int j=0;j<szamokNew1[0].length;j++) {
                if (szamokNew1[i][j] != szamokNew2[i][j]) {
                    return false;
                }
            }
         }
         return true;
    }
    public static int[][] reverseMatrix(int[][] szamok, int[][] numbers2) {
        for(int i = szamok.length-1; i >= 0; i--) {
            for(int j = szamok[0].length-1; j >= 0; j--) {
                    numbers2[i][j] = szamok[szamok.length-1-i][szamok.length-1-j];
                }
            }
    return numbers2;
  }
    public static void main(String[] args) {
        System.out.println("----------Eredeti Mátrix-----------");
        int[][] numbers = new int[5][5];
        fillMatrix(numbers);
        writeMatrix(numbers);
        System.out.println("----------Mátrix Főátlójának összege--------");
        System.out.println(sumNum(numbers));
        System.out.println("------------Reverse----------");
        int[][] szamok2 = new int[5][5];
        writeMatrix(reverseMatrix(numbers, szamok2));
        System.out.println("----------Felcserélt számok----------------");
        swapCustomNums(numbers, 0, 0, 4, 4);
        writeMatrix(numbers);
        System.out.println("-------Egyenlő e----------");
        int[][] szamokUj1 = {{2,9,7}, {1,0,3}};
        int[][] szamokUj2 = {{2,9,7}, {1,0,3}};
        System.out.println("A két megadott mátrix egyenlő-e: " + equalsMatrix(szamokUj1, szamokUj2));
 
    }
}
