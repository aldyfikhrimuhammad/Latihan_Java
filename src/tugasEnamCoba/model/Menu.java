package tugasEnamCoba.model;

public class Menu{

    // Variabel yang digunakan
    protected static String menu;
    protected static Integer harga;


    // Default constructor
    public Menu(){

    }

    // Constructor
    public Menu(String menu, Integer harga) {
        Menu.menu = menu;
        Menu.harga = harga;
    }

    // Getter
    public String getMenu() {
        return Menu.menu;
    }
    public Integer getHarga() {
        return Menu.harga;
    }

    // Setter
    public void setMenu(String menu) {
        Menu.menu = menu;
    }
    public void setHarga(Integer harga) {
        Menu.harga = harga;
    }

    // Method cetak ke String
    @Override
    public String toString() {
        return menu + "     -       Rp " + harga + "\n";
    }
}