package com.example.Register_Login.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerDTO {

    private int registerid;
    private String registername;
    private String email;
    private String password;

    public CustomerDTO(int registerid, String registername, String email, String password) {
        this.registerid = registerid;
        this.registername = registername;
        this.email = email;
        this.password = password;
    }

    public CustomerDTO() {
    }

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
        return "CustomerDTO{" +
                "registerid=" + registerid +
                ", registername='" + registername + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
