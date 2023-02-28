/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolgozatgyakorlas_02.pkg28;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author gicziattila
 */
public class DolgozatGyakorlas_0228 {
    public static void fillMatrix(int[][] szamok) {
        int i;
        int j;
        Random randomSzam=new Random();
        for (i=0;i<5;i++) {
            for (j=0;j<5;j++) {
              szamok[i][j]=randomSzam.nextInt(5) + 65;
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
    public static void writeMatrixFloat(float[][] szamok) {
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                System.out.print(szamok[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void rowMax(int[][] szamok) {
        int i, j;
        int sorszam = 0;
        for(i=0; i<szamok.length; i++){
            int maxSzam= 0;
            sorszam++;
            for(j=0; j<szamok[0].length; j++) {
                if (maxSzam < szamok[i][j]) {
                    maxSzam = szamok[i][j];
                }
            }
            System.out.println("A(z)" + sorszam + " sorban a legnagyobb szám: " + maxSzam);
        }
    }
    public static void columnMin(int[][] szamok) {
        int i, j;
        int oszlopSzam = 0;
        for(j=0; j<szamok[0].length; j++){
            int minSzam= 71;
            oszlopSzam++;
            for(i=0; i<szamok.length; i++) {
                if (szamok[i][j] < minSzam) {
                    minSzam = szamok[i][j];
                }
            }
            System.out.println("A(z)" + oszlopSzam + " oszlopban a legkisebb szám: " + minSzam);
        }
    }
    public static int[][] sumMatrixs(int[][] szamok, int[][] szamok2, int[][] szamok3) {
        int i, j;
        for (i=0; i<szamok.length;i++) {
            for (j=0; j<szamok[0].length; j++) {
                        szamok3[i][j] = szamok[i][j] + szamok2[i][j];
                    }
                }
        return szamok3;
            }
    public static float[][] hanyadMatrix(int[][] szamok, int[][] szamok2, float[][] szamok3) {
        int i, j;
        for (i=0; i<szamok.length;i++) {
            for (j=0; j<szamok[0].length; j++) {
                        szamok3[i][j] = (float)szamok[i][j] / (float)szamok2[i][j];
                    }
                }
        return szamok3;
            }
    public static boolean matrixEgyenlo(int[][] szamok) {
        int i, j;
        for (i=0; i<szamok.length-1;i++) {
            for (j=0; j<szamok[0].length; j++) {
                if (szamok[i][j] == szamok[i+1][j]) {
                            return true;
                    }
                }
            }
        return false;
    }
    public static int[] matrixVanE(int[][] szamok) {
        int[] statisztika =new int[256];
        for (int i=0;i<szamok.length;i++) {
            for (int j=0; j<szamok[0].length; j++) {
                int item = szamok[i][j];
                statisztika[item]++;
        }
        }
        return statisztika;
    }
    public static void main(String[] args) {
        System.out.println("----------Eredeti Mátrix-----------");
        int[][] numbers = new int[5][5];
        fillMatrix(numbers);
        writeMatrix(numbers);
        System.out.println("--------Oszloponkénti a legnagyobb szám--------");
        rowMax(numbers);
        System.out.println("---------Soronként a legkisebb szám---------");
        columnMin(numbers);
        System.out.println("------Másik mátrix-------");
        int[][] numbers2 = new int[5][5];
        fillMatrix(numbers2);
        writeMatrix(numbers2);
        int[][] numbers3 = new int[5][5];
        System.out.println("------ Két mátrix összege------");
        writeMatrix(sumMatrixs(numbers, numbers2, numbers3));
        System.out.println("------- Két mátrix hányadosa----------");
        float[][] numbers4 = new float[5][5];
        writeMatrixFloat(hanyadMatrix(numbers, numbers2, numbers4));
        System.out.println("---------Vannak e egyenlő számok a két mátrixban------");
        System.out.println(matrixEgyenlo(numbers));
        System.out.println("----- Statisztika-----");
        int[] statisztikaEredmeny = matrixVanE(numbers);
        for (int i=65; i<70; i++) {
            System.out.println(statisztikaEredmeny[i]);
    }
    
}
}
