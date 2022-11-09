package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Lingkaran;

public class Bola extends Lingkaran {

    // variabel yang digunakan
    int jariJari;

    // Constructor
    public Bola() {
    }

    // Setter
    @Override
    public void setJariJari(int jariJari) {
        super.setJariJari(jariJari);
    }

    // Getter
    @Override
    public int getJariJari() {
        return super.getJariJari();
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        int volume = (int) (4 / 3 * 3.14 * getJariJari() * getJariJari() * getJariJari());
        System.out.println("Volume Bola\t\t: " + volume);
    }
}
