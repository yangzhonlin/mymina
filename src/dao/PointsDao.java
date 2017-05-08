package dao;

import domain.Points;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Lin on 2017/5/8.
 */
public class PointsDao extends HibernateDaoSupport {

    public List<Points> findPoints(String sequence){
        return getHibernateTemplate().find("from Points where sequence =?",sequence);
    }

    public void addPoint(Points points){
        getHibernateTemplate().save(points);
    }
}
