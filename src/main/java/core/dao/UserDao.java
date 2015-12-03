package core.dao;


import core.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by employee on 10/27/15.
 */
@Repository
public interface UserDao extends BaseDao <User>{

    User getUserIdByName(String userName);



}


