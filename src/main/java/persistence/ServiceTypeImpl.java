package persistence;

import core.dao.ServiceTypeDao;
import core.entity.ServiceType;


import org.hibernate.Query;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class ServiceTypeImpl extends BaseDaoImpl<ServiceType> implements ServiceTypeDao {
    @Override
    public ServiceType getServiceTypeByName(String serviceTypeName) {
        Query query = startSession().createQuery("from ServiceType where serviceTypeName Like :serviceTypeName");
        query.setParameter("serviceTypeName", serviceTypeName);
        return (ServiceType) query.uniqueResult();
    }

    @Override
    public List<ServiceType> getUserServiceTypes(int  userId) {
        Query query = startSession().createSQLQuery("select st.serviceTypeId, st.serviceTypeName from  " +
                "bill b, orders o, serviceType st, service s " +
                "where b.userId = userId and b.billId=o.billId and" +
                " o.serviceId = s.serviceId and" +
                " s.serviceTypeId = st.serviceTypeId" +
                " group by serviceTypeName");
        return query.list();
    }


}
