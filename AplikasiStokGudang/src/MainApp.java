/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);

        // meminta input dari user untuk nama
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        
        System.out.println("Selamat Datang " + nama + "!");


        // meminta input dari user untuk rincian barang
        System.out.print("Masukkan nama barang yang mau ditambahkan: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambahkan: ");
        int jumlahBarang = input.nextInt();

        System.out.print("Masukkan harga beli untuk barang tersebut: ");
        double hargaBeli = input.nextDouble();

        System.out.print("Masukkan harga jual untuk barang tersebut: ");
        double hargaJual = input.nextDouble();

        System.out.println("");
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("########################");
        
        // menampilkan rincian barang dengan format yang sesuai
        System.out.println("\nRincian Barang:");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.printf("Harga Beli: Rp %.2f\n", hargaBeli);
        System.out.printf("Harga Jual: Rp %.2f\n", hargaJual);
    }
}
