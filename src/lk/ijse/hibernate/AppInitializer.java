package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 2/12/2024 - 5:10 PM
 * @project Hibernate
 */
public class AppInitializer {
    public static void main(String[] args) {

       /* //Customer
        Customer customer = new Customer();

        customer.setId("C001");
        customer.setName("Ravindu");
        customer.setAddress("Bandaragama");
        customer.setSalary(500000);

        customer.setId("C002");
        customer.setName("Prathibha");
        customer.setAddress("Kadawtha");
        customer.setSalary(1000000);
*/


/*
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


        //Lecturer
        Lecturer l1 = new Lecturer();
        l1.setlId("L-001");
        l1.setlName("Ravindu");

        Lecturer l2 = new Lecturer();
        l2.setlId("L-002");
        l2.setlName("Prathibha");

        Lecturer l3 = new Lecturer();
        l3.setlId("L-003");
        l3.setlName("Buli");

        //Subject
        Subject su1 = new Subject();
        su1.setsId("S-001");
        su1.setsName("Java");

        Subject su2 = new Subject();
        su2.setsId("S-002");
        su2.setsName("C#");

        Subject su3 = new Subject();
        su3.setsId("S-003");
        su3.setsName("Hibernate");


        //Lecturer List
        l1.getSubjectList().add(su1);
        l2.getSubjectList().add(su2);
        l3.getSubjectList().add(su3);
        l3.getSubjectList().add(su2);


        //Subject List
        su1.getLecturerList().add(l1);
        su2.getLecturerList().add(l2);
        su3.getLecturerList().add(l3);*/



        //First Level Caching Start
        Customer customer2 = new Customer();

        customer2.setId("C003");
        customer2.setName("Buli");
        customer2.setAddress("Walgama");
        customer2.setSalary(800000);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(customer2);
        session.update(customer2);

        Customer c1 = session.get(Customer.class,  "C001");
        System.out.println(c1);

        Customer c2 = session.get(Customer.class,  "C001");
        System.out.println(c2);

        //First Level Caching End



        //session.save(customer);
       // session.save(customer1);
        //session.save(student);
        //session.save(person);
        //session.save(passport);
        //session.save(owner);
        //session.save(pet1);
        //session.save(pet2);
        //session.save(l1);
        //session.save(l2);
        //session.save(l3);
        //session.save(su1);
        //session.save(su2);
        //session.save(su3);


      /*  session.update(customer);
        session.update(student);
        session.update(person);
        session.update(passport);
        session.update(owner);
        session.update(pet1);
        session.update(pet2);
        session.update(l1);
        session.update(l2);
        session.update(l3);
        session.update(su1);
        session.update(su2);
        session.update(su3);
*/


      /*  //Customer
        Customer c1 = session.get(Customer.class,  "C001");
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

*/

       /* Owner o1 = session.get(Owner.class, "O-001");
        System.out.println(o1);
        System.out.println(o1.getoId());
        System.out.println(o1.getName());
        System.out.println(o1.getPetList());*/



        // get () Method VS load () Method

     /*   //get () -->>> Eager Fetching
        Owner o1 = session.get(Owner.class, "O-001");
        System.out.println(o1.getoId()); // --->> Execute Query
        System.out.println(o1.getName()); // --->> Execute Query

        //load () -->>> Lazy Fetching
        Owner o2 = session.load(Owner.class, "O-001");
        System.out.println(o2.getoId()); // --->> Not Execute Query
        System.out.println(o2.getName()); // --->> Execute Query*/



       /* //HQL -->>> Select Query
        String hql = "FROM Customer";
        Query query = session.createQuery(hql);
        List<Customer>list = query.list();

        for (Customer cus : list) {
            System.out.println(cus.getId());
            System.out.println(cus.getName());
            System.out.println(cus.getAddress());
            System.out.println(cus.getSalary());
        } */

       /* //HQL -->>> Select Specified Column Query
        String hql = "SELECT name FROM Customer";
        Query query = session.createQuery(hql);
        List<String>list = query.list();

        for (String name : list) {
            System.out.println(name);

        }*/

     /*    //HQL -->>> Using WHERE Clause Query
        String hql = "FROM Customer c WHERE name LIKE 'Pr%' ";
        Query query = session.createQuery(hql);
        List<Customer>list = query.list();

        for (Customer c : list) {
            System.out.println(c.getId());
            System.out.println(c.getName());
        }*/


     /*   //HQL -->>> Using ORDER BY Clause Query -->> Descending Order
        String hql = "FROM Customer c ORDER BY c.id DESC";
        Query query = session.createQuery(hql);
        List<Customer>list = query.list();

        for (Customer c : list) {
            System.out.println(c.getId());
            System.out.println(c.getName());
        }


        //HQL -->>> Using ORDER BY Clause Query -->> Ascending Order
        String hql = "FROM Customer c ORDER BY c.id ASC";
        Query query = session.createQuery(hql);
        List<Customer>list = query.list();

        for (Customer c : list) {
            System.out.println(c.getId());
            System.out.println(c.getName());
        }*/


      /*  //HQL -->>> Using Name Parameters Query
        String name = "Ravindu";
        String hql = "FROM Customer WHERE name = :owner_name";
        Query query = session.createQuery(hql);
        query.setParameter("owner_name",name);
        List<Customer>list = query.list();

        for (Customer c : list) {
            System.out.println(c.getId());
            System.out.println(c.getName());
        }
*/

      /*  //HQL -->>> Update Query
        String id = "C003";
        String name = "Ranger";

        String hql = "UPDATE Customer SET name = :owner_name WHERE id = :owner_id";
        Query query = session.createQuery(hql);
        query.setParameter("owner_id",id);
        query.setParameter("owner_name",name);

        int rowcount=query.executeUpdate();
        if(rowcount>0){
            System.out.println("DONE");
        }else{
            System.out.println("ERROR");
        }*/

/*
          //HQL -->>> Delete Query
        String id = "C003";
        String name = "Ranger";

        String hql = "DELETE FROM Customer WHERE id = :owner_id";
        Query query = session.createQuery(hql);
        query.setParameter("owner_id",id);

        int rowcount=query.executeUpdate();
        if(rowcount>0){
            System.out.println("DONE");
        }else{
            System.out.println("ERROR");
        }*/


     /*   //HQL -->>> Join Query
        String hql = "SELECT o.oId,o.name,p.pId FROM Owner o INNER JOIN Pet p on o.oId = p.owner";
        List <Object[]> result = session.createQuery(hql).list();

        for (Object[] objects : result) {
            System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
        }*/

/*
        //Native SQL
        String sql="SELECT * FROM owner";
        NativeQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(Owner.class);
        List<Owner> result = sqlQuery.list();

        for (Owner owner1 : result) {
            System.out.println(owner1.getoId());
            System.out.println(owner1.getName());
        }*/

        transaction.commit();
        session.close();
    }
}
