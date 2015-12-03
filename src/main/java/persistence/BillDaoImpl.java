package persistence;

import core.dao.BillDao;
import core.entity.Bill;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class BillDaoImpl extends BaseDaoImpl<Bill> implements BillDao {

    @SuppressWarnings("Uncheked")
    @Override
    public List<Bill> getBillsByUserId(int userId) {

        Query query = startSession().createQuery("FROM User WHERE  userId = :userId");
        query.setParameter("userId", userId);

        return query.list();
    }

}
