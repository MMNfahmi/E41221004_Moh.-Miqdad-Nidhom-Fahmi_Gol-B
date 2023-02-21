/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara9_10;


public class statement_ {
    
    void _while(){
        int ka = 0;
        while (ka <= 10){
            System.out.println("Perulangan ke-" + ka);
            
            ka++;
        }
    }
    void _do_while(){
        int pe = 0;
        
        do{
            System.out.println("Perluangan ke-"+pe);
            pe++;
        } while (pe <=10);
    }
    void _for(){
        for (int as = 0; as <= 6; as++){
            for (int sa = 0; sa <= as; sa++){
                System.out.print(as);
            }
            System.out.println("");
        }
    }
    void for_each(){
        int angka[] = {3,1,42,24,12};
        
        for (int x : angka ){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int angka[] = {3,1,42,24,12};
        
        for (int x : angka ){
            System.out.print(x+" ");
        }
    }
    
}
