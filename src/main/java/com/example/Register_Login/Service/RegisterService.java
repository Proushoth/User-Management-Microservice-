package com.example.Register_Login.Service;


import com.example.Register_Login.DTO.CustomerDTO;
import com.example.Register_Login.DTO.LoginDTO;
import com.example.Register_Login.Response.LoginResponse;
//import org.springframework.context.annotation.Bean;

public interface RegisterService {

    String addRegister(CustomerDTO customerDTO);

    LoginResponse loginCustomer(LoginDTO loginDTO);
}
