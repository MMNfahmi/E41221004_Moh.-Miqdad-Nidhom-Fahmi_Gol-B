/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2acara5.pkg6;

/**
 *
 * @author DELL
 */
class book {
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    
    public void show (){
        System.out.println("Books information");
        System.out.println("Books price : "+price);
        System.out.println("bumber of pages : "+pages);
    }
}
    public class Minggu2acara56 {
        public static void main(String[] args) {
            book javabook = new book();
            javabook.set(60000, 100);
            javabook.show();
    }  
}
/*System.out.println("Hello ");
        System.out.println("World !");
        
        System.out.print("Hello ");
        System.out.print("World !");
        String nama = "indonesia";
        char abjad = 'a';
        int a = 6;
        double b = 6.9;
        
        System.out.println(nama);
        System.out.println(a);*/