package com.example.RollyTest1.Controller;

import com.example.RollyTest1.S3.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class S3Controller {
    private final S3Service s3Service;

    @GetMapping("/CoffeeImage")
    public ResponseEntity<String> hello(){
        String coffee = s3Service.getThumbnailPath("coffee.png");
        return ResponseEntity.ok(coffee);
    }
}
