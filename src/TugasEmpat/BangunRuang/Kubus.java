package TugasEmpat.BangunRuang;

import TugasEmpat.Abstract.BangunRuang;
import TugasEmpat.BangunDatar.Persegi;

public class Kubus extends Persegi implements BangunRuang {

    // Constructor
    public Kubus() {
    }

    // Setter
    @Override
    public void setSisi(int sisi) {
        super.setSisi(sisi);
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunRuang() {
        System.out.println("""

                    === KARAKTER BANGUN ===\s
                    1. Mempunyai 12 Rusuk
                    2. Semua Sudutnya Siku-Siku"""
        );
    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasKubus(int sisi) {
        return 6 * super.hitungLuasPersegi(getSisi()) * super.hitungLuasPersegi(getSisi()) ;
    }

    // Method untuk menghitung volume
    @Override
    public int hitungVolumeKubus(int sisi) {
        return super.getSisi() * super.getSisi() * super.getSisi();
    }

    // Method untuk mencetak hasil
    @Override
    public void cetakHasil() {
        int volume = hitungVolumeKubus(getSisi());
        int luas = hitungLuasKubus(getSisi());
        System.out.println("Volume Kubus\t\t: " + volume);
        System.out.println("Luas Kubus\t\t\t: " + luas);
        karakterBangunRuang();
    }

}
