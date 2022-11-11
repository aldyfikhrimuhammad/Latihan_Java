package tugasLimaReference;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static String opsi;
    static int menu;
    static Student s = new Student();

    public static void main(String[] args) {
        do {
            System.out.println("Program Sistem Informasi Akademik");
            System.out.println("1. Registrasi Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Input KRS Mahasiswa");
            System.out.println("4. Lihat Data KRS");
            System.out.print("Pilihan: ");
            menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("========== REGISTRASI ==========");
                    System.out.print("Masukkan nama depan: ");
                    String namaDepan = in.nextLine();
                    System.out.print("Masukkan nama belakang: ");
                    String namaBelakang = in.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = in.nextLine();
                    s.studentRegistration(namaDepan, namaBelakang, alamat);
                }
                case 2 -> {
                    System.out.println("========== DATA MAHASISWA ==========");
                    System.out.println("Nama lengkap: " + s.getFullname());
                    System.out.println("Alamat: " + s.getAddress());
                }
                case 3 -> {
                    System.out.println("========== INPUT DATA KRS ==========");
                    System.out.print("Masukkan mata kuliah: ");
                    String matkul = in.nextLine();
                    System.out.print("Masukkan bobot sks: ");
                    int sks = in.nextInt();
                    in.nextLine();
                    System.out.print("Masukkan ruangan: ");
                    String ruangan = in.nextLine();
                    s.learningPlan(matkul, sks, ruangan);
                }
                case 4 -> {
                    System.out.println("========== LIHAT DATA KRS ==========");
                    System.out.println("Total SKS: " + s.getTotalSks());
                    s.getSchedule();
                }
                default -> System.out.println("Silahkan input ulang.");
            }

            System.out.print("Apakah ingin menjalankan program ulang? ");
            opsi = in.nextLine();
        } while (opsi.equalsIgnoreCase("y"));
    }
}