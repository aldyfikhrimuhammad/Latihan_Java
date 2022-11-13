package tugasEnamCobaCoba.Services;


import tugasEnamCobaCoba.Model.Menu;

// Import library
import java.util.*;

public interface PaymentServices<T, K> {

    // CRUD method
    List<T> findAll();
    T findById (K id);
    void save (T data);
    void update (K id, T data);
    void delete (K id);
    void getMenu(int index);

    default void recieptPembayaran(int index) {
    }
}
