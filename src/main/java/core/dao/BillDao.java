package core.dao;

import core.entity.Bill;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public interface BillDao extends BaseDao<Bill> {

    List getBillsByUserId(int userId);


}
