package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 5:25 PM
 * @project Hibernate
 */
@Entity
public class Pet {
    @Id
    private
    String pId;
    private String pName;

    @ManyToOne
    private Owner owner;

    public Pet(String pId, String pName, Owner owner) {
        this.setpId(pId);
        this.setpName(pName);
        this.setOwner(owner);
    }

    public Pet() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
