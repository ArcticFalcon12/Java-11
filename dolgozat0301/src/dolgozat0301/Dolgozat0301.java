/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolgozat0301;

import java.util.Random;

/**
 *
 * @author gicziattila
 */
public class Dolgozat0301 {
    public static void fillMatrix(int[][] szamok) {
        int i;
        int j;
        Random randomSzam=new Random();
        for (i=0;i<szamok.length;i++) {
            for (j=0;j<szamok[0].length;j++) {
              szamok[i][j]=randomSzam.nextInt(21) + 10;
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
    public static void minMaxMinus(int[][] szamok) {
        int sorszam=0;
        for(int i=0;i<szamok.length;i++) {
            int small = 31;
            int high = 0;
            sorszam++;
            for(int j=0;j<szamok[0].length;j++) {
                if (szamok[i][j] < small) {
                    small = szamok[i][j];
                }
                if (high < szamok[i][j]) {
                    high = szamok[i][j];
                }
            }
            int kulonbseg = high - small;
            System.out.println("A(z) " + sorszam + " számú sorban a legnagyobb szám: " + high + " és a legkisebb szám: " + small + " ezeknek külöbsége: " + kulonbseg + "." );
        }
    }       
    public static boolean primSzam(int[][] szamok) {
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                if (szamok[i][j] % 2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPrime(int number) {
        for (int i=2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean containsPrime(int[][] szamok) {
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                if(isPrime(szamok[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] wherePrim(int[][] szamok) {
        int[] primNumbers = new int[2];
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                    if (szamok[i][j] % 2 != 0) {
                        primNumbers[0] = i;
                        primNumbers[1] = j;
                        return primNumbers;
                }
            }
        }
        return primNumbers;
    }
    public static void main(String[] args) {
        System.out.println("----------Mátrix kiiratás-----------");
        int[][] numbers = new int[4][4];
        fillMatrix(numbers);
        writeMatrix(numbers);
        System.out.println("---------Soronként a legkisebb és a legnagyobb szám különbsége-------");
        minMaxMinus(numbers);
        System.out.println("-------Van-e benne prímszám-------");
        if (primSzam(numbers) == true) {
            System.out.println("A mátrixban van prímszám");
        }
        else {
            System.out.println("A mátrixban nincs prímszám");
        }  
        System.out.println("-------- Hol van a prímszám ------");
        int[] lista = wherePrim(numbers);
        for(int i = 0;i<2;i++){
            System.out.println(lista[i]);
    }
}
}
