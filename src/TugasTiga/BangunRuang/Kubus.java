package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Persegi;

public class Kubus extends Persegi {

    // Constructor
    public Kubus() {
    }

    // Setter
    @Override
    public void setSisi(int sisi) {
        super.setSisi(sisi);
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        int volume = super.getSisi() * super.getSisi() * super.getSisi();
        System.out.println("Volume Kubus\t\t: " + volume);
    }

}
