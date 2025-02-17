package com.beproject.controller;


import com.beproject.data.varsion.VersionResponse;
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
    public ResponseEntity<VersionResponse> getVersion() {
        return ResponseEntity.ok(new VersionResponse("3.0.1"));
    }
}
