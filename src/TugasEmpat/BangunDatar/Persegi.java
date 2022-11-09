package TugasEmpat.BangunDatar;

import TugasEmpat.Abstract.BangunDatar;

public class Persegi implements BangunDatar {

    // Variabel yang digunakan
    private int sisi;

    // Constructor
    public Persegi(){
    }

    // Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    // Method untuk gambar bangun
    @Override
    public void gambarBangun() {
        System.out.println("===  PERSEGI ===");
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunDatar() {

    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    @Override
    public int hitungKelilingPersegi(int sisi) {
        return sisi + sisi + sisi + sisi;
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        int luas = hitungLuasPersegi(getSisi());
        int keliling = hitungKelilingPersegi(getSisi());

        System.out.println("Luas Persegi\t\t: " + luas);
        System.out.println("Keliling Persegi\t: " + keliling);
        gambarBangun();
    }

}
