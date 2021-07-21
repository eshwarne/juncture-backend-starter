package com.juncture.backend.models.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CreatePlayerRequest {
    @NotNull
    @Min(value = 2, message = "Name should be minimum of 2 characters")
    private String name;
    @NotNull(message = "Your date of birth cannot be empty")
    private String dateOfBirth;

    public CreatePlayerRequest(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
