package com.beproject.controller;

import com.beproject.data.ProfileResponse;
import com.beproject.service.ProfileService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping()
    public ResponseEntity<List<ProfileResponse>> getAll() {
        return ResponseEntity.ok(profileService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestParam String name, @RequestParam String surname) {
        profileService.create(name, surname);
        return ResponseEntity.ok().build();
    }
}
