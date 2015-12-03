package core.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "bill")
public class Bill {


    @Id
    @GeneratedValue
    @Column(name = "billId")
    private int billId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    public Bill() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }


}
