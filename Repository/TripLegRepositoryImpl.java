package com.dk.staj.Repository;

import com.dk.staj.Entity.TripLeg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TripLegRepositoryImpl {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TripLegRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<TripLeg> findTripLegsByHouseholdId(String hhId) {
        return null;
    }

}

