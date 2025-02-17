package com.beproject.controller;

import com.beproject.data.profile.ProfileCreateRequestDto;
import com.beproject.data.profile.ProfileResponse;
import com.beproject.service.ProfileService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping()
    public ResponseEntity<List<ProfileResponse>> getAll() {
        return ResponseEntity.ok(profileService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProfileCreateRequestDto dto) {
        profileService.create(dto);
        return ResponseEntity.ok().build();
    }
}
