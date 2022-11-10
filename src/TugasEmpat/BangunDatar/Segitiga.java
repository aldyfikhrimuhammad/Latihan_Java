package TugasEmpat.BangunDatar;

import TugasEmpat.Abstract.BangunDatar;

public class Segitiga implements BangunDatar {

    // Variabel yang digunakan
    private int alas, tinggi;

    // Constructor
    public Segitiga(){
    }

    // Setter
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Getter
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }

    // Method untuk menggambar bangun
    @Override
    public void gambarBangun() {
        System.out.println("=== SEGITIGA ===");
//        int x = 5;
//        for (int i = 1; i <= x; i++){
//            for (int j = 4; j >= i; j--) {
//                System.out.print(' ');
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print('*');
//            }
//            for (int l = 1; l <= i - 1; l++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunDatar() {
        System.out.println("""

                    === KARAKTER BANGUN ===\s
                    1. Mempunyai 3 Sudut yang Sama Besarnya
                    2. Mempunyai 3 Sumbu Simetri Lipat
                    3. Mempunyai 3 Sumbu Simetri Putar"""
        );
    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasSegitiga(int alas, int tinggi) {
        float luas = (float) (0.5 * alas * tinggi);
        return (int) luas;
    }

    // Method untuk menghitung keliling
    @Override
    public int hitungKelilingSegitiga(int alas, int tinggi) {
        return alas + tinggi + tinggi;
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        float luas = hitungLuasSegitiga(getAlas(), getTinggi());
        int keliling = hitungKelilingSegitiga(getAlas(), getTinggi());

        System.out.println("Luas Segitiga\t\t: " + luas);
        System.out.println("Keliling Segitiga\t: " + keliling);
        gambarBangun();
        karakterBangunDatar();
    }
}
