package com.example.Register_Login.RegisterController;

import com.example.Register_Login.DTO.CustomerDTO;
import com.example.Register_Login.DTO.LoginDTO;
import com.example.Register_Login.Response.LoginResponse;
import com.example.Register_Login.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping(path = "/save")
    public String  saveRegister(@RequestBody CustomerDTO customerDTO){
        String id = registerService.addRegister(customerDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?>loginCustomer(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse = registerService.loginCustomer(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }







}
