package tugasEnamCoba;

import java.util.Scanner;

import tugasEnamCoba.service.Cashier;
import tugasEnamCoba.service.CashierImp;
import tugasEnamCoba.model.Menu;

public class Main {

    // Instance object dan variabel yang dibutuhkan
    private static Cashier<Menu, Integer> makananDao;
    private static Cashier<Menu, Integer> minumanDao;
    private static Cashier<Menu, Integer> paketDao;
    static Scanner inputUser = new Scanner(System.in);
    static Integer opsi;
    String lanjutkanProgram = "y";

    public void chooseOption() {

        // Main Menu
        System.out.println("""
                    \n========== Warung Sehat, Cerdas, dan Bahagia ==========\s
                    1. Daftar Menu
                    2. Pemesanan
                    3. Pembayaran"""
        );

        // Mengambil input user
        System.out.print("Pilih Menu : ");
        opsi = inputUser.nextInt();
        inputUser.nextLine();
    }

    public static void main(String[] args) {

        // Instance object yang diperlukan
        Main main = new Main();
        makananDao = new CashierImp();
        minumanDao = new CashierImp();
        paketDao = new CashierImp();

        // Input data makanan sebagai menu
        Menu makanan = new Menu("Ayam Goreng", 12000);
        makananDao.save(makanan);
        makanan = new Menu("Ikan Bakar", 18000);
        makananDao.save(makanan);
        makanan = new Menu("Sop Iga", 15000);
        makananDao.save(makanan);
        makanan = new Menu("Sate Kambing", 25000);
        makananDao.save(makanan);
        System.out.println(makananDao.findAll());

        // Input data minuman sebagai menu
        Menu minuman = new Menu("Teh Manis", 8000);
        minumanDao.save(minuman);
        minuman = new Menu("Es Jeruk", 10000);
        minumanDao.save(minuman);
        minuman = new Menu("Kopi Susu", 12000);
        minumanDao.save(minuman);
        minuman = new Menu("Air Mineral", 5000);
        minumanDao.save(minuman);
        System.out.println(minumanDao.findAll());

        // Input data paket sebagai menu
        Menu paket = new Menu("Paket Lengkap Ayam", 20000);
        paketDao.save(paket);
        paket = new Menu("Paket Lengkap Ikan", 28000);
        paketDao.save(paket);
        paket = new Menu("Paket Campur 1", 30000);
        paketDao.save(paket);
        paket = new Menu("Paket Campur 2", 28000);
        paketDao.save(paket);
        System.out.println(paketDao.findAll());

        do {
            main.chooseOption();
            switch (opsi) {

                // Menampilkan daftar menu
                case 1 -> {
                    System.out.println("\n========== DAFTAR MENU ==========");

                    System.out.println("\n========== Menu Makanan Sehat ==========");
                    int i = 0;
                    for (Menu makananMenu : makananDao.findAll()) {
                        i++;
                        System.out.println(i + ". " + makananMenu);
                    }

                    System.out.println("\n========== Menu Minuman Cerdas ==========");
                    int j = 0;
                    for (Menu minumanMenu : minumanDao.findAll()) {
                        j++;
                        System.out.println(j + ". " + minumanMenu);
                    }

                    System.out.println("\n========== Menu Paket Bahagia ==========");
                    int k = 0;
                    for (Menu paketMenu : paketDao.findAll()) {
                        k++;
                        System.out.println(k + ". " + paketMenu);
                    }
                }
                case 2 -> {

                    // Menampilkan menu pemesanan
                    while (main.lanjutkanProgram.equals("y")) {
                        System.out.println("""
                    ========== PEMESANAN ==========\s
                    1. Makanan
                    2. Minuman
                    3. Paket"""
                        );

                        System.out.print("Pilih Menu : ");
                        int pilihMenu = inputUser.nextInt();
                        inputUser.nextLine();

                        // Menampilkan pilihan menu yang dapat dipesan
                        switch (pilihMenu) {
                            case 1 -> {

                                while (main.lanjutkanProgram.equals("y")) {
                                    System.out.println("\n========== Menu Makanan Sehat ==========");
                                    int a = 0;
                                    for (Menu makananMenu : makananDao.findAll()) {
                                        a++;
                                        System.out.println(a + ". " + makananMenu);
                                    }

                                    System.out.print("Ingin menambahkan menu lain? (y / n): ");
                                    main.lanjutkanProgram = inputUser.nextLine().toLowerCase();
                                }
                            }
                            case 2 -> {

                                while (main.lanjutkanProgram.equals("y")) {
                                    System.out.println("\n========== Menu Minuman Cerdas ==========");
                                    int b = 0;
                                    for (Menu minumanMenu : minumanDao.findAll()) {
                                        b++;
                                        System.out.println(b + ". " + minumanMenu);
                                    }

                                    System.out.print("Ingin menambahkan menu lain? (y / n): ");
                                    main.lanjutkanProgram = inputUser.nextLine().toLowerCase();
                                }
                            }
                            case 3 -> {

                                while (main.lanjutkanProgram.equals("y")) {
                                    System.out.println("\n========== Menu Paket Bahagia ==========");
                                    int c = 0;
                                    for (Menu paketMenu : paketDao.findAll()) {
                                        c++;
                                        System.out.println(c + ". " + paketMenu);
                                    }

                                    System.out.print("Ingin menambahkan menu lain? (y / n): ");
                                    main.lanjutkanProgram = inputUser.nextLine().toLowerCase();
                                }
                            }
                            default -> System.out.println("Menu tidak tersedia!");
                        }
                    }
                    main.lanjutkanProgram = "y";
                }
                case 3 -> {
                    System.out.println("\n========== PEMBAYARAN ==========");
                }
                default -> {
                }
            }
        } while ((main.lanjutkanProgram.equalsIgnoreCase("y")));

    }
}
