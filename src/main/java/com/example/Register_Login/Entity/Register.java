package com.example.Register_Login.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Register {

    @Id
    @Column(name = "Customer_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registerid;

    @Column(name = "Customer_name")
    private String registername;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    public Register(int registerid, String registername, String email, String password) {
        this.registerid = registerid;
        this.registername = registername;
        this.email = email;
        this.password = password;
    }

    public Register() {
    }                                       //null constructor


    public int getRegisterid() {
        return registerid;
    }

    public void setRegisterid(int registerid) {
        this.registerid = registerid;
    }

    public String getRegistername() {
        return registername;
    }

    public void setRegistername(String registername) {
        this.registername = registername;
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

    @Override
    public String toString() {
        return "Register{" +
                "registerid=" + registerid +
                ", registername='" + registername + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
