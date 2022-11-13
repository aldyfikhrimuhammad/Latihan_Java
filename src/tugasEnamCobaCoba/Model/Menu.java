package tugasEnamCobaCoba.Model;

public class Menu {

    // Variabel yang digunakan
    private String makanan, minuman, paket, harga, total;

    // Default constructor
    public Menu (){};

    // Constructor
    public Menu(String makanan, String minuman, String harga) {
        this.makanan = makanan;
        this.minuman = minuman;
        this.harga = harga;
    }

    // Setter
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    public void setPaket(String paket) {
        this.paket = paket;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
    public void setTotal(String makanan, String minuman, String total) {
        this.makanan = makanan;
        this.minuman = minuman;
        this.total = total;
    }

    // Getter
    public String getMakanan() {
        return makanan;
    }
    public String getMinuman() {
        return minuman;
    }
    public String getPaket() {
        return paket;
    }
    public String getHarga() {
        return harga;
    }
    public String getTotal() {
        return total;
    }

    // Method untuk menampilkan daftar menu
    public void daftarMenu() {
        System.out.println("""

                    ========== Menu Makanan Sehat ==========\s
                    1. Ayam Goreng              -- Rp 12000
                    2. Ikan Bakar               -- Rp 18000
                    3. Sop Iga                  -- Rp 15000
                    4. Sate Kambing             -- Rp 25000"""
        );

        System.out.println("""

                    ========== Menu Minuman Cerdas ==========\s
                    1. Teh Manis                -- Rp 8000
                    2. Es Jeruk                 -- Rp 10000
                    3. Kopi Susu                -- Rp 12000
                    4. Air Mineral              -- Rp 5000"""
        );
        System.out.println("""

                    ========== Menu Paket Bahagia ==========\s
                    1. Paket Lengkap Ayam       -- Rp 20000
                    2. Paket Lengkap Ikan       -- Rp 28000
                    3. Paket Campur 1           -- Rp 30000
                    4. Paket Campur 2           -- Rp 28000"""
        );

    }

        // Method cetak pesanan
    @Override
    public String toString(){
        return "Menu [Makanan=" + makanan + harga + ",Minuman=" + minuman + harga+"]";
    }
}
