/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara11_12;

import java.util.Scanner;
import java.util.Random;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret : ");
        int jmlh = input.nextInt();

        int[] deret = new int[jmlh];
        Random random = new Random();

        for (int i = 0; i < jmlh; i++) {
            deret[i] = random.nextInt(100);
        }

        System.out.print("Deret : ");
        for (int i = 0; i < jmlh; i++) {
            System.out.print(deret[i] + " ");
        }
    }
    
}
