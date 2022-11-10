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
        System.out.println("""

                    === KARAKTER BANGUN ===\s
                    1. Mempunyai 5 Sisi
                    2. Mempunyai 6 Titik Sudut
                    3. Mempunyai 9 Rusuk"""
        );
    }

    // Method untuk menghitung luas permukaan
    @Override
    public int hitungLuasPrisma(int alas, int tinggi) {
        return 2 * super.hitungLuasSegitiga(getAlas(), getTinggi()) + super.hitungKelilingSegitiga(getAlas(), getTinggi()) * getTinggiPrisma();
    }

    // Method untuk menghitung volume
    @Override
    public int hitungVolumePrisma(int alas, int tinggi, int tinggiPrisma) {
        return ((super.getAlas() * super.getTinggi() / 2) * getTinggiPrisma());
    }

    // Method untuk mencetak hasil
    @Override
    public void cetakHasil() {
        int volume = hitungVolumePrisma(getAlas(), getTinggi(), getTinggiPrisma());
        int luas = hitungLuasPrisma(getAlas(), getTinggi());
        System.out.println("Jumlah Volume Prisma    : " + volume);
        System.out.println("Jumlah luas Prisma      : " + luas);
        karakterBangunRuang();
    }

}
