package TugasEmpat.BangunRuang;

import TugasEmpat.Abstract.BangunRuang;
import TugasEmpat.BangunDatar.Lingkaran;

public class Bola extends Lingkaran implements BangunRuang {

    // Constructor
    public Bola() {
    }

    // Setter
    @Override
    public void setJariJari(int jariJari) {
        super.setJariJari(jariJari);
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunRuang() {

    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasBola(int jariJari) {
        return BangunRuang.super.hitungLuasBola(jariJari);
    }

    // Method untuk menghitung volume
    @Override
    public int hitungVolumeBola(int jariJari) {
        return (int) (4 / 3 * 3.14 * super.getJariJari() * super.getJariJari() * super.getJariJari());
    }

    // Method untuk mencetak hasil
    @Override
    public void cetakHasil() {
        int volume = hitungVolumeBola(getJariJari());
        System.out.println("Volume Bola\t\t: " + volume);
    }

}
