/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2acara5.pkg6;
import java.util.Scanner;
public class inputan {
    
    public static void main(String[] args) {
        
        Scanner si = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 =  ");
        int nilai1 = si.nextInt();
        System.out.print("Masukkan nilai2 =  ");
        int nilai2 = si.nextInt();
        
        int jmlh = nilai1 + nilai2;
        System.out.println("Jumlah = "+jmlh);
    }
    
}
