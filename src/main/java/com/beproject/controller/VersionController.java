package com.beproject.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping()
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok("1.6");
    }
}
