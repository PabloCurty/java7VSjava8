package Model;

import javax.persistence.*;

@Table
@Entity
public class ClientPhone {
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String areaCode;
    @Column
    private String tel;

    public ClientPhone(String name, String areaCode, String tel) {
        this.name = name;
        this.areaCode = areaCode;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getTel() {
        return tel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString(){
        return "[name=" + name + ", tel=(" + areaCode + ") " + tel + "]";
    }
}
