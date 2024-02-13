package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 7:18 PM
 * @project Hibernate
 */
@Entity
public class Subject {
    @Id
    private String sId;
    private String sName;

    @ManyToMany(mappedBy = "subjectList")
    private List<Lecturer>lecturerList=new ArrayList<>();

    public Subject() {
    }

    public Subject(String sId, String sName, List<Lecturer> lecturerList) {
        this.setsId(sId);
        this.setsName(sName);
        this.setLecturerList(lecturerList);
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(List<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", lecturerList=" + lecturerList +
                '}';
    }
}
