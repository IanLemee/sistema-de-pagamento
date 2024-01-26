package com.sistema.de.pagamento.sitemadepagamento.controller;

import com.sistema.de.pagamento.sitemadepagamento.dto.UserRequest;
import com.sistema.de.pagamento.sitemadepagamento.dto.UserResponse;
import com.sistema.de.pagamento.sitemadepagamento.entity.User;
import com.sistema.de.pagamento.sitemadepagamento.service.UserService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserResponse> registerUser(@RequestBody @Valid UserRequest userRequest) throws MessagingException, UnsupportedEncodingException {
        User user = userRequest.toModel();
        UserResponse userSaved = service.registerUser(user);
        return ResponseEntity.ok().body(userSaved);
    }

    @GetMapping("/verify")
    public String verifyUser(@Param("code") String code) {
        if(service.verify(code)) {
            return "verify_sucess";
        }
        else {
            return "verify_fail";
        }
    }
}
