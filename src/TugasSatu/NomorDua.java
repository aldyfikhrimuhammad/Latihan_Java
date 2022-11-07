package TugasSatu;

public class NomorDua {
    public static void main(String[] args) {

        // Inisialisasi nilai array
       int[] arrSatu = {2,3,4,5};
       int[] arrDua = {1,3,5,7};

       // Pengecekan kondisi apakah ada element array yang serupa nilainya
        for (int x : arrSatu) {
            for (int y : arrDua) {
                if (x == y) {
                    // Mencetak hasil
                    int hasil = x;
                    System.out.println(hasil);
                }
            }
        }

    }


}
