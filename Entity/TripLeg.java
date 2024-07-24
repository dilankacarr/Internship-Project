package com.dk.staj.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class TripLeg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String t_legId;
    private String start_time;
    private String vehicle_time;
    private String dep_time;
    private String end_time;
    private String destination;
    private String distance;
    private String location;
    private String purpose;
    private String mode;
    @ManyToOne
    @JoinColumn(name = "household_id")
    private Household household;
    private String hhId;
    private String profileId;

}
