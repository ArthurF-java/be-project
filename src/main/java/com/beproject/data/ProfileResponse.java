package com.beproject.data;

import java.util.UUID;

public record ProfileResponse(UUID id, String name, String surname) {
}
