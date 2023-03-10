/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("***************************************");

        System.out.println("");

        System.out.println("Data Anda");
        System.out.println("***********");
        
        System.out.print("Masukkan nama Anda: ");
        String namaAnda = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int umurAnda = input.nextInt();
        input.nextLine();
        
        System.out.println("");
        System.out.println("Data Pasangan Anda");
        System.out.println("***********");
        
        // membaca karakter newline
        System.out.print("Masukkan nama pasangan Anda: ");
        String namaPasangan = input.nextLine();
        System.out.print("Masukkan umur pasangan Anda: ");
        int umurPasangan = input.nextInt();
        
        System.out.println("");
        
        System.out.println(namaAnda + " [" + umurAnda + "] " + "tahun");
        
        // Untuk print bentuk heart
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (2 - i + 1) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(namaPasangan + " [" + umurPasangan + "] " + "tahun");
         
        System.out.println("");
          
        System.out.print("Tekan ENTER untuk melihat hasil ramalan.....");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();

        System.out.println("");

         
      double x = rand.nextInt(51) + 50; // menghasilkan angka acak antara 50 sampai 100
      double kecocokan = x / 1.1; // menghitung kecocokan dengan rumus Cocok=X/1.1

     System.out.println("Kecocokan anda dan pasangan adalah " + String.format("%.2f", kecocokan) + "%");
     
      System.out.println("");
     System.out.println("Terima Kasih karena Anda telah menggunakan jasa ramalan kami");
    }
}