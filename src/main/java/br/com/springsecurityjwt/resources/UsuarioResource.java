package br.com.springsecurityjwt.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<?> helloEndpoint() {
        return ResponseEntity.ok("Hello World!");
    }
}
