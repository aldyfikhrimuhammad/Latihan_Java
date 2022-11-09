package TugasTiga.BangunRuang;

import TugasTiga.BangunDatar.Persegi;

public class Kubus extends Persegi {

    // variabel yang digunakan
    int sisi;

    // Constructor
    public Kubus() {
    }

    // Setter
    @Override
    public void setSisi(int sisi) {
        super.setSisi(sisi);
    }

    // Getter
    @Override
    public int getSisi() {
        return super.getSisi();
    }

    // Method untuk menghitung volume
    @Override
    public void cetakHasil() {
        int volume = getSisi() * getSisi() * getSisi();
        System.out.println("Volume Kubus\t\t: " + volume);
    }

}
