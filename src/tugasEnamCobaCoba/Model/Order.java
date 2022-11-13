package tugasEnamCobaCoba.Model;

public class Order {

    // Variabel yang digunakan
    private Integer pesanan, totalPesanan;

    // Default constructor
    public Order(){
    }

    // Constructor
    public Order(Integer pesanan, Integer totalPesanan) {
        this.pesanan = pesanan;
        this.totalPesanan = totalPesanan;
    }

    // Setter
    public void setPesanan(Integer pesanan) {
        this.pesanan = pesanan;
    }
    public void setTotalPesanan(Integer totalPesanan) {
        this.totalPesanan = totalPesanan;
    }

    // Getter
    public Integer getPesanan() {
        return pesanan;
    }
    public Integer getTotalPesanan() {
        return totalPesanan;
    }

}
