package tugasEnam.service;

import java.util.List;

public interface MenuService<T, K> {

    // CRUD METHODS
    List<T> findAll();
    T findById(K id);
    void save(T data);
    void update(K id, T data);
    void delete(K id);

}
