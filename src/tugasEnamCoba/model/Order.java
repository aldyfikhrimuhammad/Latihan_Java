package tugasEnamCoba.model;

public class Order extends Menu {

    // Variabel yang digunakan
    private int order, totalHarga;

    // Default constructor
    public Order(){
    }

    // Constructor
    public Order(int order){
        this.order = order;
    }

    // Setter
    public void setOrder(int order) {
        this.order = order;
    }
    public void setTotalHarga(int totalHarga) {
        totalHarga = this.totalHarga += getTotalPesanan();
    }
    @Override
    public void setHarga(Integer harga) {
        super.setHarga(harga);
    }
    @Override
    public void setMenu(String menu) {
        super.setMenu(menu);
    }

    // Getter
    public int getOrder(){
        return this.order;
    }
    public int getTotalHarga() {
        return totalHarga;
    }
    @Override
    public String getMenu() {
        return super.getMenu();
    }
    @Override
    public Integer getHarga() {
        return super.getHarga();
    }
}
