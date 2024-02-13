package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 11:48 AM
 * @project Hibernate
 */

@Entity(name = "Student_Details")
public class Student {
    @Id
    @Column(name = "studentId")
    private String id;
    @Embedded
    private Name name;
    private String address;
    @CreationTimestamp
    private Date date;

    public Student(String id, Name name, String address, Date date) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setDate(date);
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
