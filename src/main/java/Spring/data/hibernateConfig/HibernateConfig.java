package Spring.data.hibernateConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateConfig {

    public <T> SessionFactory CreateSessionFactory(Class<T> C) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(C);
        return configuration.buildSessionFactory();
    }
}
