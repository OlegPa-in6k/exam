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
}
