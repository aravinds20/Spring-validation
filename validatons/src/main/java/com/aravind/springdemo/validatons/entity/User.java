package com.aravind.springdemo.validatons.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String Gender;
    private int age;
    private String nationality;

}
