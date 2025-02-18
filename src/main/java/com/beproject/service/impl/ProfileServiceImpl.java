package com.beproject.service.impl;

import com.beproject.dao.entity.ProfileEntity;
import com.beproject.dao.repository.ProfileRepository;
import com.beproject.data.profile.ProfileCreateRequestDto;
import com.beproject.data.profile.ProfileResponse;
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
    public void create(ProfileCreateRequestDto dto) {
        ProfileEntity entity = ProfileEntity.builder()
                .name(dto.name())
                .surname(dto.surname()).build();
        profileRepository.save(entity);
    }

    @Override
    public void deleteAll() {
        profileRepository.deleteAll();
    }
}
