package core.dao;


/**
 * Created by employee on 12/2/15.
 */

import core.entity.Service;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDao {

    Service getServiceByName(String serviceName);

    List<Service> getServiceByPrice(int price);

}
