package com.actividad2.apiandres.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/")
    public String home() {
        return "Fin de la actividad 2 de Arquitecturas en la nube";
    }

    @GetMapping("/api/estado")
    public Map<String, Object> estado() {
        return Map.of(
                "estado", "OK",
                "nombre", "apiandres",
                "mensaje", "Servicio activo y desplegable"
        );
    }
}
