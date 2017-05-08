package domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Lin on 2017/5/8.
 */
@Entity
@Table(name = "points")
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private double x;
    @Column
    private double y;
    @Column
    private String sequence;
    @Column
    private Date time;
    @ManyToOne(targetEntity = User.class)
    private  User user;

    public Points(double x, double y, String sequence, Date time) {
        this.x = x;
        this.y = y;
        this.sequence = sequence;
        this.time = time;
    }

    public Points() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
