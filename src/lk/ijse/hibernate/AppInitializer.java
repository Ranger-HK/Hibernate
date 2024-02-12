package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;

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

        //save(customer);
    }
}
