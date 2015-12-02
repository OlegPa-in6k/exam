package persistence;

import core.dao.ServiceTypeDao;
import core.entity.ServiceType;


import org.hibernate.Query;

/**
 * Created by employee on 12/2/15.
 */
public class ServiceTypeImpl extends BaseDaoImpl<ServiceType> implements ServiceTypeDao {
    @Override
    public ServiceType getServiceTypeByName(String serviceTypeName) {
        Query query = startSession().createQuery("from serviceType where serviceTypeName Like :serviceTypeName");
        query.setParameter("serviceTypeName", serviceTypeName);
        return (ServiceType) query.uniqueResult();
    }

}
