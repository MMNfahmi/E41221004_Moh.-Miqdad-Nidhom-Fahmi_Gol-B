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
public class PK1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan Nilai : ");
        nilai = scan.nextInt();
        
        if(nilai >= 90){
            grade = "A";
        }else if(nilai >= 80){
            grade = "B+";
        }else if(nilai >= 70){
            grade = "B";
        }else if(nilai >= 60){
            grade = "C+";
        }else if(nilai >= 50){
            grade = "C";
        }else if(nilai >= 40){
            grade = "D";
        }else {
            grade = "E";
        }
        System.out.println("Grade: "+grade);
    }
    
}
