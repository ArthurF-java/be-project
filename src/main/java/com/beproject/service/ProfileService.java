package com.beproject.service;

import com.beproject.data.profile.ProfileCreateRequestDto;
import com.beproject.data.profile.ProfileResponse;
import java.util.List;

public interface ProfileService {
    List<ProfileResponse> getAll();

    void create(ProfileCreateRequestDto dto);

    void deleteAll();
}
