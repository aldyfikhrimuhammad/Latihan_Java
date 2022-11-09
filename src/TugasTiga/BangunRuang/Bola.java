package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Lingkaran;

public class Bola extends Lingkaran {

    // Constructor
    public Bola() {
    }

    // Setter
    @Override
    public void setJariJari(int jariJari) {
        super.setJariJari(jariJari);
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        int volume = (int) (4 / 3 * 3.14 * super.getJariJari() * super.getJariJari() * super.getJariJari());
        System.out.println("Volume Bola\t\t: " + volume);
    }
}
