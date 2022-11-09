package TugasEmpat.BangunDatar;

import TugasEmpat.Abstract.BangunDatar;

public class Lingkaran implements BangunDatar {

    // Variabel yang digunakan
    private int jariJari;

    // Constructor
    public Lingkaran(){
    }

    // Setter
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    // Getter
    public int getJariJari() {
        return jariJari;
    }

    // Method untuk menggambar bangun
    @Override
    public void gambarBangun() {
        System.out.println("=== LINGKARAN ===");
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunDatar() {

    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasLingkaran(int jariJari) {
        return (int) (3.14 * jariJari * jariJari);
    }

    // Method untuk menghitung keliling
    @Override
    public int hitungKelilingLingkaran(int jariJari) {
        return (int) (2 * 3.14 * jariJari);
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        int luas = hitungLuasLingkaran(getJariJari());
        int keliling = hitungKelilingLingkaran(getJariJari());

        System.out.println("Luas Lingkaran\t\t: " + luas);
        System.out.println("Keliling Lingkaran\t: " + keliling);
        gambarBangun();
    }

}
