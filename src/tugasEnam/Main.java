package tugasEnam;

import tugasLimaSolution.service.StudentService;
import tugasLimaSolution.service.StudentServiceImpl;

import tugasEnam.service.MenuService;
import tugasEnam.service.MenuServiceImp;
import tugasEnam.service.DAOService;
import tugasEnam.model.Menu;
import tugasEnam.model.User;
import tugasEnam.repository.MenuDAO;
import tugasEnam.repository.UserDAO;

import java.util.Scanner;

public class Main {
    private static DAOService<Menu, Integer> menuDAO;
    static Scanner inputUser = new Scanner(System.in);
    static String opsi = "y";
    static int menu;
    static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {

        // instance repository
        menuDAO = new MenuDAO();

        do {
            System.out.println("\n========== Warung Sehat, Cerdas, dan Bahagia ==========");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Pemesanan");
            System.out.println("3. Pembayaran");
            System.out.print("Pilihan : ");
            menu = inputUser.nextInt();
            inputUser.nextLine();

            switch (menu) {
                case 1 -> {
                        System.out.println("\n========== DAFTAR MENU ==========");
                    Menu.daftarMenu();
                }
                case 2 -> {
                    while (opsi.equals("y")) {
                        System.out.println("\n========== PEMESANAN ==========");
                        System.out.print("Makanan       : ");
                        int index = inputUser.nextInt();
                        inputUser.nextLine();
                        Menu.setMakanan(index);
                        System.out.print("Masukkan mata kuliah: ");
                        String matkul = inputUser.nextLine();
                        System.out.print("Masukkan bobot sks: ");
                        int sks = inputUser.nextInt();
                        inputUser.nextLine();
                        System.out.print("Masukkan ruangan: ");
                        String ruangan = inputUser.nextLine();

                        studentService.learningPlan(matkul, sks, ruangan, index);
                        System.out.println(index);
                        System.out.print("Ingin menambahkan data krs lain? (y / n): ");
                        opsi = inputUser.nextLine().toLowerCase();
                    }
                    opsi = "y";
                }
                case 3 -> {
                    while (opsi.equals("y")) {
                        System.out.println("\n========== INPUT DATA KRS ==========");
                        System.out.print("Masukkan nomor index mahasiswa: ");
                        int index = inputUser.nextInt();
                        inputUser.nextLine();
                        studentService.getStudent(index);
                        System.out.print("Masukkan mata kuliah: ");
                        String matkul = inputUser.nextLine();
                        System.out.print("Masukkan bobot sks: ");
                        int sks = inputUser.nextInt();
                        inputUser.nextLine();
                        System.out.print("Masukkan ruangan: ");
                        String ruangan = inputUser.nextLine();

                        studentService.learningPlan(matkul, sks, ruangan, index);
                        System.out.println(index);
                        System.out.print("Ingin menambahkan data krs lain? (y / n): ");
                        opsi = inputUser.nextLine().toLowerCase();
                    }
                    opsi = "y";
                }
                default -> System.out.println("Silahkan masukan kembali pesanan anda.\n");
            }

            System.out.print("\nApakah anda inginmemesan kembali?? (y / n): ");
            opsi = inputUser.nextLine();
        } while (opsi.equalsIgnoreCase("y"));
    }
}
