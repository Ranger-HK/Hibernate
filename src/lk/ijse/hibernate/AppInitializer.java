package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Student;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Created By Ravindu Prathibha
 * @created 2/12/2024 - 5:10 PM
 * @project Hibernate
 */
public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Ravindu");
        customer.setAddress("Bandaragama");
        customer.setSalary(500000);

        customer.setId("C002");
        customer.setName("Prathibha");
        customer.setAddress("Kadawtha");
        customer.setSalary(1000000);

        Student student = new Student();
        student.setId("S001");
        student.setName("Kamal");
        student.setAddress("Colombo");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.update(customer);
        session.save(student);

       /* session.update(customer);
        Customer c1 = session.get(Customer.class, "C001");
        System.out.println(c1);
        System.out.println(c1.getName());*/



        transaction.commit();
        session.close();
    }
}
