package tugasEnamCoba.service;

import java.util.List;

public interface Cashier<T, K> {

    // CRUD methods
    List<T> findAll();
    T findById(K id);
    void save(T data);
    void update(K id, T data);
    void delete(K id);
}
