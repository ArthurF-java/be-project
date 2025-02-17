package com.beproject.data.profile;

import java.util.UUID;

public record ProfileResponse(UUID id, String name, String surname) {
}
