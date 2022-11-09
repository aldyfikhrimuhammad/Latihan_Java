package TugasTiga.BangunDatar;

public class Lingkaran {

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

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        int luas = (int) (3.14 * jariJari * jariJari);
        int keliling = (int) (2 * 3.14 * jariJari);
        System.out.println("Luas Lingkaran\t\t: " + luas);
        System.out.println("Keliling Lingkaran\t: " + keliling);
    }
}
