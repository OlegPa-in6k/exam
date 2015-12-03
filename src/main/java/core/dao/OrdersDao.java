package core.dao;

import core.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public interface OrdersDao {
    List<Orders> getOrdersByBillId(int billId);

    List<Orders> getOrdersByServiceId(int serviceId);

}
