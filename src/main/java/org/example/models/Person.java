package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Person {

    private Integer personId;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 3, max = 30, message = "Name should be between 2 and 30 characters")
    private String fullName;

    @Min(value = 0, message = "Age should be greater than 0")
    private Integer yearOfBirth;

    public Person() {
    }

    public Person(String fullName, int ageOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = ageOfBirth;
    }
}
