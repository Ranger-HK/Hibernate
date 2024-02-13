package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.*;
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

        //Customer
        Customer customer = new Customer();

        customer.setId("C001");
        customer.setName("Ravindu");
        customer.setAddress("Bandaragama");
        customer.setSalary(500000);

        customer.setId("C002");
        customer.setName("Prathibha");
        customer.setAddress("Kadawtha");
        customer.setSalary(1000000);


        //Name - Student
        Name name1 = new Name();
        name1.setfName("Don");
        name1.setmName("Ranasuriya");
        name1.setlName("Arachchige");

        Name name2 = new Name();
        name2.setfName("Kapuge");
        name2.setmName("Bandara");
        name2.setlName("Rathnayaka");


        //Student
        Student student = new Student();

        student.setId("S001");
        student.setName(name1);
        student.setAddress("Colombo");

        student.setId("S002");
        student.setName(name2);
        student.setAddress("Nawala");


        //Person
        Person person = new Person();

        person.setId("P001");
        person.setName("Nimal");

        person.setId("P002");
        person.setName("Kumara");


        //Passport
        Passport passport = new Passport();

        passport.setPsId("PS001");
        passport.setFee(2500);
        passport.setPerson(person);

        passport.setPsId("PS002");
        passport.setFee(5500);
        passport.setPerson(person);


        //Owner
        Owner owner = new Owner();
        owner.setoId("O-001");
        owner.setName("Sukumali");


        //Pet1
        Pet pet1 = new Pet();
        pet1.setpId("P-001");
        pet1.setpName("Cat");


        //Pet1
        Pet pet2 = new Pet();
        pet2.setpId("P-002");
        pet2.setpName("Cat");

        //Owner List
        owner.getPetList().add(pet1);
        owner.getPetList().add(pet2);

        //Pet Object
        pet1.setOwner(owner);
        pet2.setOwner(owner);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        //session.save(customer);
        //session.save(student);
        //session.save(person);
        //session.save(passport);
        //session.save(owner);
        //session.save(pet1);
        //session.save(pet2);


        session.update(customer);
        session.update(student);
        session.update(person);
        session.update(passport);
        session.update(owner);
        session.update(pet1);
        session.update(pet2);


        //Customer
        Customer c1 = session.get(Customer.class, "C001");
        System.out.println(c1);
        Customer c2 = session.get(Customer.class, "C002");
        System.out.println(c2);

        //Student
        Student s1 = session.get(Student.class, "S001");
        System.out.println(s1);
        Student s2 = session.get(Student.class, "S002");
        System.out.println(s2);

        //Person
        Person p1 = session.get(Person.class, "P001");
        System.out.println(p1);
        Person p2= session.get(Person.class, "P002");
        System.out.println(p2);

        //Passport
        Passport ps1 = session.get(Passport.class, "PS001");
        System.out.println(ps1);
        Passport ps2 = session.get(Passport.class, "PS002");
        System.out.println(ps2);


        transaction.commit();
        session.close();
    }
}
