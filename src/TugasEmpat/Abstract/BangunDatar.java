package TugasEmpat.Abstract;

public interface BangunDatar {

    // Method untuk menggambar bangun
    public void gambarBangun();

    // Method untuk karakteristik bangun
    public void karakterBangunDatar();

    // Method untuk menghitung luas
    default int hitungLuasSegitiga(int alas, int tinggi) {
        return 0;
    }
    default int hitungLuasLingkaran(int jariJari) {
        return 0;
    }
    default int hitungLuasPersegi(int sisi) {
        return 0;
    }

    // Method untuk menghitung keliling
    default int hitungKelilingSegitiga(int alas, int tinggi) {
        return 0;
    }
    default int hitungKelilingLingkaran(int jariJari) {
        return 0;
    }
    default int hitungKelilingPersegi(int sisi) {
        return 0;
    }

}
