package PraktikumSIH;
public class Perhitungan {
    public static void Penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan   : " + hasil);

    }
    public static void Pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan   : " + hasil);
    }
    public void Perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil Perkalian     : " +hasil);
    }
    public void Pembagian(double a, double b) {
        double hasil = a / b;
        System.out.println("Hasil Pembagian     : " + hasil);
    }
    public void Sederhana(int pembilang, int penyebut) {
        for (int i = 2; i < pembilang; i++) {
            if ((pembilang % i == 0) && (penyebut % i == 0)) {
                pembilang = pembilang / i;
                penyebut = penyebut / i;
            }
        }
        System.out.print("Hasil Penyederhanaan: ");
        System.out.println(pembilang + "/" + penyebut);
    }
}
