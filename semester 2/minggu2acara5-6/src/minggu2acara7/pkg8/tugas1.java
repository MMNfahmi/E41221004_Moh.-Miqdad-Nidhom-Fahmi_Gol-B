/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2acara7.pkg8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza ( KAP )        ");
        System.out.println("             Promo Belanja Berhadiah        ");
        System.out.println("      Khusus Pembelian 5 Barang Pertama     ");
        System.out.println("       Dengan Harga Minimum Rp 10000,00     ");
        System.out.println("--------------------------------------------");
        
        String nm;
        System.out.print("Masukkan Nama Pembeli : ");
        nm = sc.nextLine();
        
        System.out.println("");
        
        int a,l,b,ttl;
        ttl = 0;
        for (a=1;a<=5;a++){
           System.out.print("Masukkan harga barang ke-"+a+" : ");
           for(b = 1;b<=5;b++){
               b = sc.nextInt();
               ttl=ttl+b;
           } 
        }
        System.out.println("Total harga pembelian atas nama "+nm+" adalah "+ ttl );
        System.out.println("");
        
        if(ttl>=15000){
            System.out.println("Selamat...\nAnda mendapatkan hadiah 1 buah loli ");
        }else if(ttl>=10000){
            System.out.println("Selamat...\nAnda menadpatkan hadiah 1 karung beras");
        }else{
            System.out.println("Maaf...\nBelanjaan anda kurang untuk mendapatkan hadiah");
        }
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("              Terima Kasih                  ");
        System.out.println(" Anda sudah belanja di Kharisma agung Plaza ");
        
    }
}
