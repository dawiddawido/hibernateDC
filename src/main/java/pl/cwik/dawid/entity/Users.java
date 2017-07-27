package pl.cwik.dawid.entity;

import javax.persistence.*;

/**
 * Created by mc111364 on 2017-07-27.
 */
@Entity
@Table(name = "users", schema = "cas_members")
public class Users {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name="pk")
    private Long pk;

    @Column(name = "email")
    private  String email;

    private String password;
    private String firstname;
    private String surname;
    private String phone;
    private int role;
    private String lat_lng;


    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getLat_lng() {
        return lat_lng;
    }

    public void setLat_lng(String lat_lng) {
        this.lat_lng = lat_lng;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Users{");
        sb.append("pk=").append(pk);
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", role=").append(role);
        sb.append(", lat_lng='").append(lat_lng).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
