package com.dk.staj.Repository;

import com.dk.staj.Entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfileRepositoryImpl {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProfileRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   public List<Profile> findByHouseholdId(String hhId) {
        return null;
    }
}

