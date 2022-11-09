package TugasTiga.BangunDatar;

public class Segitiga {

    // Variabel yang digunakan
    private int alas, tinggi;

    // Constructor
    public Segitiga(){
    }

    // Setter
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Getter
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        float luas = (float) (0.5 * alas * tinggi);
        int keliling = alas + tinggi + tinggi;
        System.out.println("Nilai alas yang anda masukan\t: " + getAlas());
        System.out.println("Nilai tinggi yang anda masukan\t: " + getTinggi());
        System.out.println("Luas Segitiga\t\t: " + luas);
        System.out.println("Keliling Segitiga\t: " + keliling);
    }

}
