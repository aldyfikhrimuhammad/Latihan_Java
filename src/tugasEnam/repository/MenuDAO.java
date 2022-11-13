package tugasEnam.repository;

import tugasEnam.model.Menu;
import tugasEnam.service.DAOService;

import java.util.ArrayList;
import java.util.List;

public class MenuDAO implements DAOService<Menu, Integer> {

    // Instance object List
    List<Menu> menus = new ArrayList<>();

    // Override method from DAOService
    @Override
    public List<Menu> findAll() {
        return menus;
    }
    @Override
    public Menu findById(Integer id) {
        return menus.get(id);
    }
    @Override
    public void save(Menu data) {
        menus.add(data);
    }
    @Override
    public void update(Integer id, Menu data) {
        menus.set(id, data);
    }
    @Override
    public void delete(Integer id) {
        menus.remove((int) id);
    }

}
