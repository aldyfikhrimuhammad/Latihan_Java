package TugasTiga.BangunDatar;

public class Persegi {

    // Variabel yang digunakan
    private int sisi;

    // Constructor
    public Persegi(){
    }

    // Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        int luas = sisi * sisi;
        int keliling = sisi * sisi * sisi *sisi;
        System.out.println("Nilai Sisi yang anda masukan\t: " + getSisi());
        System.out.println("Luas Persegi\t\t: " + luas);
        System.out.println("Keliling Persegi\t: " + keliling);
    }

}
