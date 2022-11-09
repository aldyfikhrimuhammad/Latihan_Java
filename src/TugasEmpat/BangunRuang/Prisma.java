package TugasEmpat.BangunRuang;

import TugasEmpat.Abstract.BangunRuang;
import TugasEmpat.BangunDatar.Segitiga;

public class Prisma extends Segitiga implements BangunRuang {

    // Variabel yang digunakan
    private int tinggiPrisma;

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    // Getter
    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunRuang() {

    }

    // Method untuk menghitung luas permukaan
    @Override
    public int hitungLuasPrisma(int alas, int tinggi) {
        return BangunRuang.super.hitungLuasPrisma(alas, tinggi);
    }

    // Method untuk menghitung volume
    @Override
    public int hitungVolumePrisma(int alas, int tinggi, int tinggiPrisma) {
        return ((super.getAlas() * super.getTinggi() / 2) * getTinggiPrisma());
    }

    // Method untuk mencetak hasil
    @Override
    public void cetakHasil() {
        int volume = hitungVolumePrisma(getAlas(), getTinggi(), tinggiPrisma);
        System.out.println("Jumlah Volume Prisma : " + volume);
    }

}
