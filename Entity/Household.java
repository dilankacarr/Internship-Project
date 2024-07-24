package com.dk.staj.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
  public class Household {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String district;
    private String neighborhood;
    private String street;
    private String inside_no;
    private String outside_no;
    private String h_type;
  @ManyToOne
  @JoinColumn(name = "household_id")
  private Household household;
    private String host_type;
    private double income;

}
