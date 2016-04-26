package PraktikumSIH;
import java.util.Scanner;
public class MainPerhitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("    PROGRAM PERHITUNGAN    ");
        System.out.println("");
        System.out.print("Masukkan nilai ke 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai ke 2 : ");
        int nilai2 = input.nextInt();
        Perhitungan.Penjumlahan(nilai1, nilai2);
        System.out.println("---------------------------");    
        System.out.print("Masukkan nilai ke 1 : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai ke 2 : ");
        nilai2 = input.nextInt();
        Perhitungan.Pengurangan(nilai1, nilai2);
        System.out.println("---------------------------");
        System.out.print("Masukkan nilai ke 1 : ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai ke 2 : ");
        nilai2 = input.nextInt();
        Perhitungan a = new Perhitungan();
        a.Perkalian(nilai1, nilai2);
        System.out.println("---------------------------");
        System.out.print("Masukkan nilai ke 1 : ");
        double angka1 = input.nextInt();
        System.out.print("Masukkan nilai ke 2 : ");
        double angka2 = input.nextInt();
        a.Pembagian(angka1, angka2);
        System.out.println("---------------------------");
        System.out.print("Masukkan nilai ke 1 : ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan nilai ke 2 : ");
        int penyebut = input.nextInt();
        a.Sederhana(pembilang, penyebut);
    }
}