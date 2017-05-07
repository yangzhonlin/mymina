import domain.Line;
import domain.Point;
import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;


/**
 * Created by Lin on 2017/5/7.
 */
public class HibernateTest {
    private  SessionFactory sessionFactory;
    private  Session session;
    private Transaction transaction;
    @Before
    public void initial(){
        Configuration configure = new Configuration().configure();
        ServiceRegistry registry  = new ServiceRegistryBuilder().applySettings(configure.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configure.buildSessionFactory(registry);
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }

    @Test
    public void test01(){
        transaction.begin();
        Line line = new Line();
        User user = new User();
        user.setUserName("张三");
        user.setPassword("xxxx");

        line.setUser(user);
        session.saveOrUpdate(user);
        session.saveOrUpdate(line);

        Point point = new Point();

        point.setX(120);
        point.setY(23);
        point.setTimestamp(new Date());
        point.setLine(line);

        session.saveOrUpdate(point);

    }

    @After
    public void destroy(){
        transaction.commit();
        session.close();
    }
}
