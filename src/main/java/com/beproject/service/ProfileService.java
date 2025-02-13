package com.beproject.service;

import com.beproject.data.ProfileResponse;
import java.util.List;

public interface ProfileService {
    List<ProfileResponse> getAll();

    void create(String name, String surname);
}
