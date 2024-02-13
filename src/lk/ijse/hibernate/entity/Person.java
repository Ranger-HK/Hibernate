package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 2:38 PM
 * @project Hibernate
 */
@Entity
public class Person {
    @Id
    private String id;
    private String name;

    public Person(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

}
