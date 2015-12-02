package persistence;

import core.dao.ServiceDao;
import core.entity.Service;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class ServiceDaoImpl extends BaseDaoImpl<Service> implements ServiceDao {
    @Override
    public Service getServiceByName(String serviceName) {
        Query query = startSession().createQuery("From service Where serviceName Like :serviceName");
        query.setParameter("serviceName", serviceName);
        return (Service) query.uniqueResult();
    }

    @Override
    public List<Service> getServiceByPrice(int price) {
        Query query = startSession().createQuery("From service Where price Like :price");
         query.setParameter("price", price);
        return (List<Service>) query.uniqueResult();

    }

}
