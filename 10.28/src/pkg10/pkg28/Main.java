/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg28;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Main {
    static boolean rendszamEllenorzo(String licensePlate) {
        if (licensePlate.charAt(0) < 65 || licensePlate.charAt(0) > 90 || licensePlate.charAt(1) < 65 || licensePlate.charAt(1) > 90 || licensePlate.charAt(2) < 65 || licensePlate.charAt(2) > 90 && licensePlate.charAt(3) < 48 || licensePlate.charAt(3) > 57 || licensePlate.charAt(4) < 48 || licensePlate.charAt(4) > 57 || licensePlate.charAt(5) < 48 || licensePlate.charAt(5) > 57  ) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner rendszam = new Scanner(System.in);
        String rendszamBekero;
        do {
            System.out.print("Adja meg a rendszámát (ABC123): ");
            rendszamBekero = rendszam.nextLine();
        }while(!rendszamEllenorzo(rendszamBekero));
        }
      }
