package TugasSatu;

import java.util.Arrays;

public class NomorTiga {
    public static void main(String[] args) {

        // Inisialisasi nilai awal array dan variabel pendukung lainnya
        int[] arrAcak = {3,2,4,1,5};
        int temp;

        // Pengulangan untuk memeriksa nilai array
        for (int i = 0; i < arrAcak.length - 1; i++) {
            for(int j = i; j < arrAcak.length - 1; j++) {
                // Memeriksa apakah arrAcak[i] lebih besar dari arrAcak[j + 1]
                if(arrAcak[i] > arrAcak[j + 1]){
                    temp = arrAcak [j + 1];
                    arrAcak [j + 1]= arrAcak [i];
                    arrAcak [i] = temp;
                }
            }
        }

        // Mencetak hasil array yang sudah terurut
        System.out.println(Arrays.toString(arrAcak));

    }
}
