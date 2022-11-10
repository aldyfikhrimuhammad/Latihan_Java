package TugasEmpat.BangunDatar;

import TugasEmpat.Abstract.BangunDatar;

public class Persegi implements BangunDatar {

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

    // Method untuk gambar bangun
    @Override
    public void gambarBangun() {
        System.out.println("===  PERSEGI ===");
//        int besar_persegi = 0,i,j;
//        for(i=1; i<=besar_persegi; i++) {
//            for(j=1; j<=besar_persegi; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
    }

    // Method untuk karakteristik bangun
    @Override
    public void karakterBangunDatar() {
        System.out.println("""

                    === KARAKTER BANGUN ===\s
                    1. Mempunyai Sisi Yang Sama Panjang
                    2. Mempunyai 4 Sudut Siku-Siku"""
        );
    }

    // Method untuk menghitung luas
    @Override
    public int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    @Override
    public int hitungKelilingPersegi(int sisi) {
        return sisi + sisi + sisi + sisi;
    }

    // Mencetak hasil luas dan keliling
    public void cetakHasil() {
        int luas = hitungLuasPersegi(getSisi());
        int keliling = hitungKelilingPersegi(getSisi());

        System.out.println("Luas Persegi\t\t: " + luas);
        System.out.println("Keliling Persegi\t: " + keliling);
        gambarBangun();
        karakterBangunDatar();
    }

}
