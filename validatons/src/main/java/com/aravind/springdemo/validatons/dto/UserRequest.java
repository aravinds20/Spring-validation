package com.aravind.springdemo.validatons.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Builder
public class UserRequest {

    @NotNull(message = "Username should not be null.")
    private String name;

    @Email(message = "Invalid email id.")
    private String email;

    @NotNull
    @Pattern(regexp="\\d{10}$", message = "Invalid mobile number.")
    private String mobile;
    private String Gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;

}
