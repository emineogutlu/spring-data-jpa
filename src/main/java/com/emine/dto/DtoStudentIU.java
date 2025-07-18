package com.emine.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DtoStudentIU {
    @NotEmpty(message = "First name cannot be left empty.")
    @Min(value=3,message="Please enter at least 3 characters.")
    @Max(value=10, message ="First name must be at most 10 characters long.")
    private String firstName;
    @Size(min=3, max=30)
    private String lastName;
    private Date birthOfDate;
}
