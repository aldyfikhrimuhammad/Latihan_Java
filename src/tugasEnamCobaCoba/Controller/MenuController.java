package tugasEnamCobaCoba.Controller;

import tugasEnamCobaCoba.Model.Menu;
import tugasEnamCobaCoba.Model.Order;
import tugasEnamCobaCoba.Repository.MenuDao;
import tugasEnamCobaCoba.Repository.OrderDao;
import tugasEnamCobaCoba.Services.PaymentServices;
import tugasLimaSolution.service.StudentService;
import tugasLimaSolution.service.StudentServiceImpl;

// Import library
import java.util.*;

public class MenuController {

    // Variabel yang digunakan
    private static PaymentServices<Menu, Integer> menuDao;
    private static PaymentServices<Order, Integer> orderDao;
    static Scanner inputUser = new Scanner(System.in);
    static String opsi = "y";
    static int menuApp;

    public static void main(String[] args) {

        // instance repository
        menuDao = new MenuDao();
        orderDao = new OrderDao();

        // Inisialisasi object
        Menu menu = new Menu();

        Order order = new Order(0, 0);
        orderDao.save(order);

        do {
            // Main Menu
            System.out.println("""

                    \n========== Warung Sehat, Cerdas, dan Bahagia ==========\s
                    1. Daftar Menu
                    2. Pemesanan
                    3. Pembayaran"""
            );

            // Mengambil input user
            System.out.print("Pilih Menu : ");
            menuApp = inputUser.nextInt();
            inputUser.nextLine();

            switch (menuApp) {
                case 1 -> {
                        System.out.println("\n========== DAFTAR MENU ==========");
                        menu.daftarMenu();
                }
                case 2 -> {
                    while (opsi.equals("y")) {
                        System.out.println("""
                    ========== PEMESANAN ==========\s
                    1. Makanan
                    2. Minuman
                    3. Paket"""
                        );
                        System.out.print("Pilih Menu : ");
                        int pilihMenu = inputUser.nextInt();
                        inputUser.nextLine();

                        switch (pilihMenu) {
                            case 1 -> {
                                System.out.println("""
                    ========== Menu Makanan Sehat ==========\s
                    1. Ayam Goreng              -- Rp 12000
                    2. Ikan Bakar               -- Rp 18000
                    3. Sop Iga                  -- Rp 15000
                    4. Sate Kambing             -- Rp 25000"""
                                );

                                // Mengambil input user
                                System.out.print("Pilih Makanan : ");
                                int index = inputUser.nextInt();
                                inputUser.nextLine();
                                menu.setMakanan(String.valueOf(index));

                                // Save data pesanan
                                menuDao.save(menu);

                                menuDao.getMenu(0);
                                System.out.println(menuDao.findAll());

                                System.out.println(index);
                                System.out.print("Ingin menambahkan menu lain? (y / n): ");
                                opsi = inputUser.nextLine().toLowerCase();
                            }
                            case 2 -> {
                                System.out.println("""

                    ========== Menu Minuman Cerdas ==========\s
                    1. Teh Manis                -- Rp 8000
                    2. Es Jeruk                 -- Rp 10000
                    3. Kopi Susu                -- Rp 12000
                    4. Air Mineral              -- Rp 5000"""
                                );

                            }
                            case 3 -> {
                                System.out.println("""

                    ========== Menu Paket Bahagia ==========\s
                    1. Paket Lengkap Ayam       -- Rp 20000
                    2. Paket Lengkap Ikan       -- Rp 28000
                    3. Paket Campur 1           -- Rp 30000
                    4. Paket Campur 2           -- Rp 28000"""
                                );

                            }

                            default -> System.out.println("Menu tidak tersedia!");
                        }

                    }
                    opsi = "y";
                }

                case 3 -> {
                    while (opsi.equals("y")) {
                        System.out.println("\n========== PEMBAYARAN ==========");
                        System.out.print("Masukkan nomor index mahasiswa: ");
                        int index = inputUser.nextInt();
                        inputUser.nextLine();
//                        studentService.getStudent(index);
                        System.out.print("Masukkan mata kuliah: ");
                        String matkul = inputUser.nextLine();
                        System.out.print("Masukkan bobot sks: ");
                        int sks = inputUser.nextInt();
                        inputUser.nextLine();
                        System.out.print("Masukkan ruangan: ");
                        String ruangan = inputUser.nextLine();

//                        studentService.learningPlan(matkul, sks, ruangan, index);
                        System.out.println(index);
                        System.out.print("Ingin menambahkan data krs lain? (y/n): ");
                        opsi = inputUser.nextLine().toLowerCase();
                    }
                    opsi = "y";
                }
                default -> System.out.println("Silahkan pilih menu yang tersedia!.\n");
            }

            System.out.print("\nApakah ingin melanjutkan program? (y/n): ");
            opsi = inputUser.nextLine();
        } while (opsi.equalsIgnoreCase("y"));

    }
}