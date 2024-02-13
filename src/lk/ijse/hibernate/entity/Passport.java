package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 2:38 PM
 * @project Hibernate
 */
@Entity
public class Passport {
    @Id
    private String psId;
    private double fee;
    @OneToOne
    private Person person;

    public Passport() {
    }

    public Passport(String psId, double fee, Person person) {
        this.setPsId(psId);
        this.setFee(fee);
        this.setPerson(person);
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "psId='" + psId + '\'' +
                ", fee=" + fee +
                ", person=" + person +
                '}';
    }
}
