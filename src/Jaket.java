package PraktikumSIH;
import java.util.Scanner;
public class Jaket {
    public static final int jaketA = 100000;
    public static final int jaketB = 125000;
    public static final int jaketC = 175000;
    private static int banyak;
    private int harga;
    private static int pilihan;

    public void Jaket() {
        this.banyak = banyak;
    }
    public void hitungJaketA() {
        if (banyak <= 100) {
            harga = jaketA * banyak;
            System.out.println("Total harga pembelian : Rp." + harga);
        } else {
            harga = (jaketA - 5000) * banyak;
            System.out.println("Selamat, Anda mendapat diskon!");
            System.out.println("Total harga pembelian : Rp." + harga);
        }
    }
    public void hitungJaketB() {
        if (banyak <= 100) {
            harga = jaketB * banyak;
            System.out.println("Total harga pembelian : Rp." + harga);
        } else {
            harga = (jaketB - 5000) * banyak;
            System.out.println("Selamat, Anda mendapat diskon!");
            System.out.println("Total harga pembelian : Rp." + harga);
        }
    }
    public void hitungJaketC() {
        if (banyak <= 100) {
            harga = jaketC * banyak;
            System.out.println("Total harga pembelian : Rp." + harga);
        } else {
            harga = (jaketC - 15000) * banyak;
            System.out.println("Selamat, Anda mendapat diskon!");
            System.out.println("Total harga pembelian : Rp." + harga);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket hasil = new Jaket();

        System.out.println("            CV. LABKOMDAS            ");
        System.out.println("         Menjual Aneka Jaket         ");
        System.out.println("-------------------------------------");
        System.out.println("1. Jaket A --> Rp.100000/pcs");
        System.out.println("2. Jaket B --> Rp.125000/pcs");
        System.out.println("3. Jaket C --> Rp.175000/pcs");
        System.out.println();
        System.out.println("PROMO KHUSUS!!!");
        System.out.println("Diskon untuk pembelian >100 pcs");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.print("Masukkan jumlah  : ");
        banyak = input.nextInt();
        System.out.println("=====================================");
        switch (pilihan) {
            case 1 : hasil.hitungJaketA();
            break;
            case 2 : hasil.hitungJaketB();
            break;
            case 3 : hasil.hitungJaketC();
            break;
            default: System.out.println("Maaf, pilihan tidak tersedia");
            break;
        }
    }
}