package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 5:25 PM
 * @project Hibernate
 */
@Entity
public class Owner {
    @Id
    private String oId;
    private String name;

    //EAGER FETCHING
    /*@OneToMany(mappedBy = "owner" , fetch = FetchType.EAGER)
    private List<Pet>petList=new ArrayList<>();*/

    //LAZY FETCHING
    @OneToMany(mappedBy = "owner")
    private List<Pet>petList=new ArrayList<>();

    public Owner(String oId, String name, List<Pet> petList) {
        this.setoId(oId);
        this.setName(name);
        this.setPetList(petList);
    }

    public Owner() {
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
