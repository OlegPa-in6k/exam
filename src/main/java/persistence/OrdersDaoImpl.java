package persistence;

import core.dao.OrdersDao;
import core.entity.Orders;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class OrdersDaoImpl extends BaseDaoImpl<Orders> implements OrdersDao {
    @Override
    public List<Orders> getOrdersByBillId(int billId) {
        Query query = startSession().createQuery("From orders Where billId Like :billId");
        query.setParameter("billId", billId);
        return (List<Orders>) query.uniqueResult();
    }

    @Override
    public List<Orders> getOrdersByServiceId(int serviceId) {
        Query query = startSession().createQuery("From orders Where serviceId Like :serviceId");
        query.setParameter("serviceId", serviceId);
        return (List<Orders>) query.uniqueResult();
    }

}
