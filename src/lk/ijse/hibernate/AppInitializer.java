package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
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


        Name name1 = new Name();
        name1.setfName("Don");
        name1.setmName("Ranasuriya");
        name1.setlName("Arachchige");

        Name name2 = new Name();
        name2.setfName("Kapuge");
        name2.setmName("Bandara");
        name2.setlName("Rathnayaka");


        Student student = new Student();

        student.setId("S001");
        student.setName(name1);
        student.setAddress("Colombo");

        student.setId("S002");
        student.setName(name2);
        student.setAddress("Nawala");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(customer);
        session.save(student);

        session.update(customer);
        session.update(student);

        Customer c1 = session.get(Customer.class, "C001");
        System.out.println(c1);

        Customer c2 = session.get(Customer.class, "C002");
        System.out.println(c2);

        Student s1 = session.get(Student.class, "S001");
        System.out.println(s1);

        Student s2 = session.get(Student.class, "S002");
        System.out.println(s2);

       /* session.update(customer);
        Customer c1 = session.get(Customer.class, "C001");
        System.out.println(c1);
        System.out.println(c1.getName());*/



        transaction.commit();
        session.close();
    }
}
