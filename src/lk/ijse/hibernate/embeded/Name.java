package lk.ijse.hibernate.embeded;

import javax.persistence.Embeddable;

/**
 * @Created By Ravindu Prathibha
 * @created 2/13/2024 - 12:03 PM
 * @project Hibernate
 */

@Embeddable
public class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name(String fName, String mName, String lName) {
        this.setfName(fName);
        this.setmName(mName);
        this.setlName(lName);
    }

    public Name() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
