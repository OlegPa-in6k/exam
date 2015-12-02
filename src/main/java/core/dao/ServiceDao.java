package core.dao;



/**
 * Created by employee on 12/2/15.
 */

import core.service.UserService;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDao {

    UserService getServiceByName(String serviceName);

}
