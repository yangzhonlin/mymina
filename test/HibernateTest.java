
import domain.Points;
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

import java.util.*;


/**
 * Created by Lin on 2017/5/7.
 */
public class HibernateTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void initial() {
        Configuration configure = new Configuration().configure();
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configure.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configure.buildSessionFactory(registry);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @Test
    public void test01() {
        User user  = new User();
        user.setUserName("張三");
        user.setPassword("xxxx");
        session.save(user);
        String s = UUID.randomUUID().toString().replace("-","");
        Points points1 = new Points(120.123, 22.32, s, new Date());
        points1.setUser(user);

        Points points2 = new Points(120.223, 22.42, s, new Date());
        points2.setUser(user);
        Points points3 = new Points(120.153, 22.48, s, new Date());
        points3.setUser(user);
        session.save(points1);
        session.save(points2);
        session.save(points3);
    }

    @Test
    public void test02() {

    }

    @Test
    public void test03(){

    }
    @After
    public void destroy() {
        transaction.commit();
        session.close();
    }
}
