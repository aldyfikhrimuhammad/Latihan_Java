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
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunDatar() {
        System.out.println("=== KARAKTER BANGUN ===");
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
    }
}
