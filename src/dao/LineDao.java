package dao;

import domain.Line;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Created by Lin on 2017/5/7.
 */
public class LineDao extends HibernateDaoSupport {
    @Resource
    private HibernateTemplate hibernateTemplate;
    public void addLine(Line line){
        hibernateTemplate.save(line);
    }
}
