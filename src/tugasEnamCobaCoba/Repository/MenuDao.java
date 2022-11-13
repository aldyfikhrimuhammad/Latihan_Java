package tugasEnamCobaCoba.Repository;

import tugasEnamCobaCoba.Model.Menu;
import tugasEnamCobaCoba.Services.PaymentServices;

// Import library
import java.util.*;

public class MenuDao implements PaymentServices<Menu,Integer> {

    // Instance List object
    List<Menu> menu = new ArrayList<>();

    // CRUD method
    @Override
    public List<Menu> findAll() {
        return menu;
    }
    @Override
    public Menu findById(Integer id) {
        return menu.get(id);
    }
    @Override
    public void save(Menu data) {
        menu.add(data);
    }
    @Override
    public void update(Integer id, Menu data) {
        menu.set(id, data);
    }
    @Override
    public void delete(Integer id) {
        menu.remove(id);
    }
    @Override
    public void getMenu(int index) {

    }

}
