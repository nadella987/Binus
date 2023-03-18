import java.util.Scanner;
import java.text.DecimalFormat;
 
public class MainApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        
        int jumlahOrang;
        String namaOrang;
        
        System.out.print("Selamat siang...");
        System.out.print("\nPesan untuk berapa orang  : ");
        jumlahOrang = scanner.nextInt();
        System.out.print("Pesanan atas nama\t  : ");
        namaOrang = scanner.next();
        
        double nasigoreng = 9999.99;
        double ayambkr = 12345.67;
        double steaksir = 21108.40;
        double kwetiawsrm = 13579.13;
        double kambinggul = 98765.43;
        System.out.println("\nMenu Spesial Hari ini");
        System.out.println("=====================");
        System.out.println("\t1. Nasi Goreng Spesial\t\t @ Rp. " + nasigoreng);
        System.out.println("\t2. Ayam Bakar Spesial\t\t @ Rp. " + ayambkr);
        System.out.println("\t3. Steak Sirloin Spesial\t @ Rp. " + steaksir);
        System.out.println("\t4. Kwetiaw Siram Spesial\t @ Rp. " + kwetiawsrm);
        System.out.println("\t5. Kambing Guling Spesial\t @ Rp. " + kambinggul);
        
        int jmlNasgor, jmlAyam, jmlSteak, jmlKwetiaw, jmlKambing;
        System.out.println("\nPesanan Anda [batas pesanan 0-10]");
        System.out.print("1. Nasi Goreng Spesial \t\t= ");
        jmlNasgor = scanner.nextInt();
        System.out.print("2. Ayam Bakar Spesial \t\t= ");
        jmlAyam = scanner.nextInt();
        System.out.print("3. Steak Sirloin Spesial \t= ");
        jmlSteak = scanner.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial \t= ");
        jmlKwetiaw = scanner.nextInt();
        System.out.print("5. Kambing Guling Spesial \t= ");
        jmlKambing = scanner.nextInt();
        
        System.out.println("\nSelamat Menikmati Makanan Anda...");
        System.out.println("Pembelian :");
        
        double subNasigoreng = jmlNasgor*nasigoreng;
        double subAyambkr = jmlAyam*ayambkr;
        double subSteaksir = jmlSteak*steaksir;
        double subKwetiawsrm = jmlKwetiaw*kwetiawsrm;
        double subKambinggul = jmlKambing*kambinggul;
        
        System.out.println("\t1. Nasi Goreng Spesial\t\t"+ jmlNasgor +" porsi * Rp. " + nasigoreng + "\t = Rp. "+df.format(subNasigoreng));
        System.out.println("\t2. Ayam Bakar Spesial\t\t"+ jmlAyam +" porsi * Rp. " + ayambkr + "\t = Rp. "+df.format(subAyambkr));
        System.out.println("\t3. Steak Sirloin Spesial\t"+ jmlSteak +" porsi * Rp. " + steaksir + "\t = Rp. "+df.format(subSteaksir));
        System.out.println("\t4. Kwetiaw Siram Spesial\t"+ jmlKwetiaw +" porsi * Rp. " + kwetiawsrm + "\t = Rp. "+df.format(subKwetiawsrm));
        System.out.println("\t5. Kambing Guling Spesial\t"+ jmlKambing +" porsi * Rp. " + kambinggul + "\t = Rp. "+df.format(subKambinggul));
        System.out.println("====================================================================================");
        
        double subTotal = subNasigoreng+subAyambkr+subSteaksir+subKwetiawsrm+subKambinggul;
        System.out.println("Total Pembelian \t\t\t\t\t\t = Rp. "+df.format(subTotal));
        
        double diskon = subTotal*10/100;
        System.out.println("Disc. 10% <Masa Promosi> \t\t\t\t\t = Rp. "+df.format(diskon));
        System.out.println("====================================================================================");
        
        double total = subTotal-diskon;
        System.out.println("Total Pembelian Setelah Disc 10% \t\t\t\t = Rp. "+df.format(total));
        
        System.out.println("Pembelian per orang <untuk "+jumlahOrang+" orang> \t\t\t\t = Rp. "+df.format(total/jumlahOrang));
        System.out.println("\n\t\t\tTerima kasih atas kunjungan anda...");
        System.out.println("\n\t\t\t...tekan ENTER untuk keluar...");
        scanner.nextLine(); // menunggu sampai pengguna menekan tombol ENTER
        System.out.println("\f"); // membersihkan layar
        main(args);
        
    }
}
