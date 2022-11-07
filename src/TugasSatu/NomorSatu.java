package TugasSatu;

import java.util.Scanner;

public class NomorSatu {
    public static void main(String[] args) {

        // Membuka object Scanner
        Scanner inputUser = new Scanner(System.in);

        // Mengambil input user
        System.out.print("Masukan nama depan : ");
        String firstName = inputUser.nextLine();
        System.out.print("Masukan nama akhir : ");
        String lastName = inputUser.nextLine();
        System.out.print("Masukan tempat, tanggal lahir (dd/mm/yyyy) : ");
        String birthDesc = inputUser.nextLine();
        System.out.print("Masukan bahasa pemrograman favorit : ");
        String progLangFav = inputUser.nextLine();

        System.out.println("====================");

        // Memanggil method cetakData
        cetakData(firstName, lastName, birthDesc, progLangFav);

        // Menutup object Scanner
        inputUser.close();
    }

    // Method untuk mencetak input user
    static void cetakData(String firstName, String lastName, String birthDesc, String progLangFav){
        System.out.println("Nama lengkap : " + firstName + " " + lastName);
        System.out.println("Tempat, tanggal lahir : " + birthDesc);
        System.out.println("Bahas pemrograman favorit : " + progLangFav);
    }
}
