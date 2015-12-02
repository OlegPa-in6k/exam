package core.dao;


import core.entity.ServiceType;
import org.springframework.stereotype.Repository;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public interface ServiceTypeDao {

    ServiceType getServiceTypeByName(String serviceTypeName);

}
