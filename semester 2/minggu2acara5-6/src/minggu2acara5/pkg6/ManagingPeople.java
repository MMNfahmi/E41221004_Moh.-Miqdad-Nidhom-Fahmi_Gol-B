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
public class ManagingPeople {

    public static void main(String[] args) {
        person p1 = new person("Fahmi", 19);
        person p2 = new person("Mat", 21);
        
        if(p1.getumur()==p2.getumur()){
            System.out.println(p1.getNama()+" seumuran dengan "+p2.getNama());
        }else{
            System.out.println(p1.getNama()+" tidak seumuran dengan "+p2.getNama());
        }
    }
    
}
