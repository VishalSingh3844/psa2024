package com.crm.payload;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(min = 3, message = "At least 3 chars required")
    private String name;

    @Email
    private String emailId;

    @Size(min = 10, max = 10, message = "Mobile should be 10 digits")
    private String mobile;

}
