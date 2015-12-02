package core.dao;

import core.entity.Bill;


import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public interface BillDao extends BaseDao<Bill>{

    List getBillsByUserId(int userId);

}
