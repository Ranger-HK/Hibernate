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
public class Lecturer {
    @Id
    private String lId;
    private String lName;

    @ManyToMany
    private List<Subject> subjectList=new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(String lId, String lName, List<Subject> subjectList) {
        this.setlId(lId);
        this.setlName(lName);
        this.setSubjectList(subjectList);
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lId='" + lId + '\'' +
                ", lName='" + lName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
