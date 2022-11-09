package TugasTiga;

import TugasTiga.BangunDatar.Lingkaran;
import TugasTiga.BangunDatar.Persegi;
import TugasTiga.BangunDatar.Segitiga;
import TugasTiga.BangunRuang.Bola;
import TugasTiga.BangunRuang.Kubus;
import TugasTiga.BangunRuang.Prisma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuka object Scanner
        Scanner inputUser = new Scanner(System.in);

        // Variabel yang digunakan
        int alas, tinggi, tinggiPrisma;
        int jariJari;
        int sisi;

        // Membuka object bangun datar
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();

        // Membuka object bangun ruang
        Prisma prisma = new Prisma();
        Bola bola = new Bola();
        Kubus kubus = new Kubus();

        // Mengulang Menu
        boolean continueProgram = true;
        while (continueProgram) {

            // Main Menu
            System.out.println("""

                    === MAIN MENU ===\s
                    1. Hitung Bangun Datar
                    2. Hitung Bangun Ruang"""
            );

            // Mengambil input user
            System.out.print("Pilih Menu : ");
            int menu = inputUser.nextInt();
            inputUser.nextLine();

            switch (menu) {

                case 1 -> {
                    // Menu
                    System.out.println("""

                            === Menghitung Bangun Datar ===\s
                            1. Segitiga
                            2. Lingkaran
                            3. Persegi"""
                    );

                    System.out.print("Pilih Bangun Datar : ");
                    int pilihBangunDatar = inputUser.nextInt();
                    inputUser.nextLine();

                    switch (pilihBangunDatar) {
                        case 1 -> {
                            System.out.println("== Segitiga ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Alas : ");
                            alas = inputUser.nextInt();
                            segitiga.setAlas(alas);
                            System.out.print("Masukan Nilai Tinggi : ");
                            tinggi = inputUser.nextInt();
                            segitiga.setTinggi(tinggi);

                            // Mencetak hasil
                            segitiga.cetakHasil();
                        }
                        case 2 -> {
                            System.out.println("== Lingkaran ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Jari - Jari : ");
                            jariJari = inputUser.nextInt();
                            lingkaran.setJariJari(jariJari);

                            // Mencetak hasil
                            lingkaran.cetakHasil();
                        }
                        case 3 -> {
                            System.out.println("== Persegi ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Sisi : ");
                            sisi = inputUser.nextInt();
                            persegi.setSisi(sisi);

                            // Mencetak hasil
                            persegi.cetakHasil();
                        }

                        default -> System.out.println("Bangun Datar Tidak Tersedia!");
                    }
                }

                case 2 -> {
                    // Menu
                    System.out.println("""

                            === Menghitung Bangun Ruang ===\s
                            1. Prisma
                            2. Bola
                            3. Kubus"""
                    );

                    System.out.print("Pilih Bangun Ruang : ");
                    int pilihBangunRuang = inputUser.nextInt();
                    inputUser.nextLine();

                    switch (pilihBangunRuang) {
                        case 1 -> {
                            System.out.println("== Prisma ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Alas : ");
                            alas = inputUser.nextInt();
                            prisma.setAlas(alas);
                            System.out.print("Masukan Nilai Tinggi : ");
                            tinggi = inputUser.nextInt();
                            prisma.setTinggi(tinggi);
                            System.out.print("Masukan Nilai Tinggi Prisma : ");
                            tinggiPrisma = inputUser.nextInt();
                            prisma.setTinggiPrisma(tinggiPrisma);

                            // Mencetak hasil
                            prisma.cetakHasil();
                        }
                        case 2 -> {
                            System.out.println("== Bola ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Jari - Jari : ");
                            jariJari = inputUser.nextInt();
                            bola.setJariJari(jariJari);

                            // Mencetak hasil
                            bola.cetakHasil();
                        }
                        case 3 -> {
                            System.out.println("== Kubus ==");

                            // Mengambil input user
                            System.out.print("Masukan Nilai Sisi : ");
                            sisi = inputUser.nextInt();
                            kubus.setSisi(sisi);

                            // Mencetak hasil
                            kubus.cetakHasil();
                        }

                        default -> System.out.println("Bangun Ruang Tidak Tersedia!");
                    }

                }
                default -> System.out.println("Menu yang anda pilih tidak tersedia! Silahkan pilih menu lain.");
            }

            // Bertanya kepada user untuk mengulangi menu atau tidak
            continueProgram = getYorN("Apakah anda ingin menghitung kembali? ");

        }

        // Menutup object Scanner
        inputUser.close();

    }

    // Method untuk melanjutkan program atau tidak
    public static boolean getYorN(String message) {

        // Membuka Object Scanner untuk memasukkan inputan user
        Scanner terminalInput = new Scanner(System.in);

        // Meminta user untuk mengulangi menu atau tidak
        System.out.println("\n" + message + "(Y/N)");
        String pilihanUser = terminalInput.nextLine();

        // Program apabila user memasukan input selain Y dan N
        while (!pilihanUser.equalsIgnoreCase("Y") && !pilihanUser.equalsIgnoreCase("N")) {

            System.err.println("\n Menu yang anda pilih tidak ada!\n Silahkan pilih Y atau N.");
            System.out.println("\n" + message + "(Y/N)");
            pilihanUser = terminalInput.nextLine();

        }

        // Mengembalikan nilai boolean berdasarkan pilihan user
        return (pilihanUser.equalsIgnoreCase("y"));

    }

}
