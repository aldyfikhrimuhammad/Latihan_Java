package tugasEnamCoba.service;
import java.util.ArrayList;
import java.util.List;

import tugasEnamCoba.model.Menu;

public class CashierImp implements Cashier<Menu, Integer> {

        // Instance object List
        List<Menu> menuDao = new ArrayList<>();

        // Override CRUD method
        @Override
        public List<Menu> findAll() {
            return menuDao;
        }
        @Override
        public Menu findById(Integer id) {
            return menuDao.get(id);
        }
        @Override
        public void save(Menu data) {
            menuDao.add(data);
        }
        @Override
        public void update(Integer id, Menu data) {
            menuDao.set(id, data);
        }
        @Override
        public void delete(Integer id) {
            menuDao.remove((int) id);
        }
    }

