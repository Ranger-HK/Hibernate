package lk.ijse.hibernate.utill;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Created By Ravindu Prathibha
 * @created 2/12/2024 - 5:17 PM
 * @project Hibernate
 */
public class FactoryConfiguration {
        private static FactoryConfiguration factoryConfiguration;
        private SessionFactory sessionFactory;

        private FactoryConfiguration(){
            Configuration configuration = new Configuration().configure()
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Student.class);;
            sessionFactory=configuration.buildSessionFactory();

        }

        public static FactoryConfiguration getInstance(){
            return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                    : factoryConfiguration;
        }

        public Session getSession(){
            return sessionFactory.openSession();
        }
}

