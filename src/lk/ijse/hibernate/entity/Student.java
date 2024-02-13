package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
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
    private String name;
    private String address;
    @CreationTimestamp
    private Date date;

    public Student(String id, String name, String address, Date date) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
