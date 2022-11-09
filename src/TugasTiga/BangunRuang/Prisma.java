package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Segitiga;

public class Prisma extends Segitiga {

    // Variabel yang digunakan
    private int alas, tinggi;

    // Setter
    @Override
    public void setAlas(int alas) {
        this.alas = alas;
    }
    @Override
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Getter
    @Override
    public int getAlas() {
        return alas;
    }
    @Override
    public int getTinggi() {
        return tinggi;
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        System.out.println("Nilai alas yang anda masukan\t: " + getAlas());
        System.out.println("Nilai tinggi yang anda masukan\t: " + getTinggi());
        int volume = ((getAlas() * getTinggi() / 2) * getTinggi());
        System.out.println("Jumlah Volume Prisma : " + volume);
    }
}
