/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara9_10;

public class tugas2 {

    public static void main(String[] args) {
        System.out.println("          Do__While         ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        int a = 1;
        do {
            System.out.print(a+" ");
            a*=2;
            a-=1;
            a++;
            
        } while ( a <= 100);
        
    }
    
}
