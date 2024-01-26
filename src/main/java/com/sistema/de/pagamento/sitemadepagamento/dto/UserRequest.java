package com.sistema.de.pagamento.sitemadepagamento.dto;

import com.sistema.de.pagamento.sitemadepagamento.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @NotNull(message = "O nome nao pode ser nulo")
        @NotBlank(message = "O nome nao pode ser vazio")
        String name,
        @Email
        @NotNull(message = "O email nao pode ser nulo")
        @NotBlank(message = "O email nao pode ser vazio")
        String email,
        @NotNull(message = "O nome nao pode ser nulo")
        @NotBlank(message = "O nome nao pode ser vazio")
        @Size(min = 8, message = "A senha deve conter no minimo 8 caracteres")
        String password) {
    public User toModel() {
        return new User(name,email,password);
    }
}
