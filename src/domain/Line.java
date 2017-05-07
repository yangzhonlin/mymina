package domain;


import java.util.Date;
import java.util.List;

/**
 * Created by Lin on 2017/5/7.
 */
public class Line {
    private int id;
    private List<Point> points;
    private Date createDate;
    private User user;

    public Line() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
