package com.dk.staj.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private int age;
    private String card;
    private String card_type;
    private String license;
    private String gender;
    private String education;
    @ManyToOne
    @JoinColumn(name = "household_id")
    private Household household;


}
