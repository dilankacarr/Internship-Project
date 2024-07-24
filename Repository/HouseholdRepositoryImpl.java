package com.dk.staj.Repository;
import com.dk.staj.Entity.Household;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HouseholdRepositoryImpl {

    private final JdbcTemplate jdbcTemplate;

   public HouseholdRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Household getHouseholdById(String hhId) {

       String sql = "SELECT * FROM household WHERE id = '***************'";
       return jdbcTemplate.queryForObject(sql, new Object[]{hhId}, (rs, rowNum) -> {

            Household household = new Household();
            return household;
        });
    }

}

