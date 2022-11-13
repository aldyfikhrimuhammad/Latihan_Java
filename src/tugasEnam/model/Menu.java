package tugasEnam.model;

import java.util.*;

public class Menu {

    // Instance object Map
    private static HashMap<String, Integer> makanan = new HashMap<String, Integer>();
    private static HashMap<String, Integer> minuman = new HashMap<String, Integer>();
    private static HashMap<String, Integer> paket = new HashMap<String, Integer>();


    // Constructor
    public Menu(){

    }
    public Menu(HashMap<String, Integer> makanan, HashMap<String, Integer> minuman, HashMap<String, Integer> paket) {
        Menu.makanan = makanan;
        Menu.minuman = minuman;
        Menu.paket = paket;
    }


    // Setter
//    public static void setMakanan(HashMap<String, Integer> makanan) {
//        Menu.makanan = makanan;
//    }
//    public static void setMinuman(HashMap<String, Integer> minuman) {
//        Menu.minuman = minuman;
//    }
//    public static void setPaket(HashMap<String, Integer> paket) {
//        Menu.paket = paket;
//    }
    public static void setMakanan(int pilih) {
        int pilihMakanan = pilih;
        switch (pilihMakanan) {
            case 1:
                Menu.makanan.put("Ayam Goreng", 10000);
                break;
            case 2:
                Menu.makanan.put("Ayam Geprek", 13000);
                break;
            case 3:
                Menu.makanan.put("Indomie Rebus/Goreng Komplit", 10000);
                break;
            case 4:
                Menu.makanan.put("Ikan Bakar", 12000);
                break;
        }
    }
    public void setMinuman(HashMap<String, Integer> minuman) {
        Menu.minuman.put("Air Mineral", 5000);
        Menu.minuman.put("Teh       (Panas/Dingin)", 8000);
        Menu.minuman.put("Es Jeruk  (Panas/Dingin)", 10000);
        Menu.minuman.put("Kopi      (Panas/Dingin)", 15000);
    }
    public void setPaket(HashMap<String, Integer> paket) {

        Menu.paket.put("Ayam Goreng Lengkap dan Es Jeruk", 20000);
        Menu.paket.put("Indome Rebus/Goreng dan Teh", 18000);
        Menu.paket.put("Ikan Bakar dan Es Jeruk", 22000);
    }

    // Getter
    public static HashMap<String, Integer> getMakanan() {
        return makanan;
    }
    public static HashMap<String, Integer> getMinuman() {
        return minuman;
    }
    public static HashMap<String, Integer> getPaket() {
        return paket;
    }

    // Method untuk menampilkan daftar menu
    public static void daftarMenu() {
        System.out.println("========== Menu Makanan Sehat ==========");
        System.out.println(getMakanan());
        System.out.println("========== Menu Minuman Cerdas ==========");
        System.out.println(getMinuman());
        System.out.println("========== Menu Paket Bahagia ==========");
        System.out.println(getPaket());

    }

}
