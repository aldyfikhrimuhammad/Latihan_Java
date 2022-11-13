package tugasEnamCobaCoba.Repository;

import tugasEnamCobaCoba.Model.Order;
import tugasEnamCobaCoba.Services.PaymentServices;

// Import library
import java.util.*;

public class OrderDao implements PaymentServices<Order, Integer> {

    // Instance List object
    List<Order> order = new ArrayList<>();

    // CRUD method
    @Override
    public List<Order> findAll() {
        return order;
    }
    @Override
    public Order findById(Integer id) {
        return order.get(id);
    }
    @Override
    public void save(Order data) {
    order.add(data);
    }
    @Override
    public void update(Integer id, Order data) {
    }
    @Override
    public void delete(Integer id) {
    }
    @Override
    public void getMenu(int index) {
    }

}
