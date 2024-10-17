package org.example.Interface;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
