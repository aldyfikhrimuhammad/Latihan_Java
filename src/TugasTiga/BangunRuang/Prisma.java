package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Segitiga;

public class Prisma extends Segitiga {

    // Variabel yang digunakan
    private int tinggiPrisma;

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    // Getter
    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        System.out.println("Nilai alas yang anda masukan\t: " + getAlas());
        System.out.println("Nilai tinggi yang anda masukan\t: " + getTinggi());
        int volume = ((super.getAlas() * super.getTinggi() / 2) * getTinggiPrisma());
        System.out.println("Jumlah Volume Prisma : " + volume);
    }
}
