/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Pasek Ariawan
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.printf("%s%c\n","Pemrograman Java",'|'); 
        System.out.printf("%30s%c\n","Pemrograman Java",'|');
        System.out.printf("%-30s%c\n","Pemrograman Java",'|');
        System.out.printf("%30.5s%c\n","Pemrograman Java",'|');
        
        
        int nilai=10;
        double nilai_2=5.3; 
        int hasil;
        String s = "Belajar Java"; 
        System.out.println(nilai+nilai_2); 
        System.out.println("Kita sedang "+s);
        
        
        Scanner input = new Scanner(System.in); 
        int nilai1, nilai2, hasil; 
        System.out.print("masukkan nilai 1 : "); 
        nilai1 = input.nextInt(); 
        System.out.print("masukkan nilai 2 : "); 
        nilai2 = input.nextInt();
        hasil = nilai1*nilai2; 
        System.out.println("maka hasil : "+hasil);

    }
}
