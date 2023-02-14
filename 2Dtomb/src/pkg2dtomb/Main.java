/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dtomb;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2D tömb (mátrix) inicializálás
        int[][] szamok = {{2,9,7}, {1,0,3}};
        int i,j;
        int sorokSzama = szamok.length;
        int oszlopokSzama = szamok[0].length;
        //2D tömb bejárása
        //System.out.println(sorokSzama); //Mátrix mérete
        //System.out.println(oszlopokSzama); //Sor mérete
        
        for(i=0; i<sorokSzama; i++){ //Mátrix mérete = Hány sor van
            for(j=0; j<oszlopokSzama; j++) { //Sorok mérete = hány oszlop van
                System.out.print(szamok[i][j] + "\t"); //Print = egy sorban
            }
            System.out.println("");
        }
        //--------------Feladatok----------------
        System.out.println("-----------2. sor bejárása---------------");
        for(j=0; j<szamok[1].length; j++) {
            System.out.print(szamok[1][j] +"\t");
        }
        System.out.println(" ");
        System.out.println("-------------2. oszlop bejárása-----------------");
        for (i=0; i<sorokSzama; i++) {
            System.out.println(szamok[i][1] +"\t");
         }
        System.out.println(" ");
        System.out.println("------------ Tömb elemeinek összege-------------");
        int osszeg = 0;
        for (i=0; i<sorokSzama; i++) {
            for (j=0; j<szamok[1].length; j++) {
                osszeg += szamok[i][j];
            }
        }
        System.out.println("A tömb elemeinek összege: " + osszeg);        
        
        System.out.println(" ");
        System.out.println("------------Tömb sorainak összege----------");
        for (i=0; i<sorokSzama;i++) {
            int osszeg2 = 0;
            for (j=0;j<oszlopokSzama;j++) {
                osszeg2 = osszeg2 + szamok[i][j];
            }
            System.out.println(osszeg2);
        }
        System.out.println(" ");
        System.out.println("---------Hány darab páros szám van----------");
        int parosSzamok = 0;
        for (i=0; i<sorokSzama;i++) {
            for (j=0;j<oszlopokSzama;j++) {
                if (szamok[i][j] % 2 == 0) {
                    parosSzamok++;
                }
            }
            
        }
        System.out.println("Ennyi páros szám van: " + parosSzamok);
        System.out.println(" ");
        System.out.println("-----------Hány darab páros szám van soronként-----------");
        for (i=0; i<sorokSzama;i++) {
            int parosSzamokSoronkent = 0;
            for (j=0;j<oszlopokSzama;j++) {
                if (szamok[i][j] % 2 == 0) {
                    parosSzamokSoronkent++;
                }
            }
        System.out.println("Ennyi páros szám van soronként: " + parosSzamokSoronkent);    
        }
        
        System.out.println(" ");
        System.out.println("----------Tömb bejárása oszlopként------------");
        for(j=0; j<oszlopokSzama; j++){
            for(i=0; i<sorokSzama; i++) {
                System.out.println(szamok[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        System.out.println("----------Számok összege oszlopokként--------");
        for(j=0; j<oszlopokSzama; j++){
            int numbersRow = 0;
            for(i=0; i<sorokSzama; i++) {
                numbersRow += szamok[i][j];
            }
            System.out.println(numbersRow);
        }
        System.out.println(" ");
        System.out.println("----------Rnadom számokkal feltölteni egy új listát--------------");
        Random randomSzam=new Random();
        int[][] numbers=new int[3][5];
        for( i=0;i<3;i++) {
            for( j=0;j<5;j++)
      {
         numbers[i][j]=randomSzam.nextInt(10);
         System.out.print(numbers[i][j]+"\t");
      }
  
     System.out.print("\n");
  }

    }
    
}
