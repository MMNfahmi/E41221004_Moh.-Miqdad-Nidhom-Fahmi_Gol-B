/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2acara7.pkg8;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        System.out.println("    CAFE BLUE ARCHIVE   ");
        System.out.println("    MARKAS PARA MURID   ");
        System.out.println("------------------------");
        System.out.println("      SPECIAL MENU      ");
        
        String a, b, c, d, e;
        a = "Air Putih";
        b = "Es Campur";
        c = "Minuman kaleng";
        d = "Sprite";
        e = "teh";
        System.out.println("1. "+a +"\n2. "+b+"\n3. "+c+"\n4. "+d+"\n5. "+e);
        
        System.out.println("------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli : ");
        String nm = sc.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pil = sc.nextInt();
        
        switch(pil){
            case 1:
                System.out.println("Minuman yang anda pesan adalah "+a);
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah "+b);
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah "+c);
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah "+d);
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah "+e);
                break;
            default:
                System.out.println("Maaf pilihan yang anda pilih tidak terdapat pada pilihan menu");
        }
        System.out.println("Pesana akan segera kami antar");
        System.out.println("Terima Kasih "+nm+" telah berkunjung diCAFE BLUE ARCHIVE");
    }
    
}
