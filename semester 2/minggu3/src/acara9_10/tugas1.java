/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara9_10;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class tugas1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan biangan awal terkecil : ");
        int bilA = sc.nextInt();
        System.out.print("Masukkan bilangan akhir terbesar : ");
        int bilB = sc.nextInt();
        System.out.print("Bilangan genapnya adalah : ");
        for(int i = bilA; i <= bilB; i++){
            if (i % 2 == 0){
                System.out.print(i+", ");
            }
        }
    }
    
}
