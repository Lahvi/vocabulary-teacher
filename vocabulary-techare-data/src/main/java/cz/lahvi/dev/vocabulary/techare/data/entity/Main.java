/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.lahvi.dev.vocabulary.techare.data.entity;

import java.util.Scanner;

/**
 *
 * @author phlavacek
 */
public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        int cislo = app.vstupMaxCisla();

        for (int i = 3; i < cislo; i++) {
            if(app.jePrvocislo(i)){
                app.vypisPrvocislo(i);
            }
        }

    }

    private int vstupMaxCisla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number:");
        try {
            int maxNumber = scanner.nextInt();
            if (maxNumber > 2) {
                return maxNumber;
            } else {
                System.out.println("Your input has to be number greater then 2");
                return vstupMaxCisla();
            }
        } catch (Exception e) {
            System.out.println("Your input has to be number greater then 2");
            return vstupMaxCisla();
        }
    }

    private boolean jePrvocislo(int cislo) {
        for (int j = 2; j < cislo / 2; j++) {
            if (cislo % j == 0) {
                return false;
            }
        }
        return true;
    }

    private void vypisPrvocislo(int cislo) {
        System.out.println("Number " + cislo + " is primenumber.");
    }
}
