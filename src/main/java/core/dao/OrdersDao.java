package core.dao;

import core.entity.Orders;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public interface OrdersDao {
    List<Orders> getOrdersByBillId(int billId);

    List<Orders> getOrdersByServiceId(int serviceId);

}
