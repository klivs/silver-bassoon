package com.example.demo.entity;

import lombok.*;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private UUID uuid;


}
