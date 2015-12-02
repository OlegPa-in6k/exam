package core.dao;


import core.entity.User;

/**
 * Created by employee on 10/27/15.
 */

public interface UserDao extends BaseDao <User>{

    User getUserIdByName(String userName);



}


