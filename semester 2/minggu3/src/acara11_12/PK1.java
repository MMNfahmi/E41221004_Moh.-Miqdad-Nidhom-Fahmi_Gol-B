/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara11_12;

/**
 *
 * @author DELL
 */
public class PK1 {
    static void elemen(){
        int [] angka = {3, 7, 8, 1, 10, 20, 35};
        System.out.println("Jumlah elemen array angka = "+angka.length);
    }
    static void array1D(){
        int [] angka = {5, 10, 17, 20, 1};
        String [] teks = {"saya","sedang","nonton","anime","jepang"};
        
        for (int i = 0; i < angka.length; i++){
            System.out.println(angka[i]);
        }
        for (int j = 0; j < teks.length; j++){
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
    static void array2D(){
        int [][] angka = {{5,4,2,1,5},{9,6,5,7,8},{5,2,1,5,10}};
        for (int baris = 0; baris < 3; baris++){
            for (int kolom = 0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        elemen();
        array1D();
        array2D();
    }
    
}
