package com.ordermanagement.authservice.controller;

import com.ordermanagement.authservice.dto.LoginRequestDTO;
import com.ordermanagement.authservice.dto.RegisterRequestDTO;
import com.ordermanagement.authservice.dto.AuthResponseDTO;
import com.ordermanagement.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/api/auth") // Prefijo de URL para todos los endpoints de autenticación
public class AuthController {

    @Autowired
    private AuthService authService; // Inyección del servicio de autenticación

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody RegisterRequestDTO request) {
        AuthResponseDTO response = authService.register(request);
        return ResponseEntity.ok(response);
    }

    // Endpoint para iniciar sesión
    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO request) {
        AuthResponseDTO response = authService.login(request);
        return ResponseEntity.ok(response);
    }
}
