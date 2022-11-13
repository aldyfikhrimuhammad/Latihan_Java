package tugasLimaSolution;

import tugasLimaSolution.service.StudentService;
import tugasLimaSolution.service.StudentServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static String opsi = "y";
    static int menu;
    static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        do {
            System.out.println("\n========== SISTEM INFORMASI AKADEMIK ==========");
            System.out.println("1. Registrasi Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Input KRS Mahasiswa");
            System.out.println("4. Lihat Data KRS");
            System.out.print("Pilihan: ");
            menu = in.nextInt();
            in.nextLine();

            switch (menu) {
                case 1:
                    while (opsi.equals("y")) {
                        System.out.println("\n========== REGISTRASI ==========");
                        System.out.print("Masukkan nama depan: ");
                        String namaDepan = in.nextLine();
                        System.out.print("Masukkan nama belakang: ");
                        String namaBelakang = in.nextLine();
                        System.out.print("Masukkan alamat: ");
                        String alamat = in.nextLine();

                        studentService.studentRegistration(namaDepan, namaBelakang, alamat);

                        System.out.print("Ingin menambahkan data mahasiswa lain? (y / n): ");
                        opsi = in.nextLine().toLowerCase();
                    }
                    opsi = "y";
                    break;

                case 2:
                    System.out.println("\n========== DATA MAHASISWA ==========");
                    studentService.getStudents();
                    break;

                case 3:
                    while (opsi.equals("y")) {
                        System.out.println("\n========== INPUT DATA KRS ==========");
                        System.out.print("Masukkan nomor index mahasiswa: ");
                        int index = in.nextInt();
                        in.nextLine();
                        studentService.getStudent(index);
                        System.out.print("Masukkan mata kuliah: ");
                        String matkul = in.nextLine();
                        System.out.print("Masukkan bobot sks: ");
                        int sks = in.nextInt();
                        in.nextLine();
                        System.out.print("Masukkan ruangan: ");
                        String ruangan = in.nextLine();

                        studentService.learningPlan(matkul, sks, ruangan, index);
                        System.out.println(index);
                        System.out.print("Ingin menambahkan data krs lain? (y / n): ");
                        opsi = in.nextLine().toLowerCase();
                    }
                    opsi = "y";
                    break;

                case 4:
                    while (opsi.equals("y")) {
                        System.out.println("\n========== LIHAT DATA KRS ==========");
                        System.out.print("Masukkan nomor index mahasiswa: ");
                        int index = in.nextInt();
                        in.nextLine();
                        studentService.getStudent(index);
                        System.out.println("Total SKS: " + studentService.getTotalSks(index));
                        studentService.getSchedule(index);

                        System.out.print("Ingin melihat data krs lain? (y / n): ");
                        opsi = in.nextLine().toLowerCase();
                    }
                    opsi = "y";
                    break;

                default:
                    System.out.println("Silahkan input ulang.\n");
                    break;
            }

            System.out.print("\nApakah ingin menjalankan program ulang? (y / n): ");
            opsi = in.nextLine();
        } while (opsi.equalsIgnoreCase("y"));
    }
}