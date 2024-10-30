import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "subscriptions")
public class Subscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String price;

    public Subscriptions(){
        id = 0;
        user = null;
        price = null;
    }

    public Subscriptions(String price, String user) {
        this.price = price;
        this.user = user;
    }

    public Subscriptions(int id, String user, String price) {
        this.id = id;
        this.user = user;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Subscriptions{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}