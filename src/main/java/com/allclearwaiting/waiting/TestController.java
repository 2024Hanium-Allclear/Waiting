package com.allclearwaiting.waiting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health2")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("waiting-health");
    }
}
