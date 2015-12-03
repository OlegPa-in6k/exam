package persistence;

import core.dao.UserDao;
import core.entity.User;
import org.hibernate.Query;

/**
 * Created by employee on 12/2/15.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    public User getUserIdByName(String userName) {
        Query query = startSession().createQuery("From User Where userName Like :userName");
        query.setParameter("userName", userName);
        return (User) query.uniqueResult();
    }
//    select u.UserName, b.billId, sum(s.price)
//    from users u, bill b, orders o, service s
//    where ((u.userId=b.userId)
//    and (o.billId=b.billId)
//    and (o.serviceId = s.serviceId));
}
