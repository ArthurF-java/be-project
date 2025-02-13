package com.beproject.service.impl;

import com.beproject.dao.entity.ProfileEntity;
import com.beproject.dao.repository.ProfileRepository;
import com.beproject.data.ProfileResponse;
import com.beproject.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public List<ProfileResponse> getAll() {
        List<ProfileEntity> profiles = profileRepository.findAll();

        return profiles.stream().map(profile -> new ProfileResponse(profile.getId(), profile.getName(), profile.getSurname())).toList();
    }

    @Override
    public void create(String name, String surname) {
        ProfileEntity entity = ProfileEntity.builder()
                .name(name)
                .surname(surname).build();
        profileRepository.save(entity);
    }
}
