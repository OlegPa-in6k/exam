package core.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by employee on 12/2/15.
 */
public class Bill {

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    public Bill () {}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
