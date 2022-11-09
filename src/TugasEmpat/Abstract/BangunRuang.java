package TugasEmpat.Abstract;

public interface BangunRuang {

    // Method untuk menggambar bangun
    public void gambarBangun();

    // Method untuk karakteristik bangun
    public void karakterBangunRuang();

    // Method untuk menghitung luas
    default int hitungLuasPrisma(int alas, int tinggi) {
        return 0;
    }
    default int hitungLuasBola(int jariJari) {
        return 0;
    }
    default int hitungLuasKubus(int sisi) {
        return 0;
    }

    // Method untuk menghitung volume
    default int hitungVolumePrisma(int alas, int tinggi, int tinggiPrisma) {
        return 0;
    }
    default int hitungVolumeBola(int jariJari) {
        return 0;
    }
    default int hitungVolumeKubus(int sisi) {
        return 0;
    }

}
