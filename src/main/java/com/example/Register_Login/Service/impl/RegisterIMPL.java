package com.example.Register_Login.Service.impl;

import com.example.Register_Login.DTO.CustomerDTO;
import com.example.Register_Login.DTO.LoginDTO;
import com.example.Register_Login.Entity.Register;
import com.example.Register_Login.Repo.RegisterRepo;
import com.example.Register_Login.Response.LoginResponse;
import com.example.Register_Login.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class RegisterIMPL implements RegisterService {

    @Autowired
    private RegisterRepo registerRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addRegister(CustomerDTO customerDTO) {
        Register register = new Register(

                customerDTO.getRegisterid(),
                customerDTO.getRegistername(),
                customerDTO.getEmail(),

                this.passwordEncoder.encode(customerDTO.getPassword())
        );
        registerRepo.save(register);

        return register.getRegistername();
    }

    @Override
    public LoginResponse loginCustomer(LoginDTO loginDTO) {
       String msg = "";
       Register register1 = registerRepo.findByEmail(loginDTO.getEmail());
       if(register1 != null){
           String password = loginDTO.getPassword();
           String encodedPassword = register1.getPassword();
           Boolean isPwdRight = passwordEncoder.matches(password,encodedPassword);
           if (isPwdRight){
               Optional<Register> register = registerRepo.findOneByEmailandPassword(loginDTO.getEmail(), encodedPassword);
               if (register.isPresent()) {
                   return new LoginResponse("Login Success", true);
               } else {
                   return new LoginResponse("Login Failed", false);
               }
           } else {
               return new LoginResponse("password Not Match", false);
           }
       }else {
           return new LoginResponse("Email not exits", false);
       }
           }
       }

