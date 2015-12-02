package core.entity;



import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "Users")
public class User {


    @Id
    @GeneratedValue
    @Column(name = "userId")
    private int userId;

    @Column(name = "userName")
    private String userName;


    public User() {}

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
